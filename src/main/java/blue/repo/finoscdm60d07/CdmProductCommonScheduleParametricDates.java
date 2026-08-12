package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("BZaLBY48LVb4VwEue2bkVqqdLay2ixteJueEiGUx4bWC")
public class CdmProductCommonScheduleParametricDates {
    public static String blueId() {
        return "BZaLBY48LVb4VwEue2bkVqqdLay2ixteJueEiGUx4bWC";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/ParametricDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/ParametricDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonscheduleParametricDates.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeBusinessCenters businessCenters;

    private CdmProductAssetDayDistributionEnum dayDistribution;

    private Double dayFrequency;

    private List<CdmBaseDatetimeDayOfWeekEnum> dayOfWeek;

    private CdmBaseDatetimeDayTypeEnum dayType;

    private CdmProductCommonScheduleLag lag;

    public CdmBaseDatetimeBusinessCenters getBusinessCenters() {
        return businessCenters;
    }

    public CdmProductCommonScheduleParametricDates businessCenters(CdmBaseDatetimeBusinessCenters businessCenters) {
        this.businessCenters = businessCenters;
        return this;
    }

    public CdmProductAssetDayDistributionEnum getDayDistribution() {
        return dayDistribution;
    }

    public CdmProductCommonScheduleParametricDates dayDistribution(CdmProductAssetDayDistributionEnum dayDistribution) {
        this.dayDistribution = dayDistribution;
        return this;
    }

    public Double getDayFrequency() {
        return dayFrequency;
    }

    public CdmProductCommonScheduleParametricDates dayFrequency(Double dayFrequency) {
        this.dayFrequency = dayFrequency;
        return this;
    }

    public List<CdmBaseDatetimeDayOfWeekEnum> getDayOfWeek() {
        return dayOfWeek;
    }

    public CdmProductCommonScheduleParametricDates dayOfWeek(List<CdmBaseDatetimeDayOfWeekEnum> dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    public CdmBaseDatetimeDayTypeEnum getDayType() {
        return dayType;
    }

    public CdmProductCommonScheduleParametricDates dayType(CdmBaseDatetimeDayTypeEnum dayType) {
        this.dayType = dayType;
        return this;
    }

    public CdmProductCommonScheduleLag getLag() {
        return lag;
    }

    public CdmProductCommonScheduleParametricDates lag(CdmProductCommonScheduleLag lag) {
        this.lag = lag;
        return this;
    }

}
