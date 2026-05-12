package blue.repository;

import blue.language.Blue;
import blue.language.dictionary.ExportContext;
import blue.language.dictionary.TypeDictionary;
import blue.language.model.Node;
import blue.repository.types.ConversationTypes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTypeDictionaryTest {
    private static final String LIST_BLUE_ID = "6aehfNAxHLC1PHHoDr3tYtFH3RWNbiWdFancJ1bypXEY";

    @Test
    void dictionaryBlueIdsContainsRepositoryVersionBlueId() {
        BlueRepository repository = BlueRepository.v1_2_0();
        TypeDictionary dictionary = repository.typeDictionary();

        assertEquals(BlueRepository.DICTIONARY_NAME, dictionary.name());
        assertTrue(dictionary.dictionaryBlueIds().contains(repository.repositoryVersionBlueId()));
        assertEquals(repository.manifest().repositoryVersions().size(), dictionary.dictionaryBlueIds().size());
        repository.manifest().repositoryVersions()
                .forEach(version -> assertTrue(dictionary.dictionaryBlueIds().contains(version.repositoryBlueId())));
    }

    @Test
    void currentBlueIdReturnsCurrentIdForKnownType() {
        BlueRepository repository = BlueRepository.v1_2_0();
        TypeDictionary dictionary = repository.typeDictionary();
        String operationBlueId = ConversationTypes.OPERATION.blueId();

        assertEquals(operationBlueId, dictionary.currentBlueId(operationBlueId).orElse(null));
    }

    @Test
    void typeBlueIdForReturnsCurrentTypeIdForSupportedDictionaryVersion() {
        BlueRepository repository = BlueRepository.v1_2_0();
        TypeDictionary dictionary = repository.typeDictionary();
        String operationBlueId = ConversationTypes.OPERATION.blueId();

        assertEquals(operationBlueId,
                dictionary.typeBlueIdFor(operationBlueId, repository.repositoryVersionBlueId()).orElse(null));
        assertEquals(operationBlueId,
                dictionary.typeBlueIdFor(operationBlueId, repository.manifest().repositoryVersions().get(0).repositoryBlueId()).orElse(null));
    }

    @Test
    void definitionReturnsFullFreshNodeForKnownType() {
        BlueRepository repository = BlueRepository.v1_2_0();
        TypeDictionary dictionary = repository.typeDictionary();
        String operationBlueId = ConversationTypes.OPERATION.blueId();

        Node first = dictionary.definition(operationBlueId).orElseThrow(AssertionError::new);
        Node second = dictionary.definition(operationBlueId).orElseThrow(AssertionError::new);

        assertNotSame(first, second);
        assertEquals("Operation", first.getName());
        assertEquals(operationBlueId, first.getBlueId());
        assertFalse(first.isReferenceOnly());
    }

    @Test
    void unknownTypeAndDictionaryVersionReturnEmpty() {
        BlueRepository repository = BlueRepository.v1_2_0();
        TypeDictionary dictionary = repository.typeDictionary();

        assertFalse(dictionary.currentBlueId("unknown-type-blue-id").isPresent());
        assertFalse(dictionary.definition("unknown-type-blue-id").isPresent());
        assertFalse(dictionary.typeBlueIdFor(ConversationTypes.OPERATION.blueId(), "unknown-dictionary-blue-id").isPresent());
    }

    @Test
    void supportedDictionaryExportKeepsCompactTypeReference() {
        BlueRepository repository = BlueRepository.v1_2_0();
        Blue blue = repository.configureForExport(new Blue());
        ExportContext context = ExportContext.builder()
                .dictionary(BlueRepository.DICTIONARY_NAME, repository.repositoryVersionBlueId())
                .build();

        Node document = new Node()
                .name("operation")
                .type(ConversationTypes.OPERATION.reference());

        Node exported = blue.exportNode(document, context);
        String yaml = blue.nodeToYaml(document, context);

        assertNotNull(exported.getType());
        assertTrue(exported.getType().isReferenceOnly());
        assertEquals(ConversationTypes.OPERATION.blueId(), exported.getType().getBlueId());
        assertTrue(yaml.contains("blueId: \"" + ConversationTypes.OPERATION.blueId() + "\"")
                || yaml.contains("blueId: " + ConversationTypes.OPERATION.blueId()));
    }

    @Test
    void exportWithoutDictionaryContextInlinesKnownRepositoryType() {
        BlueRepository repository = BlueRepository.v1_2_0();
        Blue blue = repository.configureForExport(new Blue());

        Node document = new Node()
                .name("operation")
                .type(ConversationTypes.OPERATION.reference());

        Node exported = blue.exportNode(document, ExportContext.empty());

        assertNotNull(exported.getType());
        assertNull(exported.getType().getBlueId());
        assertEquals("Operation", exported.getType().getName());
        assertNotNull(exported.getType().getProperties().get("channel"));
    }

    @Test
    void strictExportWithoutSupportedDictionaryThrows() {
        BlueRepository repository = BlueRepository.v1_2_0();
        Blue blue = repository.configureForExport(new Blue());
        ExportContext strict = ExportContext.builder()
                .inlineUnsupportedTypes(false)
                .build();

        Node document = new Node()
                .name("operation")
                .type(ConversationTypes.OPERATION.reference());

        assertThrows(IllegalArgumentException.class, () -> blue.nodeToYaml(document, strict));
    }

    @Test
    void recursiveInliningInlinesNestedRepositoryTypesButKeepsCoreTypesCompact() {
        BlueRepository repository = BlueRepository.v1_2_0();
        Blue blue = repository.configureForExport(new Blue());

        Node document = new Node()
                .name("update")
                .type(ConversationTypes.UPDATE_DOCUMENT.reference());

        Node exported = blue.exportNode(document, ExportContext.empty());
        Node updateDocument = exported.getType();
        Node changeset = updateDocument.getProperties().get("changeset");
        Node itemType = changeset.getItemType();

        assertEquals("Update Document", updateDocument.getName());
        assertNull(updateDocument.getBlueId());
        assertEquals("Json Patch Entry", itemType.getName());
        assertNull(itemType.getBlueId());
        assertEquals(LIST_BLUE_ID, changeset.getType().getBlueId());
        assertTrue(changeset.getType().isReferenceOnly());
    }
}
