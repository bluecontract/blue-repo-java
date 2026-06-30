package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4ZskTzTzcVURodZiz2Xe1cU3ryAzGu9uwsf7Nc5DU4tA")
public class CdmBaseStaticdataAssetCommonDeliveryDateParameters {
    public static String blueId() {
        return "4ZskTzTzcVURodZiz2Xe1cU3ryAzGu9uwsf7Nc5DU4tA";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/DeliveryDateParameters";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/DeliveryDateParameters";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonDeliveryDateParameters.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeAdjustableDate deliveryDate;

    private CdmBaseDatetimeOffset deliveryDateExpirationConvention;

    private CdmBaseDatetimeOffset deliveryDateRollConvention;

    private CdmBaseDatetimeOffset deliveryNearby;

    public CdmBaseDatetimeAdjustableDate getDeliveryDate() {
        return deliveryDate;
    }

    public CdmBaseStaticdataAssetCommonDeliveryDateParameters deliveryDate(CdmBaseDatetimeAdjustableDate deliveryDate) {
        this.deliveryDate = deliveryDate;
        return this;
    }

    public CdmBaseDatetimeOffset getDeliveryDateExpirationConvention() {
        return deliveryDateExpirationConvention;
    }

    public CdmBaseStaticdataAssetCommonDeliveryDateParameters deliveryDateExpirationConvention(CdmBaseDatetimeOffset deliveryDateExpirationConvention) {
        this.deliveryDateExpirationConvention = deliveryDateExpirationConvention;
        return this;
    }

    public CdmBaseDatetimeOffset getDeliveryDateRollConvention() {
        return deliveryDateRollConvention;
    }

    public CdmBaseStaticdataAssetCommonDeliveryDateParameters deliveryDateRollConvention(CdmBaseDatetimeOffset deliveryDateRollConvention) {
        this.deliveryDateRollConvention = deliveryDateRollConvention;
        return this;
    }

    public CdmBaseDatetimeOffset getDeliveryNearby() {
        return deliveryNearby;
    }

    public CdmBaseStaticdataAssetCommonDeliveryDateParameters deliveryNearby(CdmBaseDatetimeOffset deliveryNearby) {
        this.deliveryNearby = deliveryNearby;
        return this;
    }

}
