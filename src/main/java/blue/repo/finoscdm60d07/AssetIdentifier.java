package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2aVbLJJSBqA4CEk4y99kfeaGjWR1LMijC7oGiybxWqC4")
public class AssetIdentifier {
    public static String blueId() {
        return "2aVbLJJSBqA4CEk4y99kfeaGjWR1LMijC7oGiybxWqC4";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AssetIdentifier";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AssetIdentifier";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/AssetIdentifier.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    private FieldWithMetaString identifier;

    private AssetIdTypeEnum identifierType;

    public String getNamespace() {
        return namespace;
    }

    public AssetIdentifier namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FieldWithMetaString getIdentifier() {
        return identifier;
    }

    public AssetIdentifier identifier(FieldWithMetaString identifier) {
        this.identifier = identifier;
        return this;
    }

    public AssetIdTypeEnum getIdentifierType() {
        return identifierType;
    }

    public AssetIdentifier identifierType(AssetIdTypeEnum identifierType) {
        this.identifierType = identifierType;
        return this;
    }

}
