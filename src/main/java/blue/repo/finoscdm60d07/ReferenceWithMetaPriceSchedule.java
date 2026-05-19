package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("45HfgL64TRdHGgokLmTPwnhDVyVxw776BCEtmU9wpwVs")
public class ReferenceWithMetaPriceSchedule {
    public static String blueId() {
        return "45HfgL64TRdHGgokLmTPwnhDVyVxw776BCEtmU9wpwVs";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ReferenceWithMetaPriceSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ReferenceWithMetaPriceSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ReferenceWithMetaPriceSchedule.json";
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

    public ReferenceWithMetaPriceSchedule namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Reference getAddress() {
        return address;
    }

    public ReferenceWithMetaPriceSchedule address(Reference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public ReferenceWithMetaPriceSchedule externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public ReferenceWithMetaPriceSchedule globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
