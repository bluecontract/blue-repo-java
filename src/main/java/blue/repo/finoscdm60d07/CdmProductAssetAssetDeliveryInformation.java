package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("ErtJ5jBytJJ7W2hSqXGSdmAd65mCExkRtBpifkecnhVT")
public class CdmProductAssetAssetDeliveryInformation {
    public static String blueId() {
        return "ErtJ5jBytJJ7W2hSqXGSdmAd65mCExkRtBpifkecnhVT";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/AssetDeliveryInformation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/AssetDeliveryInformation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetAssetDeliveryInformation.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseMathQuantity deliveryCapacity;

    private List<CdmBaseStaticdataIdentifierLocationIdentifier> location;

    private CdmProductAssetAssetDeliveryPeriods periods;

    public CdmBaseMathQuantity getDeliveryCapacity() {
        return deliveryCapacity;
    }

    public CdmProductAssetAssetDeliveryInformation deliveryCapacity(CdmBaseMathQuantity deliveryCapacity) {
        this.deliveryCapacity = deliveryCapacity;
        return this;
    }

    public List<CdmBaseStaticdataIdentifierLocationIdentifier> getLocation() {
        return location;
    }

    public CdmProductAssetAssetDeliveryInformation location(List<CdmBaseStaticdataIdentifierLocationIdentifier> location) {
        this.location = location;
        return this;
    }

    public CdmProductAssetAssetDeliveryPeriods getPeriods() {
        return periods;
    }

    public CdmProductAssetAssetDeliveryInformation periods(CdmProductAssetAssetDeliveryPeriods periods) {
        this.periods = periods;
        return this;
    }

}
