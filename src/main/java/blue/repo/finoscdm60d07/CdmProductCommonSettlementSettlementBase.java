package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FpxN3VskUMZNGXwcBhJWSdsDhusFAhwDZygPhqoPCB7z")
public class CdmProductCommonSettlementSettlementBase {
    public static String blueId() {
        return "FpxN3VskUMZNGXwcBhJWSdsDhusFAhwDZygPhqoPCB7z";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/SettlementBase";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/SettlementBase";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementSettlementBase.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCommonSettlementSettlementCentreEnum settlementCentre;

    private ComRosettaModelFieldWithMetaString settlementCurrency;

    private CdmProductCommonSettlementSettlementDate settlementDate;

    private CdmProductCommonSettlementSettlementProvision settlementProvision;

    private CdmProductCommonSettlementSettlementTypeEnum settlementType;

    private CdmProductCommonSettlementStandardSettlementStyleEnum standardSettlementStyle;

    private CdmProductCommonSettlementTransferSettlementEnum transferSettlementType;

    public CdmProductCommonSettlementSettlementCentreEnum getSettlementCentre() {
        return settlementCentre;
    }

    public CdmProductCommonSettlementSettlementBase settlementCentre(CdmProductCommonSettlementSettlementCentreEnum settlementCentre) {
        this.settlementCentre = settlementCentre;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getSettlementCurrency() {
        return settlementCurrency;
    }

    public CdmProductCommonSettlementSettlementBase settlementCurrency(ComRosettaModelFieldWithMetaString settlementCurrency) {
        this.settlementCurrency = settlementCurrency;
        return this;
    }

    public CdmProductCommonSettlementSettlementDate getSettlementDate() {
        return settlementDate;
    }

    public CdmProductCommonSettlementSettlementBase settlementDate(CdmProductCommonSettlementSettlementDate settlementDate) {
        this.settlementDate = settlementDate;
        return this;
    }

    public CdmProductCommonSettlementSettlementProvision getSettlementProvision() {
        return settlementProvision;
    }

    public CdmProductCommonSettlementSettlementBase settlementProvision(CdmProductCommonSettlementSettlementProvision settlementProvision) {
        this.settlementProvision = settlementProvision;
        return this;
    }

    public CdmProductCommonSettlementSettlementTypeEnum getSettlementType() {
        return settlementType;
    }

    public CdmProductCommonSettlementSettlementBase settlementType(CdmProductCommonSettlementSettlementTypeEnum settlementType) {
        this.settlementType = settlementType;
        return this;
    }

    public CdmProductCommonSettlementStandardSettlementStyleEnum getStandardSettlementStyle() {
        return standardSettlementStyle;
    }

    public CdmProductCommonSettlementSettlementBase standardSettlementStyle(CdmProductCommonSettlementStandardSettlementStyleEnum standardSettlementStyle) {
        this.standardSettlementStyle = standardSettlementStyle;
        return this;
    }

    public CdmProductCommonSettlementTransferSettlementEnum getTransferSettlementType() {
        return transferSettlementType;
    }

    public CdmProductCommonSettlementSettlementBase transferSettlementType(CdmProductCommonSettlementTransferSettlementEnum transferSettlementType) {
        this.transferSettlementType = transferSettlementType;
        return this;
    }

}
