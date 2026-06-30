package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HNjhMn7WT4JjM4LH3CAB6FzPpLMvur9mQW6knri1HnTg")
public class CdmBaseDatetimeBusinessDateRange {
    public static String blueId() {
        return "HNjhMn7WT4JjM4LH3CAB6FzPpLMvur9mQW6knri1HnTg";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/BusinessDateRange";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/BusinessDateRange";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimeBusinessDateRange.json";
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

    private CdmBaseDatetimeBusinessDayConventionEnum businessDayConvention;

    private String endDate;

    private String startDate;

    public CdmBaseDatetimeBusinessCenters getBusinessCenters() {
        return businessCenters;
    }

    public CdmBaseDatetimeBusinessDateRange businessCenters(CdmBaseDatetimeBusinessCenters businessCenters) {
        this.businessCenters = businessCenters;
        return this;
    }

    public CdmBaseDatetimeBusinessDayConventionEnum getBusinessDayConvention() {
        return businessDayConvention;
    }

    public CdmBaseDatetimeBusinessDateRange businessDayConvention(CdmBaseDatetimeBusinessDayConventionEnum businessDayConvention) {
        this.businessDayConvention = businessDayConvention;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public CdmBaseDatetimeBusinessDateRange endDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getStartDate() {
        return startDate;
    }

    public CdmBaseDatetimeBusinessDateRange startDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

}
