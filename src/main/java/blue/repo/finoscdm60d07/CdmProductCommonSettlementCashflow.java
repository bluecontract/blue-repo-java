package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8h67TL3CiQCmBrw2sKdGtsWSBVv7SD4cRX2BR7nAnDP3")
public class CdmProductCommonSettlementCashflow {
    public static String blueId() {
        return "8h67TL3CiQCmBrw2sKdGtsWSBVv7SD4cRX2BR7nAnDP3";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/Cashflow";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/Cashflow";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementCashflow.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataAssetCommonAsset asset;

    private CdmProductCommonSettlementCashflowType cashflowType;

    private CdmBaseStaticdataPartyPayerReceiver payerReceiver;

    private CdmProductCommonSettlementPaymentDiscounting paymentDiscounting;

    private CdmBaseMathNonNegativeQuantity quantity;

    private CdmBaseDatetimeAdjustableOrAdjustedOrRelativeDate settlementDate;

    public CdmBaseStaticdataAssetCommonAsset getAsset() {
        return asset;
    }

    public CdmProductCommonSettlementCashflow asset(CdmBaseStaticdataAssetCommonAsset asset) {
        this.asset = asset;
        return this;
    }

    public CdmProductCommonSettlementCashflowType getCashflowType() {
        return cashflowType;
    }

    public CdmProductCommonSettlementCashflow cashflowType(CdmProductCommonSettlementCashflowType cashflowType) {
        this.cashflowType = cashflowType;
        return this;
    }

    public CdmBaseStaticdataPartyPayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public CdmProductCommonSettlementCashflow payerReceiver(CdmBaseStaticdataPartyPayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

    public CdmProductCommonSettlementPaymentDiscounting getPaymentDiscounting() {
        return paymentDiscounting;
    }

    public CdmProductCommonSettlementCashflow paymentDiscounting(CdmProductCommonSettlementPaymentDiscounting paymentDiscounting) {
        this.paymentDiscounting = paymentDiscounting;
        return this;
    }

    public CdmBaseMathNonNegativeQuantity getQuantity() {
        return quantity;
    }

    public CdmProductCommonSettlementCashflow quantity(CdmBaseMathNonNegativeQuantity quantity) {
        this.quantity = quantity;
        return this;
    }

    public CdmBaseDatetimeAdjustableOrAdjustedOrRelativeDate getSettlementDate() {
        return settlementDate;
    }

    public CdmProductCommonSettlementCashflow settlementDate(CdmBaseDatetimeAdjustableOrAdjustedOrRelativeDate settlementDate) {
        this.settlementDate = settlementDate;
        return this;
    }

}
