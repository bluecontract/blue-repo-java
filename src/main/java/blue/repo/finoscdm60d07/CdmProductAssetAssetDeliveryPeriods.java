package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("H6t8NffsdWqtanqDpN7t7icMs8RXqgzAi66JLpnZD6Vr")
public class CdmProductAssetAssetDeliveryPeriods {
    public static String blueId() {
        return "H6t8NffsdWqtanqDpN7t7icMs8RXqgzAi66JLpnZD6Vr";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/AssetDeliveryPeriods";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/AssetDeliveryPeriods";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetAssetDeliveryPeriods.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String endDate;

    private List<CdmProductAssetAssetDeliveryProfile> profile;

    private String startDate;

    public String getEndDate() {
        return endDate;
    }

    public CdmProductAssetAssetDeliveryPeriods endDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public List<CdmProductAssetAssetDeliveryProfile> getProfile() {
        return profile;
    }

    public CdmProductAssetAssetDeliveryPeriods profile(List<CdmProductAssetAssetDeliveryProfile> profile) {
        this.profile = profile;
        return this;
    }

    public String getStartDate() {
        return startDate;
    }

    public CdmProductAssetAssetDeliveryPeriods startDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

}
