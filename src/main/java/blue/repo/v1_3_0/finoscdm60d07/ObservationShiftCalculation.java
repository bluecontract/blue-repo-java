package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("21e3PoFXk6J7e1As5to6X4QsKSLqatoba58PQvay3nYY")
public class ObservationShiftCalculation {
    public static String blueId() {
        return "21e3PoFXk6J7e1As5to6X4QsKSLqatoba58PQvay3nYY";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ObservationShiftCalculation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ObservationShiftCalculation";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ObservationShiftCalculation.json";
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

    private BusinessCenters additionalBusinessDays;

    private ObservationPeriodDatesEnum calculationBase;

    private BigInteger offsetDays;

    public String getNamespace() {
        return namespace;
    }

    public ObservationShiftCalculation namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public BusinessCenters getAdditionalBusinessDays() {
        return additionalBusinessDays;
    }

    public ObservationShiftCalculation additionalBusinessDays(BusinessCenters additionalBusinessDays) {
        this.additionalBusinessDays = additionalBusinessDays;
        return this;
    }

    public ObservationPeriodDatesEnum getCalculationBase() {
        return calculationBase;
    }

    public ObservationShiftCalculation calculationBase(ObservationPeriodDatesEnum calculationBase) {
        this.calculationBase = calculationBase;
        return this;
    }

    public BigInteger getOffsetDays() {
        return offsetDays;
    }

    public ObservationShiftCalculation offsetDays(BigInteger offsetDays) {
        this.offsetDays = offsetDays;
        return this;
    }

}
