package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6Syh8ww8U6aA4EfU72SMAXFhYKJ4nZhn5RdrYDiA8Gy")
public class ReferenceWithMetaAdjustableOrRelativeDate {
    public static String blueId() {
        return "6Syh8ww8U6aA4EfU72SMAXFhYKJ4nZhn5RdrYDiA8Gy";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ReferenceWithMetaAdjustableOrRelativeDate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ReferenceWithMetaAdjustableOrRelativeDate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ReferenceWithMetaAdjustableOrRelativeDate.json";
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

    private Reference address;

    private String externalReference;

    private String globalReference;

    public String getNamespace() {
        return namespace;
    }

    public ReferenceWithMetaAdjustableOrRelativeDate namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Reference getAddress() {
        return address;
    }

    public ReferenceWithMetaAdjustableOrRelativeDate address(Reference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public ReferenceWithMetaAdjustableOrRelativeDate externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public ReferenceWithMetaAdjustableOrRelativeDate globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
