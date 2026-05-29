package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7sa9Mqmg3h5jeRZT2ovLcSC8NVf66kJ8N4grD5jeafUK")
public class CdmProductTemplateAsian {
    public static String blueId() {
        return "7sa9Mqmg3h5jeRZT2ovLcSC8NVf66kJ8N4grD5jeafUK";
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
