package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HhUzniLwfmmctYZQDNVDFzmvgDRMd1yCTfWm2Ztz4VsK")
public class CdmProductTemplateAsian {
    public static String blueId() {
        return "HhUzniLwfmmctYZQDNVDFzmvgDRMd1yCTfWm2Ztz4VsK";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/Asian";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/Asian";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateAsian.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductTemplateAveragingInOutEnum averagingInOut;

    private CdmProductCommonScheduleAveragingPeriod averagingPeriodIn;

    private CdmProductCommonScheduleAveragingPeriod averagingPeriodOut;

    private Double strikeFactor;

    public CdmProductTemplateAveragingInOutEnum getAveragingInOut() {
        return averagingInOut;
    }

    public CdmProductTemplateAsian averagingInOut(CdmProductTemplateAveragingInOutEnum averagingInOut) {
        this.averagingInOut = averagingInOut;
        return this;
    }

    public CdmProductCommonScheduleAveragingPeriod getAveragingPeriodIn() {
        return averagingPeriodIn;
    }

    public CdmProductTemplateAsian averagingPeriodIn(CdmProductCommonScheduleAveragingPeriod averagingPeriodIn) {
        this.averagingPeriodIn = averagingPeriodIn;
        return this;
    }

    public CdmProductCommonScheduleAveragingPeriod getAveragingPeriodOut() {
        return averagingPeriodOut;
    }

    public CdmProductTemplateAsian averagingPeriodOut(CdmProductCommonScheduleAveragingPeriod averagingPeriodOut) {
        this.averagingPeriodOut = averagingPeriodOut;
        return this;
    }

    public Double getStrikeFactor() {
        return strikeFactor;
    }

    public CdmProductTemplateAsian strikeFactor(Double strikeFactor) {
        this.strikeFactor = strikeFactor;
        return this;
    }

}
