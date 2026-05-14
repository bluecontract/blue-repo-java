package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("ENQSupDEB8mRjo2DUfKjAbZFAswgjezjpSLGBdSdcbW9")
public class AveragingSchedule {
    public static String blueId() {
        return "ENQSupDEB8mRjo2DUfKjAbZFAswgjezjpSLGBdSdcbW9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AveragingSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AveragingSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/AveragingSchedule.json";
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

    private CalculationPeriodFrequency averagingPeriodFrequency;

    private String endDate;

    private String startDate;

    public String getNamespace() {
        return namespace;
    }

    public AveragingSchedule namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CalculationPeriodFrequency getAveragingPeriodFrequency() {
        return averagingPeriodFrequency;
    }

    public AveragingSchedule averagingPeriodFrequency(CalculationPeriodFrequency averagingPeriodFrequency) {
        this.averagingPeriodFrequency = averagingPeriodFrequency;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public AveragingSchedule endDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getStartDate() {
        return startDate;
    }

    public AveragingSchedule startDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

}
