package blue.repo;

import blue.language.Blue;
import blue.language.dictionary.ExportContext;
import blue.language.model.Node;
import blue.language.utils.UncheckedObjectMapper;
import blue.repo.provider.RepositoryNodeProvider;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryHistoricalVersionTest {
    private static final String TEXT_BLUE_ID = "GX7CFUmSDrE2MzptunLCCdZwnuwwrenRQqEnHL4x3uoC";

    @Test
    void manifestKeepsCanonicalTypeVersionsWithoutCompatibilityAliases() {
        RepositoryManifest manifest = syntheticManifest();

        assertEquals(3, manifest.repositoryVersions().size());
        assertEquals("repo-v1", manifest.repositoryVersionByVersion("1.0.0")
                .orElseThrow(AssertionError::new)
                .repositoryBlueId());
        assertEquals("1.3.0", manifest.repositoryVersionByBlueId("repo-v3")
                .orElseThrow(AssertionError::new)
                .version());

        RepositoryDefinition operation = manifest.definitionByAnyBlueId("op-v1").orElseThrow(AssertionError::new);
        assertEquals("op-v3", operation.blueId());
        assertFalse(manifest.currentBlueIdFor("op-v1").isPresent());
        assertFalse(manifest.currentBlueIdFor("op-v2").isPresent());
        assertEquals("op-v3", manifest.currentBlueIdFor("op-v3").orElse(null));
        assertFalse(manifest.blueIdFor("op-v3", "repo-v1").isPresent());
        assertFalse(manifest.blueIdFor("op-v3", "repo-v2").isPresent());
        assertEquals("op-v3", manifest.blueIdFor("op-v3", "repo-v3").orElse(null));
        assertEquals("incompatible-v3", manifest.currentBlueIdFor("incompatible-v3").orElse(null));
        assertFalse(manifest.currentBlueIdFor("incompatible-v1").isPresent());
        assertFalse(manifest.blueIdFor("incompatible-v3", "repo-v1").isPresent());

        assertEquals("new-v3", manifest.currentBlueIdFor("new-v3").orElse(null));
        assertFalse(manifest.blueIdFor("new-v3", "repo-v2").isPresent());
        assertFalse(manifest.blueIdFor("op-v3", "unknown-repo").isPresent());
        assertFalse(manifest.currentBlueIdFor("unknown-type").isPresent());
    }

    @Test
    void dictionaryUsesCurrentCanonicalTypeIdsOnly() {
        RepositoryTypeDictionary dictionary = syntheticDictionary();

        assertTrue(dictionary.dictionaryBlueIds().containsAll(Arrays.asList("repo-v1", "repo-v2", "repo-v3")));
        assertFalse(dictionary.currentBlueId("op-v1").isPresent());
        assertFalse(dictionary.currentBlueId("op-v2").isPresent());
        assertEquals("op-v3", dictionary.currentBlueId("op-v3").orElse(null));
        assertFalse(dictionary.currentBlueId("incompatible-v1").isPresent());
        assertFalse(dictionary.typeBlueIdFor("op-v3", "repo-v1").isPresent());
        assertFalse(dictionary.typeBlueIdFor("op-v3", "repo-v2").isPresent());
        assertEquals("op-v3", dictionary.typeBlueIdFor("op-v3", "repo-v3").orElse(null));
        assertFalse(dictionary.typeBlueIdFor("incompatible-v3", "repo-v1").isPresent());
        assertFalse(dictionary.typeBlueIdFor("new-v3", "repo-v2").isPresent());
        assertFalse(dictionary.typeBlueIdFor("op-v3", "unknown-repo").isPresent());
    }

    @Test
    void repositoryNodeProviderDoesNotServeCurrentContentForHistoricalBlueIds() {
        RepositoryManifest manifest = syntheticManifest();
        RepositoryNodeProvider provider = new RepositoryNodeProvider(manifest, syntheticClassLoader());

        Node current = provider.fetchFirstByBlueId("op-v3");

        assertNotNull(current);
        assertEquals("Operation", current.getName());
        assertNull(provider.fetchFirstByBlueId("op-v1"));
        assertFalse(provider.definitionByBlueId("op-v1").isPresent());
        assertFalse(manifest.currentBlueIdFor("op-v1").isPresent());
    }

    @Test
    void exportWithOlderDictionaryContextInlinesChangedHistoricalType() {
        Blue blue = new Blue().registerTypeDictionary(syntheticDictionary());
        ExportContext context = ExportContext.builder()
                .dictionary(BlueRepository.DICTIONARY_NAME, "repo-v1")
                .build();

        Node exported = blue.exportNode(new Node().type(new Node().blueId("op-v3")), context);

        assertNotNull(exported.getType());
        assertNull(exported.getType().getBlueId());
        assertEquals("Operation", exported.getType().getName());
        assertNotNull(exported.getType().getProperties().get("extra"));
    }

    @Test
    void exportWithOlderDictionaryContextInlinesTypesThatDidNotExistYet() {
        Blue blue = new Blue().registerTypeDictionary(syntheticDictionary());
        ExportContext context = ExportContext.builder()
                .dictionary(BlueRepository.DICTIONARY_NAME, "repo-v2")
                .build();

        Node exported = blue.exportNode(new Node().type(new Node().blueId("new-v3")), context);

        assertNotNull(exported.getType());
        assertNull(exported.getType().getBlueId());
        assertEquals("New Type", exported.getType().getName());
        assertNotNull(exported.getType().getProperties().get("amount"));
    }

    @Test
    void exportWithOlderDictionaryContextInlinesIncompatibleHistoricalType() {
        Blue blue = new Blue().registerTypeDictionary(syntheticDictionary());
        ExportContext context = ExportContext.builder()
                .dictionary(BlueRepository.DICTIONARY_NAME, "repo-v1")
                .build();

        Node exported = blue.exportNode(new Node().type(new Node().blueId("incompatible-v3")), context);

        assertNotNull(exported.getType());
        assertNull(exported.getType().getBlueId());
        assertEquals("Incompatible History", exported.getType().getName());
        assertNotNull(exported.getType().getProperties().get("currentField"));
    }

    @Test
    void strictExportWithOlderDictionaryContextThrowsForTypesThatDidNotExistYet() {
        Blue blue = new Blue().registerTypeDictionary(syntheticDictionary());
        ExportContext context = ExportContext.builder()
                .dictionary(BlueRepository.DICTIONARY_NAME, "repo-v2")
                .inlineUnsupportedTypes(false)
                .build();

        assertThrows(IllegalArgumentException.class,
                () -> blue.exportNode(new Node().type(new Node().blueId("new-v3")), context));
    }

    @Test
    void strictExportWithOlderDictionaryContextThrowsForIncompatibleHistoricalType() {
        Blue blue = new Blue().registerTypeDictionary(syntheticDictionary());
        ExportContext context = ExportContext.builder()
                .dictionary(BlueRepository.DICTIONARY_NAME, "repo-v1")
                .inlineUnsupportedTypes(false)
                .build();

        assertThrows(IllegalArgumentException.class,
                () -> blue.exportNode(new Node().type(new Node().blueId("incompatible-v3")), context));
    }

    @Test
    void generatorCopiesCanonicalBundleAndUsesCurrentCanonicalTypeBlueIdOnly() throws Exception {
        Path temp = Files.createTempDirectory("blue-repository-generator-test");
        Path source = temp.resolve("BlueRepository.blue");
        String sourceContent = syntheticBlueRepositorySource();
        Files.write(source, sourceContent.getBytes(StandardCharsets.UTF_8));

        runGenerator(temp, source);

        assertEquals(sourceContent, read(temp.resolve("resources/blue/repo/vtest/BlueRepository.blue")));

        RepositoryManifest generatedManifest = RepositoryManifest.fromMap(
                UncheckedObjectMapper.JSON_MAPPER.readValue(
                        read(temp.resolve("resources/blue/repo/vtest/manifest.json")),
                        Map.class));
        String generatedOperationBlueId = generatedManifest.definitionByQualifiedName("Conversation/Operation")
                .orElseThrow(AssertionError::new)
                .blueId();
        assertEquals("op-v3", generatedOperationBlueId);

        String operation = read(temp.resolve("java/blue/repo/vtest/conversation/Operation.java"));
        assertTrue(operation.contains("@TypeBlueId(\"op-v3\")"));
        assertFalse(operation.contains("@TypeBlueId({"));
        assertFalse(operation.contains("op-v2"));
        assertFalse(operation.contains("op-v1"));

        String incompatible = read(temp.resolve("java/blue/repo/vtest/conversation/IncompatibleHistory.java"));
        assertTrue(incompatible.contains("@TypeBlueId(\"incompatible-v3\")"));
        assertFalse(incompatible.contains("incompatible-v1"));

        String manifest = read(temp.resolve("resources/blue/repo/vtest/manifest.json"));
        assertFalse(manifest.contains("compatible" + "WithCurrent"));
    }

    @Test
    void generatorQualifiesSameNamedParentFromAnotherPackage() throws Exception {
        Path temp = Files.createTempDirectory("blue-repository-same-name-parent-test");
        Path source = temp.resolve("BlueRepository.blue");
        Files.write(source, sameNamedParentSource().getBytes(StandardCharsets.UTF_8));

        runGenerator(temp, source);

        String child = read(temp.resolve("java/blue/repo/vtest/myos/PrincipalActor.java"));
        assertTrue(child.contains(
                "public class PrincipalActor extends blue.repo.vtest.coordination.PrincipalActor"));
        assertFalse(child.contains("import blue.repo.vtest.coordination.PrincipalActor;"));
    }

    private static RepositoryTypeDictionary syntheticDictionary() {
        RepositoryManifest manifest = syntheticManifest();
        return new RepositoryTypeDictionary(manifest, new RepositoryNodeProvider(manifest, syntheticClassLoader()));
    }

    private static RepositoryManifest syntheticManifest() {
        return RepositoryManifest.fromMap(map(
                "repositoryName", "Blue Repository",
                "repositoryVersion", "1.3.0",
                "repositoryVersionBlueId", "repo-v3",
                "sourceResource", "synthetic/BlueRepository.blue",
                "repositoryVersions", Arrays.asList(
                        map("index", 0, "version", "1.0.0", "repositoryBlueId", "repo-v1"),
                        map("index", 1, "version", "1.1.0", "repositoryBlueId", "repo-v2"),
                        map("index", 2, "version", "1.3.0", "repositoryBlueId", "repo-v3")
                ),
                "definitions", Arrays.asList(
                        map(
                                "packageName", "Conversation",
                                "name", "Operation",
                                "qualifiedName", "Conversation/Operation",
                                "blueId", "op-v3",
                                "resourcePath", "synthetic/Operation.json",
                                "status", "stable",
                                "repositoryVersionIndex", 2,
                                "versions", Arrays.asList(
                                        map("repositoryVersionIndex", 0, "typeBlueId", "op-v1",
                                                "attributesAdded", Collections.emptyList()),
                                        map("repositoryVersionIndex", 1, "typeBlueId", "op-v2",
                                                "attributesAdded", Collections.singletonList("/extra")),
                                        map("repositoryVersionIndex", 2, "typeBlueId", "op-v3",
                                                "attributesAdded", Collections.emptyList())
                                )
                        ),
                        map(
                                "packageName", "Conversation",
                                "name", "New Type",
                                "qualifiedName", "Conversation/New Type",
                                "blueId", "new-v3",
                                "resourcePath", "synthetic/NewType.json",
                                "status", "stable",
                                "repositoryVersionIndex", 2,
                                "versions", Collections.singletonList(
                                        map("repositoryVersionIndex", 2, "typeBlueId", "new-v3",
                                                "attributesAdded", Collections.emptyList())
                                )
                        ),
                        map(
                                "packageName", "Conversation",
                                "name", "Incompatible History",
                                "qualifiedName", "Conversation/Incompatible History",
                                "blueId", "incompatible-v3",
                                "resourcePath", "synthetic/IncompatibleHistory.json",
                                "status", "stable",
                                "repositoryVersionIndex", 2,
                                "versions", Arrays.asList(
                                        map("repositoryVersionIndex", 0, "typeBlueId", "incompatible-v1",
                                                "attributesAdded", Collections.singletonList("/removedField")),
                                        map("repositoryVersionIndex", 2, "typeBlueId", "incompatible-v3",
                                                "attributesAdded", Collections.emptyList())
                                )
                        )
                )
        ));
    }

    private static ClassLoader syntheticClassLoader() {
        Map<String, String> resources = new LinkedHashMap<>();
        resources.put("synthetic/Operation.json", "{\"name\":\"Operation\",\"extra\":{\"type\":{\"blueId\":\"" + TEXT_BLUE_ID + "\"}}}");
        resources.put("synthetic/NewType.json", "{\"name\":\"New Type\",\"amount\":{\"type\":{\"blueId\":\"" + TEXT_BLUE_ID + "\"}}}");
        resources.put("synthetic/IncompatibleHistory.json", "{\"name\":\"Incompatible History\",\"currentField\":{\"type\":{\"blueId\":\"" + TEXT_BLUE_ID + "\"}}}");
        return new MemoryClassLoader(resources);
    }

    private static String syntheticBlueRepositorySource() {
        return "name: Blue Repository\n"
                + "packages:\n"
                + "  - name: Conversation\n"
                + "    types:\n"
                + "      - status: stable\n"
                + "        content:\n"
                + "          name: Operation\n"
                + "          extra:\n"
                + "            type:\n"
                + "              blueId: " + TEXT_BLUE_ID + "\n"
                + "        versions:\n"
                + "          - repositoryVersionIndex: 0\n"
                + "            typeBlueId: op-v1\n"
                + "            attributesAdded: []\n"
                + "          - repositoryVersionIndex: 1\n"
                + "            typeBlueId: op-v2\n"
                + "            attributesAdded:\n"
                + "              - /extra\n"
                + "          - repositoryVersionIndex: 2\n"
                + "            typeBlueId: op-v3\n"
                + "            attributesAdded: []\n"
                + "      - status: stable\n"
                + "        content:\n"
                + "          name: Incompatible History\n"
                + "        versions:\n"
                + "          - repositoryVersionIndex: 0\n"
                + "            typeBlueId: incompatible-v1\n"
                + "            attributesAdded:\n"
                + "              - /removedField\n"
                + "          - repositoryVersionIndex: 2\n"
                + "            typeBlueId: incompatible-v3\n"
                + "            attributesAdded: []\n"
                + "repositoryVersions:\n"
                + "  - repo-v1\n"
                + "  - repo-v2\n"
                + "  - repo-v3\n";
    }

    private static String sameNamedParentSource() {
        return "name: Blue Repository\n"
                + "packages:\n"
                + "  - name: Coordination\n"
                + "    types:\n"
                + "      - status: stable\n"
                + "        content:\n"
                + "          name: Principal Actor\n"
                + "        versions:\n"
                + "          - repositoryVersionIndex: 0\n"
                + "            typeBlueId: coordination-principal\n"
                + "            attributesAdded: []\n"
                + "  - name: MyOS\n"
                + "    types:\n"
                + "      - status: stable\n"
                + "        content:\n"
                + "          name: Principal Actor\n"
                + "          type:\n"
                + "            blueId: coordination-principal\n"
                + "        versions:\n"
                + "          - repositoryVersionIndex: 0\n"
                + "            typeBlueId: myos-principal\n"
                + "            attributesAdded: []\n"
                + "repositoryVersions:\n"
                + "  - repository-v1\n";
    }

    private static void runGenerator(Path temp, Path source) throws IOException, InterruptedException {
        Process process = new ProcessBuilder(
                "node",
                "tools/generate-repository-sources.js",
                "--source", source.toString(),
                "--repository-version", "1.3.0",
                "--java-package-segment", "vtest",
                "--resource-base", "blue/repo/vtest",
                "--java-package", "blue.repo.vtest",
                "--java-output-root", temp.resolve("java").toString(),
                "--resources-output-root", temp.resolve("resources").toString()
        )
                .directory(new File(System.getProperty("user.dir")))
                .redirectErrorStream(true)
                .start();
        byte[] output = readAll(process.getInputStream());
        int exit = process.waitFor();
        assertEquals(0, exit, new String(output, StandardCharsets.UTF_8));
    }

    private static String read(Path path) throws IOException {
        return new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
    }

    private static byte[] readAll(InputStream inputStream) throws IOException {
        byte[] buffer = new byte[8192];
        java.io.ByteArrayOutputStream output = new java.io.ByteArrayOutputStream();
        int read;
        while ((read = inputStream.read(buffer)) >= 0) {
            output.write(buffer, 0, read);
        }
        return output.toByteArray();
    }

    private static Map<String, Object> map(Object... entries) {
        Map<String, Object> result = new LinkedHashMap<>();
        for (int i = 0; i < entries.length; i += 2) {
            result.put((String) entries[i], entries[i + 1]);
        }
        return result;
    }

    private static final class MemoryClassLoader extends ClassLoader {
        private final Map<String, String> resources;

        private MemoryClassLoader(Map<String, String> resources) {
            super(RepositoryHistoricalVersionTest.class.getClassLoader());
            this.resources = resources;
        }

        @Override
        public InputStream getResourceAsStream(String name) {
            String content = resources.get(name);
            if (content != null) {
                return new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8));
            }
            return super.getResourceAsStream(name);
        }
    }
}
