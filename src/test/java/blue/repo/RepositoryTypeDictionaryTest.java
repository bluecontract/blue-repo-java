package blue.repo;

import blue.language.dictionary.TypeDictionary;
import blue.language.model.Node;
import blue.repo.types.CoordinationTypes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTypeDictionaryTest {
    @Test
    void dictionaryBlueIdsContainsRepositoryVersionBlueId() {
        BlueRepository repository = BlueRepository.v1_3_0();
        TypeDictionary dictionary = repository.typeDictionary();

        assertEquals(BlueRepository.DICTIONARY_NAME, dictionary.name());
        assertTrue(dictionary.dictionaryBlueIds().contains(repository.repositoryVersionBlueId()));
        assertEquals(repository.manifest().repositoryVersions().size(), dictionary.dictionaryBlueIds().size());
        repository.manifest().repositoryVersions()
                .forEach(version -> assertTrue(dictionary.dictionaryBlueIds().contains(version.repositoryBlueId())));
    }

    @Test
    void currentBlueIdReturnsCurrentIdForKnownType() {
        BlueRepository repository = BlueRepository.v1_3_0();
        TypeDictionary dictionary = repository.typeDictionary();
        String operationBlueId = CoordinationTypes.OPERATION.blueId();

        assertEquals(operationBlueId, dictionary.currentBlueId(operationBlueId).orElse(null));
    }

    @Test
    void typeBlueIdForDoesNotRemapChangedHistoricalIdentity() {
        BlueRepository repository = BlueRepository.v1_3_0();
        TypeDictionary dictionary = repository.typeDictionary();
        String operationBlueId = CoordinationTypes.OPERATION.blueId();

        assertEquals(operationBlueId,
                dictionary.typeBlueIdFor(operationBlueId, repository.repositoryVersionBlueId()).orElse(null));
        assertFalse(dictionary.typeBlueIdFor(
                operationBlueId,
                repository.manifest().repositoryVersions().get(0).repositoryBlueId()).isPresent());
    }

    @Test
    void definitionReturnsFullFreshNodeForKnownType() {
        BlueRepository repository = BlueRepository.v1_3_0();
        TypeDictionary dictionary = repository.typeDictionary();
        String operationBlueId = CoordinationTypes.OPERATION.blueId();

        Node first = dictionary.definition(operationBlueId).orElseThrow(AssertionError::new);
        Node second = dictionary.definition(operationBlueId).orElseThrow(AssertionError::new);

        assertNotSame(first, second);
        assertEquals("Operation", first.getName());
        assertEquals(operationBlueId, first.getBlueId());
        assertFalse(first.isReferenceOnly());
    }

    @Test
    void unknownTypeAndDictionaryVersionReturnEmpty() {
        BlueRepository repository = BlueRepository.v1_3_0();
        TypeDictionary dictionary = repository.typeDictionary();

        assertFalse(dictionary.currentBlueId("unknown-type-blue-id").isPresent());
        assertFalse(dictionary.definition("unknown-type-blue-id").isPresent());
        assertFalse(dictionary.typeBlueIdFor(CoordinationTypes.OPERATION.blueId(), "unknown-dictionary-blue-id").isPresent());
    }

}
