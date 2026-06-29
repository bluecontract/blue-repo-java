package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("2qfdfn8VYJmiXxmTj9Vwfu1pB3jFJQK9WAShnf8n1r1m")
public class CdmProductCommonSettlementSettlementTerms {
    public static String blueId() {
        return "2qfdfn8VYJmiXxmTj9Vwfu1pB3jFJQK9WAShnf8n1r1m";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/SettlementTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/SettlementTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementSettlementTerms.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmProductCommonSettlementCashSettlementTerms> cashSettlementTerms;

    private CdmProductCommonSettlementPhysicalSettlementTerms physicalSettlementTerms;

    private CdmProductCommonSettlementSettlementCentreEnum settlementCentre;

    private ComRosettaModelFieldWithMetaString settlementCurrency;

    private CdmProductCommonSettlementSettlementDate settlementDate;

    private CdmProductCommonSettlementSettlementProvision settlementProvision;

    private CdmProductCommonSettlementSettlementTypeEnum settlementType;

    private CdmProductCommonSettlementStandardSettlementStyleEnum standardSettlementStyle;

    private CdmProductCommonSettlementTransferSettlementEnum transferSettlementType;

    public List<CdmProductCommonSettlementCashSettlementTerms> getCashSettlementTerms() {
        return cashSettlementTerms;
    }

    public CdmProductCommonSettlementSettlementTerms cashSettlementTerms(List<CdmProductCommonSettlementCashSettlementTerms> cashSettlementTerms) {
        this.cashSettlementTerms = cashSettlementTerms;
        return this;
    }

    public CdmProductCommonSettlementPhysicalSettlementTerms getPhysicalSettlementTerms() {
        return physicalSettlementTerms;
    }

    public CdmProductCommonSettlementSettlementTerms physicalSettlementTerms(CdmProductCommonSettlementPhysicalSettlementTerms physicalSettlementTerms) {
        this.physicalSettlementTerms = physicalSettlementTerms;
        return this;
    }

    public CdmProductCommonSettlementSettlementCentreEnum getSettlementCentre() {
        return settlementCentre;
    }

    public CdmProductCommonSettlementSettlementTerms settlementCentre(CdmProductCommonSettlementSettlementCentreEnum settlementCentre) {
        this.settlementCentre = settlementCentre;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getSettlementCurrency() {
        return settlementCurrency;
    }

    public CdmProductCommonSettlementSettlementTerms settlementCurrency(ComRosettaModelFieldWithMetaString settlementCurrency) {
        this.settlementCurrency = settlementCurrency;
        return this;
    }

    public CdmProductCommonSettlementSettlementDate getSettlementDate() {
        return settlementDate;
    }

    public CdmProductCommonSettlementSettlementTerms settlementDate(CdmProductCommonSettlementSettlementDate settlementDate) {
        this.settlementDate = settlementDate;
        return this;
    }

    public CdmProductCommonSettlementSettlementProvision getSettlementProvision() {
        return settlementProvision;
    }

    public CdmProductCommonSettlementSettlementTerms settlementProvision(CdmProductCommonSettlementSettlementProvision settlementProvision) {
        this.settlementProvision = settlementProvision;
        return this;
    }

    public CdmProductCommonSettlementSettlementTypeEnum getSettlementType() {
        return settlementType;
    }

    public CdmProductCommonSettlementSettlementTerms settlementType(CdmProductCommonSettlementSettlementTypeEnum settlementType) {
        this.settlementType = settlementType;
        return this;
    }

    public CdmProductCommonSettlementStandardSettlementStyleEnum getStandardSettlementStyle() {
        return standardSettlementStyle;
    }

    public CdmProductCommonSettlementSettlementTerms standardSettlementStyle(CdmProductCommonSettlementStandardSettlementStyleEnum standardSettlementStyle) {
        this.standardSettlementStyle = standardSettlementStyle;
        return this;
    }

    public CdmProductCommonSettlementTransferSettlementEnum getTransferSettlementType() {
        return transferSettlementType;
    }

    public CdmProductCommonSettlementSettlementTerms transferSettlementType(CdmProductCommonSettlementTransferSettlementEnum transferSettlementType) {
        this.transferSettlementType = transferSettlementType;
        return this;
    }

}
