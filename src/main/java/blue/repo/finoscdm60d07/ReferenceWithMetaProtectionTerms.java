package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2zmYfuxguXPfTVYidmmsR2rd976JdcAzbgimmXS6tyu6")
public class ReferenceWithMetaProtectionTerms {
    public static String blueId() {
        return "2zmYfuxguXPfTVYidmmsR2rd976JdcAzbgimmXS6tyu6";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ReferenceWithMetaProtectionTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ReferenceWithMetaProtectionTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ReferenceWithMetaProtectionTerms.json";
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

    public ReferenceWithMetaProtectionTerms namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Reference getAddress() {
        return address;
    }

    public ReferenceWithMetaProtectionTerms address(Reference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public ReferenceWithMetaProtectionTerms externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public ReferenceWithMetaProtectionTerms globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
