package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6czdS8oZAuUEpP21ENtNhS41Qz3o1T4D4Rp1ujKCH5JY")
public class CdmProductTemplateAssetLeg {
    public static String blueId() {
        return "6czdS8oZAuUEpP21ENtNhS41Qz3o1T4D4Rp1ujKCH5JY";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/AssetLeg";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/AssetLeg";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateAssetLeg.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCommonSettlementDeliveryMethodEnum deliveryMethod;

    private CdmBaseDatetimeAdjustableOrRelativeDate settlementDate;

    public CdmProductCommonSettlementDeliveryMethodEnum getDeliveryMethod() {
        return deliveryMethod;
    }

    public CdmProductTemplateAssetLeg deliveryMethod(CdmProductCommonSettlementDeliveryMethodEnum deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
        return this;
    }

    public CdmBaseDatetimeAdjustableOrRelativeDate getSettlementDate() {
        return settlementDate;
    }

    public CdmProductTemplateAssetLeg settlementDate(CdmBaseDatetimeAdjustableOrRelativeDate settlementDate) {
        this.settlementDate = settlementDate;
        return this;
    }

}
