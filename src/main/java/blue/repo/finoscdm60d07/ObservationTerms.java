package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("8RJG5i22Qomk3odNHXJZnBiLA1GPKkh7GzLLVYDN6UYy")
public class ObservationTerms {
    public static String blueId() {
        return "8RJG5i22Qomk3odNHXJZnBiLA1GPKkh7GzLLVYDN6UYy";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ObservationTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ObservationTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ObservationTerms.json";
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

    private CalculationPeriodDates calculationPeriodDates;

    private FxSpotRateSource informationSource;

    private BigInteger numberOfObservationDates;

    private ObservationDates observationDates;

    private BusinessCenterTime observationTime;

    private TimeTypeEnum observationTimeType;

    private Rounding precision;

    public String getNamespace() {
        return namespace;
    }

    public ObservationTerms namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CalculationPeriodDates getCalculationPeriodDates() {
        return calculationPeriodDates;
    }

    public ObservationTerms calculationPeriodDates(CalculationPeriodDates calculationPeriodDates) {
        this.calculationPeriodDates = calculationPeriodDates;
        return this;
    }

    public FxSpotRateSource getInformationSource() {
        return informationSource;
    }

    public ObservationTerms informationSource(FxSpotRateSource informationSource) {
        this.informationSource = informationSource;
        return this;
    }

    public BigInteger getNumberOfObservationDates() {
        return numberOfObservationDates;
    }

    public ObservationTerms numberOfObservationDates(BigInteger numberOfObservationDates) {
        this.numberOfObservationDates = numberOfObservationDates;
        return this;
    }

    public ObservationDates getObservationDates() {
        return observationDates;
    }

    public ObservationTerms observationDates(ObservationDates observationDates) {
        this.observationDates = observationDates;
        return this;
    }

    public BusinessCenterTime getObservationTime() {
        return observationTime;
    }

    public ObservationTerms observationTime(BusinessCenterTime observationTime) {
        this.observationTime = observationTime;
        return this;
    }

    public TimeTypeEnum getObservationTimeType() {
        return observationTimeType;
    }

    public ObservationTerms observationTimeType(TimeTypeEnum observationTimeType) {
        this.observationTimeType = observationTimeType;
        return this;
    }

    public Rounding getPrecision() {
        return precision;
    }

    public ObservationTerms precision(Rounding precision) {
        this.precision = precision;
        return this;
    }

}
