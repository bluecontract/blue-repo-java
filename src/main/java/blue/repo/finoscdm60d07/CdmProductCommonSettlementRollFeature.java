package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("E2qUUo8XnSB9mMMhWkXkxcQEwJHg3ZJeuWY3g9JvNh6F")
public class CdmProductCommonSettlementRollFeature {
    public static String blueId() {
        return "E2qUUo8XnSB9mMMhWkXkxcQEwJHg3ZJeuWY3g9JvNh6F";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/RollFeature";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/RollFeature";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementRollFeature.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeOffset deliveryDateRollConvention;

    private CdmProductAssetRollSourceCalendarEnum rollSourceCalendar;

    public CdmBaseDatetimeOffset getDeliveryDateRollConvention() {
        return deliveryDateRollConvention;
    }

    public CdmProductCommonSettlementRollFeature deliveryDateRollConvention(CdmBaseDatetimeOffset deliveryDateRollConvention) {
        this.deliveryDateRollConvention = deliveryDateRollConvention;
        return this;
    }

    public CdmProductAssetRollSourceCalendarEnum getRollSourceCalendar() {
        return rollSourceCalendar;
    }

    public CdmProductCommonSettlementRollFeature rollSourceCalendar(CdmProductAssetRollSourceCalendarEnum rollSourceCalendar) {
        this.rollSourceCalendar = rollSourceCalendar;
        return this;
    }

}
