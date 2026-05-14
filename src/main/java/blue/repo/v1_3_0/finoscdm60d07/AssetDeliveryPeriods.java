package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("9zcj1ZGxU1cLHVpZ9GysZ3qti7nfBYUQZXWAt4qkh6PZ")
public class AssetDeliveryPeriods {
    public static String blueId() {
        return "9zcj1ZGxU1cLHVpZ9GysZ3qti7nfBYUQZXWAt4qkh6PZ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AssetDeliveryPeriods";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AssetDeliveryPeriods";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/AssetDeliveryPeriods.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    private String endDate;

    private List<AssetDeliveryProfile> profile;

    private String startDate;

    public String getNamespace() {
        return namespace;
    }

    public AssetDeliveryPeriods namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public AssetDeliveryPeriods endDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public List<AssetDeliveryProfile> getProfile() {
        return profile;
    }

    public AssetDeliveryPeriods profile(List<AssetDeliveryProfile> profile) {
        this.profile = profile;
        return this;
    }

    public String getStartDate() {
        return startDate;
    }

    public AssetDeliveryPeriods startDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

}
