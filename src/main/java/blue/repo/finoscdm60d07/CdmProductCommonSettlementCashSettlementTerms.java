package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("F5KjnQMMfEGVJJX3gbJCn8y2RE7dehHwQ5SW9jZCGBzY")
public class CdmProductCommonSettlementCashSettlementTerms {
    public static String blueId() {
        return "F5KjnQMMfEGVJJX3gbJCn8y2RE7dehHwQ5SW9jZCGBzY";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/CashSettlementTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/CashSettlementTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementCashSettlementTerms.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean accruedInterest;

    private CdmObservableAssetMoney cashSettlementAmount;

    private CdmProductCommonSettlementCashSettlementMethodEnum cashSettlementMethod;

    private Boolean fixedSettlement;

    private Double recoveryFactor;

    private CdmProductCommonSettlementValuationDate valuationDate;

    private CdmObservableAssetValuationMethod valuationMethod;

    private CdmBaseDatetimeBusinessCenterTime valuationTime;

    public Boolean getAccruedInterest() {
        return accruedInterest;
    }

    public CdmProductCommonSettlementCashSettlementTerms accruedInterest(Boolean accruedInterest) {
        this.accruedInterest = accruedInterest;
        return this;
    }

    public CdmObservableAssetMoney getCashSettlementAmount() {
        return cashSettlementAmount;
    }

    public CdmProductCommonSettlementCashSettlementTerms cashSettlementAmount(CdmObservableAssetMoney cashSettlementAmount) {
        this.cashSettlementAmount = cashSettlementAmount;
        return this;
    }

    public CdmProductCommonSettlementCashSettlementMethodEnum getCashSettlementMethod() {
        return cashSettlementMethod;
    }

    public CdmProductCommonSettlementCashSettlementTerms cashSettlementMethod(CdmProductCommonSettlementCashSettlementMethodEnum cashSettlementMethod) {
        this.cashSettlementMethod = cashSettlementMethod;
        return this;
    }

    public Boolean getFixedSettlement() {
        return fixedSettlement;
    }

    public CdmProductCommonSettlementCashSettlementTerms fixedSettlement(Boolean fixedSettlement) {
        this.fixedSettlement = fixedSettlement;
        return this;
    }

    public Double getRecoveryFactor() {
        return recoveryFactor;
    }

    public CdmProductCommonSettlementCashSettlementTerms recoveryFactor(Double recoveryFactor) {
        this.recoveryFactor = recoveryFactor;
        return this;
    }

    public CdmProductCommonSettlementValuationDate getValuationDate() {
        return valuationDate;
    }

    public CdmProductCommonSettlementCashSettlementTerms valuationDate(CdmProductCommonSettlementValuationDate valuationDate) {
        this.valuationDate = valuationDate;
        return this;
    }

    public CdmObservableAssetValuationMethod getValuationMethod() {
        return valuationMethod;
    }

    public CdmProductCommonSettlementCashSettlementTerms valuationMethod(CdmObservableAssetValuationMethod valuationMethod) {
        this.valuationMethod = valuationMethod;
        return this;
    }

    public CdmBaseDatetimeBusinessCenterTime getValuationTime() {
        return valuationTime;
    }

    public CdmProductCommonSettlementCashSettlementTerms valuationTime(CdmBaseDatetimeBusinessCenterTime valuationTime) {
        this.valuationTime = valuationTime;
        return this;
    }

}
