package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("Dcp2ab2uqJZL1NZSNKQLL2upo5Rs3dfYGwZUReSX1GyA")
public class CdmProductCommonScheduleCalculationPeriodData {
    public static String blueId() {
        return "Dcp2ab2uqJZL1NZSNKQLL2upo5Rs3dfYGwZUReSX1GyA";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/CalculationPeriodData";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/CalculationPeriodData";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonscheduleCalculationPeriodData.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private BigInteger daysInLeapYearPeriod;

    private BigInteger daysInPeriod;

    private String endDate;

    private Boolean isFirstPeriod;

    private Boolean isLastPeriod;

    private String startDate;

    public BigInteger getDaysInLeapYearPeriod() {
        return daysInLeapYearPeriod;
    }

    public CdmProductCommonScheduleCalculationPeriodData daysInLeapYearPeriod(BigInteger daysInLeapYearPeriod) {
        this.daysInLeapYearPeriod = daysInLeapYearPeriod;
        return this;
    }

    public BigInteger getDaysInPeriod() {
        return daysInPeriod;
    }

    public CdmProductCommonScheduleCalculationPeriodData daysInPeriod(BigInteger daysInPeriod) {
        this.daysInPeriod = daysInPeriod;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public CdmProductCommonScheduleCalculationPeriodData endDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public Boolean getIsFirstPeriod() {
        return isFirstPeriod;
    }

    public CdmProductCommonScheduleCalculationPeriodData isFirstPeriod(Boolean isFirstPeriod) {
        this.isFirstPeriod = isFirstPeriod;
        return this;
    }

    public Boolean getIsLastPeriod() {
        return isLastPeriod;
    }

    public CdmProductCommonScheduleCalculationPeriodData isLastPeriod(Boolean isLastPeriod) {
        this.isLastPeriod = isLastPeriod;
        return this;
    }

    public String getStartDate() {
        return startDate;
    }

    public CdmProductCommonScheduleCalculationPeriodData startDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

}
