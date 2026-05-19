package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HrCHmRH9qdSXwA9FUn95PNhcw9WYwRPDmHuVUygwXA7i")
public class ReferenceWithMetaLegalEntity {
    public static String blueId() {
        return "HrCHmRH9qdSXwA9FUn95PNhcw9WYwRPDmHuVUygwXA7i";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ReferenceWithMetaLegalEntity";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ReferenceWithMetaLegalEntity";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ReferenceWithMetaLegalEntity.json";
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

    public ReferenceWithMetaLegalEntity namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Reference getAddress() {
        return address;
    }

    public ReferenceWithMetaLegalEntity address(Reference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public ReferenceWithMetaLegalEntity externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public ReferenceWithMetaLegalEntity globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
