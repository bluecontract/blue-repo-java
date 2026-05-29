package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("J3fEqj9oTvSRB56tSsiVxJJNHPVH8HGUpVpHa2D1bwr")
public class CdmEventCommonCollateralBalance {
    public static String blueId() {
        return "J3fEqj9oTvSRB56tSsiVxJJNHPVH8HGUpVpHa2D1bwr";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/CollateralBalance";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/CollateralBalance";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonCollateralBalance.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetMoney amountBaseCurrency;

    private CdmEventCommonCollateralStatusEnum collateralBalanceStatus;

    private CdmEventCommonHaircutIndicatorEnum haircutIndicator;

    private CdmBaseStaticdataPartyPartyReferencePayerReceiver payerReceiver;

    public CdmObservableAssetMoney getAmountBaseCurrency() {
        return amountBaseCurrency;
    }

    public CdmEventCommonCollateralBalance amountBaseCurrency(CdmObservableAssetMoney amountBaseCurrency) {
        this.amountBaseCurrency = amountBaseCurrency;
        return this;
    }

    public CdmEventCommonCollateralStatusEnum getCollateralBalanceStatus() {
        return collateralBalanceStatus;
    }

    public CdmEventCommonCollateralBalance collateralBalanceStatus(CdmEventCommonCollateralStatusEnum collateralBalanceStatus) {
        this.collateralBalanceStatus = collateralBalanceStatus;
        return this;
    }

    public CdmEventCommonHaircutIndicatorEnum getHaircutIndicator() {
        return haircutIndicator;
    }

    public CdmEventCommonCollateralBalance haircutIndicator(CdmEventCommonHaircutIndicatorEnum haircutIndicator) {
        this.haircutIndicator = haircutIndicator;
        return this;
    }

    public CdmBaseStaticdataPartyPartyReferencePayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public CdmEventCommonCollateralBalance payerReceiver(CdmBaseStaticdataPartyPartyReferencePayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

}
