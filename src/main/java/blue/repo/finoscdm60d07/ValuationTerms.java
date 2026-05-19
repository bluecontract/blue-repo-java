package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("HBPyekApP6oSxJLXSqMqQEf4uuZaocEC84epkGmriddV")
public class ValuationTerms {
    public static String blueId() {
        return "HBPyekApP6oSxJLXSqMqQEf4uuZaocEC84epkGmriddV";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ValuationTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ValuationTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ValuationTerms.json";
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

    private Boolean componentSecurityIndexAnnexFallback;

    private AdjustableRelativeOrPeriodicDates dividendValuationDates;

    private FPVFinalPriceElectionFallbackEnum fPVFinalPriceElectionFallback;

    private Boolean futuresPriceValuation;

    private Boolean multipleExchangeIndexAnnexFallback;

    private BigInteger numberOfValuationDates;

    private Boolean optionsPriceValuation;

    public String getNamespace() {
        return namespace;
    }

    public ValuationTerms namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getComponentSecurityIndexAnnexFallback() {
        return componentSecurityIndexAnnexFallback;
    }

    public ValuationTerms componentSecurityIndexAnnexFallback(Boolean componentSecurityIndexAnnexFallback) {
        this.componentSecurityIndexAnnexFallback = componentSecurityIndexAnnexFallback;
        return this;
    }

    public AdjustableRelativeOrPeriodicDates getDividendValuationDates() {
        return dividendValuationDates;
    }

    public ValuationTerms dividendValuationDates(AdjustableRelativeOrPeriodicDates dividendValuationDates) {
        this.dividendValuationDates = dividendValuationDates;
        return this;
    }

    public FPVFinalPriceElectionFallbackEnum getFPVFinalPriceElectionFallback() {
        return fPVFinalPriceElectionFallback;
    }

    public ValuationTerms fPVFinalPriceElectionFallback(FPVFinalPriceElectionFallbackEnum fPVFinalPriceElectionFallback) {
        this.fPVFinalPriceElectionFallback = fPVFinalPriceElectionFallback;
        return this;
    }

    public Boolean getFuturesPriceValuation() {
        return futuresPriceValuation;
    }

    public ValuationTerms futuresPriceValuation(Boolean futuresPriceValuation) {
        this.futuresPriceValuation = futuresPriceValuation;
        return this;
    }

    public Boolean getMultipleExchangeIndexAnnexFallback() {
        return multipleExchangeIndexAnnexFallback;
    }

    public ValuationTerms multipleExchangeIndexAnnexFallback(Boolean multipleExchangeIndexAnnexFallback) {
        this.multipleExchangeIndexAnnexFallback = multipleExchangeIndexAnnexFallback;
        return this;
    }

    public BigInteger getNumberOfValuationDates() {
        return numberOfValuationDates;
    }

    public ValuationTerms numberOfValuationDates(BigInteger numberOfValuationDates) {
        this.numberOfValuationDates = numberOfValuationDates;
        return this;
    }

    public Boolean getOptionsPriceValuation() {
        return optionsPriceValuation;
    }

    public ValuationTerms optionsPriceValuation(Boolean optionsPriceValuation) {
        this.optionsPriceValuation = optionsPriceValuation;
        return this;
    }

}
