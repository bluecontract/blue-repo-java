package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("9jwptYwf7iHDmM6mNJvPxnXaFWTFGrDAiR4ii5JXuPbE")
public class PaymentCalculationPeriod {
    public static String blueId() {
        return "9jwptYwf7iHDmM6mNJvPxnXaFWTFGrDAiR4ii5JXuPbE";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PaymentCalculationPeriod";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PaymentCalculationPeriod";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PaymentCalculationPeriod.json";
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

    private String adjustedPaymentDate;

    private List<CalculationPeriod> calculationPeriod;

    private Double discountFactor;

    private Money fixedPaymentAmount;

    private Money forecastPaymentAmount;

    private Money presentValueAmount;

    private String unadjustedPaymentDate;

    public String getNamespace() {
        return namespace;
    }

    public PaymentCalculationPeriod namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getAdjustedPaymentDate() {
        return adjustedPaymentDate;
    }

    public PaymentCalculationPeriod adjustedPaymentDate(String adjustedPaymentDate) {
        this.adjustedPaymentDate = adjustedPaymentDate;
        return this;
    }

    public List<CalculationPeriod> getCalculationPeriod() {
        return calculationPeriod;
    }

    public PaymentCalculationPeriod calculationPeriod(List<CalculationPeriod> calculationPeriod) {
        this.calculationPeriod = calculationPeriod;
        return this;
    }

    public Double getDiscountFactor() {
        return discountFactor;
    }

    public PaymentCalculationPeriod discountFactor(Double discountFactor) {
        this.discountFactor = discountFactor;
        return this;
    }

    public Money getFixedPaymentAmount() {
        return fixedPaymentAmount;
    }

    public PaymentCalculationPeriod fixedPaymentAmount(Money fixedPaymentAmount) {
        this.fixedPaymentAmount = fixedPaymentAmount;
        return this;
    }

    public Money getForecastPaymentAmount() {
        return forecastPaymentAmount;
    }

    public PaymentCalculationPeriod forecastPaymentAmount(Money forecastPaymentAmount) {
        this.forecastPaymentAmount = forecastPaymentAmount;
        return this;
    }

    public Money getPresentValueAmount() {
        return presentValueAmount;
    }

    public PaymentCalculationPeriod presentValueAmount(Money presentValueAmount) {
        this.presentValueAmount = presentValueAmount;
        return this;
    }

    public String getUnadjustedPaymentDate() {
        return unadjustedPaymentDate;
    }

    public PaymentCalculationPeriod unadjustedPaymentDate(String unadjustedPaymentDate) {
        this.unadjustedPaymentDate = unadjustedPaymentDate;
        return this;
    }

}
