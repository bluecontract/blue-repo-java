package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2JY85zg5f48Y33RijpWx4RRmdQJN2CuDKotpEfdxjoRw")
public class SpecialPurposeVehicleIssuerType {
    public static String blueId() {
        return "2JY85zg5f48Y33RijpWx4RRmdQJN2CuDKotpEfdxjoRw";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SpecialPurposeVehicleIssuerType";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SpecialPurposeVehicleIssuerType";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/SpecialPurposeVehicleIssuerType.json";
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

    private CreditRiskEnum creditRisk;

    public String getNamespace() {
        return namespace;
    }

    public SpecialPurposeVehicleIssuerType namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CreditRiskEnum getCreditRisk() {
        return creditRisk;
    }

    public SpecialPurposeVehicleIssuerType creditRisk(CreditRiskEnum creditRisk) {
        this.creditRisk = creditRisk;
        return this;
    }

}
