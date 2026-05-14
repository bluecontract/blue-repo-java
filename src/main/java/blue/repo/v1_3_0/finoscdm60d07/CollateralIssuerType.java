package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CUSCzsVUYy2xHJZtmwG5CREevRxEgURVHDk7QJm9UBmM")
public class CollateralIssuerType {
    public static String blueId() {
        return "CUSCzsVUYy2xHJZtmwG5CREevRxEgURVHDk7QJm9UBmM";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CollateralIssuerType";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CollateralIssuerType";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CollateralIssuerType.json";
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

    private IssuerTypeEnum issuerType;

    private QuasiGovernmentIssuerType quasiGovernmentType;

    private RegionalGovernmentIssuerType regionalGovernmentType;

    private SpecialPurposeVehicleIssuerType specialPurposeVehicleType;

    private SupraNationalIssuerTypeEnum supraNationalType;

    public String getNamespace() {
        return namespace;
    }

    public CollateralIssuerType namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public IssuerTypeEnum getIssuerType() {
        return issuerType;
    }

    public CollateralIssuerType issuerType(IssuerTypeEnum issuerType) {
        this.issuerType = issuerType;
        return this;
    }

    public QuasiGovernmentIssuerType getQuasiGovernmentType() {
        return quasiGovernmentType;
    }

    public CollateralIssuerType quasiGovernmentType(QuasiGovernmentIssuerType quasiGovernmentType) {
        this.quasiGovernmentType = quasiGovernmentType;
        return this;
    }

    public RegionalGovernmentIssuerType getRegionalGovernmentType() {
        return regionalGovernmentType;
    }

    public CollateralIssuerType regionalGovernmentType(RegionalGovernmentIssuerType regionalGovernmentType) {
        this.regionalGovernmentType = regionalGovernmentType;
        return this;
    }

    public SpecialPurposeVehicleIssuerType getSpecialPurposeVehicleType() {
        return specialPurposeVehicleType;
    }

    public CollateralIssuerType specialPurposeVehicleType(SpecialPurposeVehicleIssuerType specialPurposeVehicleType) {
        this.specialPurposeVehicleType = specialPurposeVehicleType;
        return this;
    }

    public SupraNationalIssuerTypeEnum getSupraNationalType() {
        return supraNationalType;
    }

    public CollateralIssuerType supraNationalType(SupraNationalIssuerTypeEnum supraNationalType) {
        this.supraNationalType = supraNationalType;
        return this;
    }

}
