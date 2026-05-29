package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HjEmRrvzUJGJ8GfKAGdbcnZbK68UnqsEfHnP7fQL2aXu")
public class CdmProductCommonScheduleCalculationPeriodBase {
    public static String blueId() {
        return "HjEmRrvzUJGJ8GfKAGdbcnZbK68UnqsEfHnP7fQL2aXu";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/CalculationPeriodBase";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/CalculationPeriodBase";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonscheduleCalculationPeriodBase.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String adjustedEndDate;

    private String adjustedStartDate;

    public String getAdjustedEndDate() {
        return adjustedEndDate;
    }

    public CdmProductCommonScheduleCalculationPeriodBase adjustedEndDate(String adjustedEndDate) {
        this.adjustedEndDate = adjustedEndDate;
        return this;
    }

    public String getAdjustedStartDate() {
        return adjustedStartDate;
    }

    public CdmProductCommonScheduleCalculationPeriodBase adjustedStartDate(String adjustedStartDate) {
        this.adjustedStartDate = adjustedStartDate;
        return this;
    }

}
