package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CRUNh2A3DemRf2NLHqftSvQXbZNDbTDKvgdGjE7VVRxR")
public class NegativeInterestRateTreatmentEnum {
    public static String blueId() {
        return "CRUNh2A3DemRf2NLHqftSvQXbZNDbTDKvgdGjE7VVRxR";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "NegativeInterestRateTreatmentEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/NegativeInterestRateTreatmentEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/NegativeInterestRateTreatmentEnum.json";
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

    public String getNamespace() {
        return namespace;
    }

    public NegativeInterestRateTreatmentEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
