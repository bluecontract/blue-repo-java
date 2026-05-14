package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("Hn6Jh52WUkukHvhbYQbukSj8kScriQ3t4pP7rmraG12Z")
public class RateObservation {
    public static String blueId() {
        return "Hn6Jh52WUkukHvhbYQbukSj8kScriQ3t4pP7rmraG12Z";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "RateObservation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/RateObservation";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/RateObservation.json";
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

    private String adjustedFixingDate;

    private Double forecastRate;

    private BigInteger observationWeight;

    private Double observedRate;

    private ReferenceWithMetaRateObservation rateReference;

    private String resetDate;

    private Double treatedForecastRate;

    private Double treatedRate;

    public String getNamespace() {
        return namespace;
    }

    public RateObservation namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getAdjustedFixingDate() {
        return adjustedFixingDate;
    }

    public RateObservation adjustedFixingDate(String adjustedFixingDate) {
        this.adjustedFixingDate = adjustedFixingDate;
        return this;
    }

    public Double getForecastRate() {
        return forecastRate;
    }

    public RateObservation forecastRate(Double forecastRate) {
        this.forecastRate = forecastRate;
        return this;
    }

    public BigInteger getObservationWeight() {
        return observationWeight;
    }

    public RateObservation observationWeight(BigInteger observationWeight) {
        this.observationWeight = observationWeight;
        return this;
    }

    public Double getObservedRate() {
        return observedRate;
    }

    public RateObservation observedRate(Double observedRate) {
        this.observedRate = observedRate;
        return this;
    }

    public ReferenceWithMetaRateObservation getRateReference() {
        return rateReference;
    }

    public RateObservation rateReference(ReferenceWithMetaRateObservation rateReference) {
        this.rateReference = rateReference;
        return this;
    }

    public String getResetDate() {
        return resetDate;
    }

    public RateObservation resetDate(String resetDate) {
        this.resetDate = resetDate;
        return this;
    }

    public Double getTreatedForecastRate() {
        return treatedForecastRate;
    }

    public RateObservation treatedForecastRate(Double treatedForecastRate) {
        this.treatedForecastRate = treatedForecastRate;
        return this;
    }

    public Double getTreatedRate() {
        return treatedRate;
    }

    public RateObservation treatedRate(Double treatedRate) {
        this.treatedRate = treatedRate;
        return this;
    }

}
