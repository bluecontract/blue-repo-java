package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3WvaxijQwR1ELLMK9QtedoyNZ1wy9YZrGnGe2wvdpVWk")
public class CdmProductCommonSettlementFixedPrice {
    public static String blueId() {
        return "3WvaxijQwR1ELLMK9QtedoyNZ1wy9YZrGnGe2wvdpVWk";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/FixedPrice";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/FixedPrice";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementFixedPrice.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule price;

    public CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule getPrice() {
        return price;
    }

    public CdmProductCommonSettlementFixedPrice price(CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule price) {
        this.price = price;
        return this;
    }

}
