package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Cd9Bhd2YKkn5Uf4xihuiAz3kyDdQQmdUSyYupBcoutG3")
public class ReferenceWithMetaCreditEvents {
    public static String blueId() {
        return "Cd9Bhd2YKkn5Uf4xihuiAz3kyDdQQmdUSyYupBcoutG3";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ReferenceWithMetaCreditEvents";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ReferenceWithMetaCreditEvents";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ReferenceWithMetaCreditEvents.json";
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

    public ReferenceWithMetaCreditEvents namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Reference getAddress() {
        return address;
    }

    public ReferenceWithMetaCreditEvents address(Reference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public ReferenceWithMetaCreditEvents externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public ReferenceWithMetaCreditEvents globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
