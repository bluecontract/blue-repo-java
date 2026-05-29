package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("AxRtbapEBZySZ4EiPgeQy1TunP6re28X7ipk2brY6NJV")
public class CdmObservableAssetRateObservation {
    public static String blueId() {
        return "AxRtbapEBZySZ4EiPgeQy1TunP6re28X7ipk2brY6NJV";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/RateObservation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/RateObservation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetRateObservation.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String adjustedFixingDate;

    private Double forecastRate;

    private BigInteger observationWeight;

    private Double observedRate;

    private CdmObservableAssetMetafieldsReferenceWithMetaRateObservation rateReference;

    private String resetDate;

    private Double treatedForecastRate;

    private Double treatedRate;

    public String getAdjustedFixingDate() {
        return adjustedFixingDate;
    }

    public CdmObservableAssetRateObservation adjustedFixingDate(String adjustedFixingDate) {
        this.adjustedFixingDate = adjustedFixingDate;
        return this;
    }

    public Double getForecastRate() {
        return forecastRate;
    }

    public CdmObservableAssetRateObservation forecastRate(Double forecastRate) {
        this.forecastRate = forecastRate;
        return this;
    }

    public BigInteger getObservationWeight() {
        return observationWeight;
    }

    public CdmObservableAssetRateObservation observationWeight(BigInteger observationWeight) {
        this.observationWeight = observationWeight;
        return this;
    }

    public Double getObservedRate() {
        return observedRate;
    }

    public CdmObservableAssetRateObservation observedRate(Double observedRate) {
        this.observedRate = observedRate;
        return this;
    }

    public CdmObservableAssetMetafieldsReferenceWithMetaRateObservation getRateReference() {
        return rateReference;
    }

    public CdmObservableAssetRateObservation rateReference(CdmObservableAssetMetafieldsReferenceWithMetaRateObservation rateReference) {
        this.rateReference = rateReference;
        return this;
    }

    public String getResetDate() {
        return resetDate;
    }

    public CdmObservableAssetRateObservation resetDate(String resetDate) {
        this.resetDate = resetDate;
        return this;
    }

    public Double getTreatedForecastRate() {
        return treatedForecastRate;
    }

    public CdmObservableAssetRateObservation treatedForecastRate(Double treatedForecastRate) {
        this.treatedForecastRate = treatedForecastRate;
        return this;
    }

    public Double getTreatedRate() {
        return treatedRate;
    }

    public CdmObservableAssetRateObservation treatedRate(Double treatedRate) {
        this.treatedRate = treatedRate;
        return this;
    }

}
