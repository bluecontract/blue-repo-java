package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("DWTrF2mXujpM3W1YxupXzvP48uSCaTZTWQxWxHHfsxek")
public class CalculationPeriodData {
    public static String blueId() {
        return "DWTrF2mXujpM3W1YxupXzvP48uSCaTZTWQxWxHHfsxek";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CalculationPeriodData";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CalculationPeriodData";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CalculationPeriodData.json";
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

    private BigInteger daysInLeapYearPeriod;

    private BigInteger daysInPeriod;

    private String endDate;

    private Boolean isFirstPeriod;

    private Boolean isLastPeriod;

    private String startDate;

    public String getNamespace() {
        return namespace;
    }

    public CalculationPeriodData namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public BigInteger getDaysInLeapYearPeriod() {
        return daysInLeapYearPeriod;
    }

    public CalculationPeriodData daysInLeapYearPeriod(BigInteger daysInLeapYearPeriod) {
        this.daysInLeapYearPeriod = daysInLeapYearPeriod;
        return this;
    }

    public BigInteger getDaysInPeriod() {
        return daysInPeriod;
    }

    public CalculationPeriodData daysInPeriod(BigInteger daysInPeriod) {
        this.daysInPeriod = daysInPeriod;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public CalculationPeriodData endDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public Boolean getIsFirstPeriod() {
        return isFirstPeriod;
    }

    public CalculationPeriodData isFirstPeriod(Boolean isFirstPeriod) {
        this.isFirstPeriod = isFirstPeriod;
        return this;
    }

    public Boolean getIsLastPeriod() {
        return isLastPeriod;
    }

    public CalculationPeriodData isLastPeriod(Boolean isLastPeriod) {
        this.isLastPeriod = isLastPeriod;
        return this;
    }

    public String getStartDate() {
        return startDate;
    }

    public CalculationPeriodData startDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

}
