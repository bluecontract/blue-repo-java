package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("F7K9tWMBLoVnuoqinp9znSBZj1g2Voc2uwTv9ju1sR4a")
public class FloatingRateCalculationParameters {
    public static String blueId() {
        return "F7K9tWMBLoVnuoqinp9znSBZj1g2Voc2uwTv9ju1sR4a";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FloatingRateCalculationParameters";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FloatingRateCalculationParameters";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FloatingRateCalculationParameters.json";
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

    private BusinessCenters applicableBusinessDays;

    private CalculationMethodEnum calculationMethod;

    private OffsetCalculation lockoutCalculation;

    private OffsetCalculation lookbackCalculation;

    private ObservationParameters observationParameters;

    private ObservationShiftCalculation observationShiftCalculation;

    public String getNamespace() {
        return namespace;
    }

    public FloatingRateCalculationParameters namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public BusinessCenters getApplicableBusinessDays() {
        return applicableBusinessDays;
    }

    public FloatingRateCalculationParameters applicableBusinessDays(BusinessCenters applicableBusinessDays) {
        this.applicableBusinessDays = applicableBusinessDays;
        return this;
    }

    public CalculationMethodEnum getCalculationMethod() {
        return calculationMethod;
    }

    public FloatingRateCalculationParameters calculationMethod(CalculationMethodEnum calculationMethod) {
        this.calculationMethod = calculationMethod;
        return this;
    }

    public OffsetCalculation getLockoutCalculation() {
        return lockoutCalculation;
    }

    public FloatingRateCalculationParameters lockoutCalculation(OffsetCalculation lockoutCalculation) {
        this.lockoutCalculation = lockoutCalculation;
        return this;
    }

    public OffsetCalculation getLookbackCalculation() {
        return lookbackCalculation;
    }

    public FloatingRateCalculationParameters lookbackCalculation(OffsetCalculation lookbackCalculation) {
        this.lookbackCalculation = lookbackCalculation;
        return this;
    }

    public ObservationParameters getObservationParameters() {
        return observationParameters;
    }

    public FloatingRateCalculationParameters observationParameters(ObservationParameters observationParameters) {
        this.observationParameters = observationParameters;
        return this;
    }

    public ObservationShiftCalculation getObservationShiftCalculation() {
        return observationShiftCalculation;
    }

    public FloatingRateCalculationParameters observationShiftCalculation(ObservationShiftCalculation observationShiftCalculation) {
        this.observationShiftCalculation = observationShiftCalculation;
        return this;
    }

}
