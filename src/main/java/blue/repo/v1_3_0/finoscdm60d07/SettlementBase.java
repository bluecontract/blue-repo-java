package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Hmx5q71XPtPbWk82gyFRdVWiQovFrDLWovfx3Samewwu")
public class SettlementBase {
    public static String blueId() {
        return "Hmx5q71XPtPbWk82gyFRdVWiQovFrDLWovfx3Samewwu";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SettlementBase";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SettlementBase";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/SettlementBase.json";
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

    private SettlementCentreEnum settlementCentre;

    private FieldWithMetaString settlementCurrency;

    private SettlementDate settlementDate;

    private SettlementProvision settlementProvision;

    private SettlementTypeEnum settlementType;

    private StandardSettlementStyleEnum standardSettlementStyle;

    private TransferSettlementEnum transferSettlementType;

    public String getNamespace() {
        return namespace;
    }

    public SettlementBase namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public SettlementCentreEnum getSettlementCentre() {
        return settlementCentre;
    }

    public SettlementBase settlementCentre(SettlementCentreEnum settlementCentre) {
        this.settlementCentre = settlementCentre;
        return this;
    }

    public FieldWithMetaString getSettlementCurrency() {
        return settlementCurrency;
    }

    public SettlementBase settlementCurrency(FieldWithMetaString settlementCurrency) {
        this.settlementCurrency = settlementCurrency;
        return this;
    }

    public SettlementDate getSettlementDate() {
        return settlementDate;
    }

    public SettlementBase settlementDate(SettlementDate settlementDate) {
        this.settlementDate = settlementDate;
        return this;
    }

    public SettlementProvision getSettlementProvision() {
        return settlementProvision;
    }

    public SettlementBase settlementProvision(SettlementProvision settlementProvision) {
        this.settlementProvision = settlementProvision;
        return this;
    }

    public SettlementTypeEnum getSettlementType() {
        return settlementType;
    }

    public SettlementBase settlementType(SettlementTypeEnum settlementType) {
        this.settlementType = settlementType;
        return this;
    }

    public StandardSettlementStyleEnum getStandardSettlementStyle() {
        return standardSettlementStyle;
    }

    public SettlementBase standardSettlementStyle(StandardSettlementStyleEnum standardSettlementStyle) {
        this.standardSettlementStyle = standardSettlementStyle;
        return this;
    }

    public TransferSettlementEnum getTransferSettlementType() {
        return transferSettlementType;
    }

    public SettlementBase transferSettlementType(TransferSettlementEnum transferSettlementType) {
        this.transferSettlementType = transferSettlementType;
        return this;
    }

}
