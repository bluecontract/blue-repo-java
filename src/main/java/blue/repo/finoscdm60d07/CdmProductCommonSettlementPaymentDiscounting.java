package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DUqm3TQV9zY2ZzvGWUxF7Nq3ZWiBsvJcmisVJwK3fbKv")
public class CdmProductCommonSettlementPaymentDiscounting {
    public static String blueId() {
        return "DUqm3TQV9zY2ZzvGWUxF7Nq3ZWiBsvJcmisVJwK3fbKv";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/PaymentDiscounting";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/PaymentDiscounting";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementPaymentDiscounting.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Double discountFactor;

    private CdmObservableAssetMoney presentValueAmount;

    public Double getDiscountFactor() {
        return discountFactor;
    }

    public CdmProductCommonSettlementPaymentDiscounting discountFactor(Double discountFactor) {
        this.discountFactor = discountFactor;
        return this;
    }

    public CdmObservableAssetMoney getPresentValueAmount() {
        return presentValueAmount;
    }

    public CdmProductCommonSettlementPaymentDiscounting presentValueAmount(CdmObservableAssetMoney presentValueAmount) {
        this.presentValueAmount = presentValueAmount;
        return this;
    }

}
