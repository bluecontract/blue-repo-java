package blue.repo;

import blue.language.codec.jackson.UncheckedObjectMapper;
import blue.language.identity.DirectBlueIdCalculator;
import blue.language.model.Node;
import blue.language.provider.VerifyingNodeProvider;
import blue.repo.provider.RepositoryNodeProvider;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.erdtman.jcs.JsonCanonicalizer;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

final class InlineProviderDefinitionsTest {
    @Test
    void servesAuthenticatedInlineContentWithoutCreatingNamedTypes() throws Exception {
        ObjectNode content = definition();
        String id = id(content);
        Fixture fixture = fixture(entries(id, content));
        RepositoryNodeProvider provider = fixture.provider();
        assertEquals(0, provider.definitions().size());
        Node fetched = new VerifyingNodeProvider(provider).fetchByBlueId(id).get(0);
        assertTrue(fetched.getProperties().containsKey("field"));
        fetched.getProperties().clear();
        assertTrue(provider.fetchByBlueId(id).get(0).getProperties().containsKey("field"));
        assertNull(provider.fetchByBlueId(id(UncheckedObjectMapper.JSON_MAPPER.createObjectNode().put("name", "Absent"))));
    }

    @Test
    void rejectsTamperedPackagedBytes() throws Exception {
        Fixture fixture = fixture(entries(id(definition()), definition()));
        fixture.bytes = "{}".getBytes(StandardCharsets.UTF_8);
        assertThrows(IllegalStateException.class, fixture::provider);
    }

    @Test
    void rejectsWrongContentEvenWhenOuterBundleAndManifestAgree() throws Exception {
        ObjectNode original = definition();
        ObjectNode wrong = definition().put("name", "Different");
        Fixture fixture = fixture(entries(id(original), wrong));
        assertThrows(IllegalStateException.class, fixture::provider);
    }

    @Test
    void rejectsSelfReferenceAsInlineMaterialization() throws Exception {
        String id = id(definition());
        Fixture fixture = fixture(entries(id, UncheckedObjectMapper.JSON_MAPPER.createObjectNode().put("blueId", id)));
        IllegalStateException error = assertThrows(IllegalStateException.class, fixture::provider);
        assertTrue(error.getMessage().contains("materialized content"));
    }

    @Test
    void rejectsMalformedInlineList() throws Exception {
        Fixture fixture = fixture(UncheckedObjectMapper.JSON_MAPPER.createObjectNode());
        assertThrows(IllegalStateException.class, fixture::provider);
    }

    @Test
    void rejectsConflictingDuplicateIdentity() throws Exception {
        ObjectNode original = definition();
        ArrayNode entries = entries(id(original), original);
        entries.add(entries(id(original), definition().put("name", "Different")).get(0));
        Fixture fixture = fixture(entries);
        assertThrows(IllegalStateException.class, fixture::provider);
    }

    @Test
    void supportsSyntheticManifestWithoutProviderAdjunct() throws Exception {
        Map<String, Object> manifest = baseManifest();
        RepositoryNodeProvider provider = new RepositoryNodeProvider(RepositoryManifest.fromMap(manifest));
        assertTrue(provider.definitions().isEmpty());
    }

    private static ObjectNode definition() {
        ObjectNode content = UncheckedObjectMapper.JSON_MAPPER.createObjectNode().put("name", "Inline Record");
        content.set("field", UncheckedObjectMapper.JSON_MAPPER.createObjectNode());
        return content;
    }

    private static String id(JsonNode content) {
        return DirectBlueIdCalculator.calculateBlueId(UncheckedObjectMapper.JSON_MAPPER.convertValue(content, Node.class));
    }

    private static ArrayNode entries(String id, JsonNode content) {
        ObjectNode entry = UncheckedObjectMapper.JSON_MAPPER.createObjectNode().put("blueId", id);
        entry.set("content", content);
        return UncheckedObjectMapper.JSON_MAPPER.createArrayNode().add(entry);
    }

    private static Map<String, Object> baseManifest() {
        Map<String, Object> manifest = new LinkedHashMap<>();
        manifest.put("repositoryName", "Inline Test Repository");
        manifest.put("repositoryVersion", "test");
        manifest.put("repositoryVersionBlueId", id(definition()));
        manifest.put("registryPackageIdentities", Collections.emptyMap());
        manifest.put("sourceResource", "unused.blue");
        manifest.put("definitions", Collections.emptyList());
        return manifest;
    }

    private static Fixture fixture(JsonNode entries) throws Exception {
        Map<String, Object> manifest = baseManifest();
        ObjectNode bundle = UncheckedObjectMapper.JSON_MAPPER.createObjectNode();
        bundle.put("formatVersion", 1).put("repositoryBlueId", (String) manifest.get("repositoryVersionBlueId"));
        bundle.set("registryPackageIdentities", UncheckedObjectMapper.JSON_MAPPER.createObjectNode());
        bundle.set("entries", UncheckedObjectMapper.JSON_MAPPER.createArrayNode());
        bundle.set("inlineTypeDefinitions", entries);
        bundle.putNull("providerBundleIdentity");
        String identity = "sha256:" + sha256(new JsonCanonicalizer(bundle.toString()).getEncodedUTF8());
        bundle.put("providerBundleIdentity", identity);
        byte[] bytes = bundle.toString().getBytes(StandardCharsets.UTF_8);
        manifest.put("providerBundleIdentity", identity);
        manifest.put("providerSourceResource", "inline-provider.json");
        manifest.put("providerSourceSha256", sha256(bytes));
        return new Fixture(RepositoryManifest.fromMap(manifest), bytes);
    }

    private static String sha256(byte[] bytes) throws Exception {
        StringBuilder result = new StringBuilder();
        for (byte value : MessageDigest.getInstance("SHA-256").digest(bytes)) result.append(String.format("%02x", value & 255));
        return result.toString();
    }

    private static final class Fixture {
        private final RepositoryManifest manifest;
        private byte[] bytes;
        private Fixture(RepositoryManifest manifest, byte[] bytes) { this.manifest = manifest; this.bytes = bytes; }
        private RepositoryNodeProvider provider() {
            return new RepositoryNodeProvider(manifest, new ClassLoader(getClass().getClassLoader()) {
                @Override public InputStream getResourceAsStream(String name) {
                    return "inline-provider.json".equals(name) ? new ByteArrayInputStream(bytes) : super.getResourceAsStream(name);
                }
            });
        }
    }
}
