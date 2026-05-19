package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("77rbUUqNwNB6xiJ5CqBs1ZD6D2pZFac1qRjTqD9WuRR3")
public class ReferenceWithMetaAdjustableOrRelativeDates {
    public static String blueId() {
        return "77rbUUqNwNB6xiJ5CqBs1ZD6D2pZFac1qRjTqD9WuRR3";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ReferenceWithMetaAdjustableOrRelativeDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ReferenceWithMetaAdjustableOrRelativeDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ReferenceWithMetaAdjustableOrRelativeDates.json";
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

    public ReferenceWithMetaAdjustableOrRelativeDates namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Reference getAddress() {
        return address;
    }

    public ReferenceWithMetaAdjustableOrRelativeDates address(Reference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public ReferenceWithMetaAdjustableOrRelativeDates externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public ReferenceWithMetaAdjustableOrRelativeDates globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
