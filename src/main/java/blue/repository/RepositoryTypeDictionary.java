package blue.repository;

import blue.language.dictionary.TypeDictionary;
import blue.language.model.Node;
import blue.repository.provider.RepositoryNodeProvider;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public final class RepositoryTypeDictionary implements TypeDictionary {
    private final RepositoryManifest manifest;
    private final RepositoryNodeProvider nodeProvider;
    private final Set<String> dictionaryBlueIds;

    public RepositoryTypeDictionary(RepositoryManifest manifest, RepositoryNodeProvider nodeProvider) {
        if (manifest == null) {
            throw new IllegalArgumentException("manifest must not be null");
        }
        if (nodeProvider == null) {
            throw new IllegalArgumentException("nodeProvider must not be null");
        }
        this.manifest = manifest;
        this.nodeProvider = nodeProvider;
        Set<String> blueIds = new LinkedHashSet<>();
        for (RepositoryVersion version : manifest.repositoryVersions()) {
            blueIds.add(version.repositoryBlueId());
        }
        this.dictionaryBlueIds = java.util.Collections.unmodifiableSet(blueIds);
    }

    @Override
    public String name() {
        return BlueRepository.DICTIONARY_NAME;
    }

    @Override
    public Set<String> dictionaryBlueIds() {
        return dictionaryBlueIds;
    }

    @Override
    public Optional<String> currentBlueId(String blueId) {
        if (blueId == null || blueId.isEmpty()) {
            return Optional.empty();
        }
        return manifest.currentBlueIdFor(blueId);
    }

    @Override
    public Optional<String> typeBlueIdFor(String currentBlueId, String dictionaryBlueId) {
        if (currentBlueId == null || currentBlueId.isEmpty()) {
            return Optional.empty();
        }
        return manifest.blueIdFor(currentBlueId, dictionaryBlueId);
    }

    @Override
    public Optional<Node> definition(String currentBlueId) {
        if (!manifest.definitionByBlueId(currentBlueId).isPresent()) {
            return Optional.empty();
        }
        Node definition = nodeProvider.fetchFirstByBlueId(currentBlueId);
        return definition == null ? Optional.<Node>empty() : Optional.of(definition.clone());
    }
}
