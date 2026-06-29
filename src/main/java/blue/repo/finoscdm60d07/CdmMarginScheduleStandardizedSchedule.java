package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2xXTVFJJC2AthhSszyY4ca794zXYkKYyEqir5EjFU4Zm")
public class CdmMarginScheduleStandardizedSchedule {
    public static String blueId() {
        return "2xXTVFJJC2AthhSszyY4ca794zXYkKYyEqir5EjFU4Zm";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/margin/schedule/StandardizedSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/margin/schedule/StandardizedSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmmarginscheduleStandardizedSchedule.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmMarginScheduleStandardizedScheduleAssetClassEnum assetClass;

    private Double durationInYears;

    private Double notional;

    private String notionalCurrency;

    private CdmMarginScheduleStandardizedScheduleProductClassEnum productClass;

    public CdmMarginScheduleStandardizedScheduleAssetClassEnum getAssetClass() {
        return assetClass;
    }

    public CdmMarginScheduleStandardizedSchedule assetClass(CdmMarginScheduleStandardizedScheduleAssetClassEnum assetClass) {
        this.assetClass = assetClass;
        return this;
    }

    public Double getDurationInYears() {
        return durationInYears;
    }

    public CdmMarginScheduleStandardizedSchedule durationInYears(Double durationInYears) {
        this.durationInYears = durationInYears;
        return this;
    }

    public Double getNotional() {
        return notional;
    }

    public CdmMarginScheduleStandardizedSchedule notional(Double notional) {
        this.notional = notional;
        return this;
    }

    public String getNotionalCurrency() {
        return notionalCurrency;
    }

    public CdmMarginScheduleStandardizedSchedule notionalCurrency(String notionalCurrency) {
        this.notionalCurrency = notionalCurrency;
        return this;
    }

    public CdmMarginScheduleStandardizedScheduleProductClassEnum getProductClass() {
        return productClass;
    }

    public CdmMarginScheduleStandardizedSchedule productClass(CdmMarginScheduleStandardizedScheduleProductClassEnum productClass) {
        this.productClass = productClass;
        return this;
    }

}
