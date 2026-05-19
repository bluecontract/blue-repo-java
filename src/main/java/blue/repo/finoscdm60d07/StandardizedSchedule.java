package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5V5HsqAYs3MP56VeSZrjbwodYwBsUVtbY8TKDhHkQneF")
public class StandardizedSchedule {
    public static String blueId() {
        return "5V5HsqAYs3MP56VeSZrjbwodYwBsUVtbY8TKDhHkQneF";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "StandardizedSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/StandardizedSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/StandardizedSchedule.json";
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

    private StandardizedScheduleAssetClassEnum assetClass;

    private Double durationInYears;

    private Double notional;

    private String notionalCurrency;

    private StandardizedScheduleProductClassEnum productClass;

    public String getNamespace() {
        return namespace;
    }

    public StandardizedSchedule namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public StandardizedScheduleAssetClassEnum getAssetClass() {
        return assetClass;
    }

    public StandardizedSchedule assetClass(StandardizedScheduleAssetClassEnum assetClass) {
        this.assetClass = assetClass;
        return this;
    }

    public Double getDurationInYears() {
        return durationInYears;
    }

    public StandardizedSchedule durationInYears(Double durationInYears) {
        this.durationInYears = durationInYears;
        return this;
    }

    public Double getNotional() {
        return notional;
    }

    public StandardizedSchedule notional(Double notional) {
        this.notional = notional;
        return this;
    }

    public String getNotionalCurrency() {
        return notionalCurrency;
    }

    public StandardizedSchedule notionalCurrency(String notionalCurrency) {
        this.notionalCurrency = notionalCurrency;
        return this;
    }

    public StandardizedScheduleProductClassEnum getProductClass() {
        return productClass;
    }

    public StandardizedSchedule productClass(StandardizedScheduleProductClassEnum productClass) {
        this.productClass = productClass;
        return this;
    }

}
