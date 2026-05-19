package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("AnyLwRkJ66EzsVEdNm7zHC4pCDnqYo8RVHcV3o8Ee4Up")
public class PortfolioReturnTerms {
    public static String blueId() {
        return "AnyLwRkJ66EzsVEdNm7zHC4pCDnqYo8RVHcV3o8Ee4Up";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PortfolioReturnTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PortfolioReturnTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PortfolioReturnTerms.json";
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

    private CorrelationReturnTerms correlationReturnTerms;

    private DividendReturnTerms dividendReturnTerms;

    private List<ReferenceWithMetaPriceSchedule> finalValuationPrice;

    private List<ReferenceWithMetaPriceSchedule> initialValuationPrice;

    private List<ReferenceWithMetaPriceSchedule> interimValuationPrice;

    private PayerReceiver payerReceiver;

    private PriceReturnTerms priceReturnTerms;

    private ReferenceWithMetaNonNegativeQuantitySchedule quantity;

    private ReferenceWithMetaObservable underlier;

    private VarianceReturnTerms varianceReturnTerms;

    private VolatilityReturnTerms volatilityReturnTerms;

    public String getNamespace() {
        return namespace;
    }

    public PortfolioReturnTerms namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CorrelationReturnTerms getCorrelationReturnTerms() {
        return correlationReturnTerms;
    }

    public PortfolioReturnTerms correlationReturnTerms(CorrelationReturnTerms correlationReturnTerms) {
        this.correlationReturnTerms = correlationReturnTerms;
        return this;
    }

    public DividendReturnTerms getDividendReturnTerms() {
        return dividendReturnTerms;
    }

    public PortfolioReturnTerms dividendReturnTerms(DividendReturnTerms dividendReturnTerms) {
        this.dividendReturnTerms = dividendReturnTerms;
        return this;
    }

    public List<ReferenceWithMetaPriceSchedule> getFinalValuationPrice() {
        return finalValuationPrice;
    }

    public PortfolioReturnTerms finalValuationPrice(List<ReferenceWithMetaPriceSchedule> finalValuationPrice) {
        this.finalValuationPrice = finalValuationPrice;
        return this;
    }

    public List<ReferenceWithMetaPriceSchedule> getInitialValuationPrice() {
        return initialValuationPrice;
    }

    public PortfolioReturnTerms initialValuationPrice(List<ReferenceWithMetaPriceSchedule> initialValuationPrice) {
        this.initialValuationPrice = initialValuationPrice;
        return this;
    }

    public List<ReferenceWithMetaPriceSchedule> getInterimValuationPrice() {
        return interimValuationPrice;
    }

    public PortfolioReturnTerms interimValuationPrice(List<ReferenceWithMetaPriceSchedule> interimValuationPrice) {
        this.interimValuationPrice = interimValuationPrice;
        return this;
    }

    public PayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public PortfolioReturnTerms payerReceiver(PayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

    public PriceReturnTerms getPriceReturnTerms() {
        return priceReturnTerms;
    }

    public PortfolioReturnTerms priceReturnTerms(PriceReturnTerms priceReturnTerms) {
        this.priceReturnTerms = priceReturnTerms;
        return this;
    }

    public ReferenceWithMetaNonNegativeQuantitySchedule getQuantity() {
        return quantity;
    }

    public PortfolioReturnTerms quantity(ReferenceWithMetaNonNegativeQuantitySchedule quantity) {
        this.quantity = quantity;
        return this;
    }

    public ReferenceWithMetaObservable getUnderlier() {
        return underlier;
    }

    public PortfolioReturnTerms underlier(ReferenceWithMetaObservable underlier) {
        this.underlier = underlier;
        return this;
    }

    public VarianceReturnTerms getVarianceReturnTerms() {
        return varianceReturnTerms;
    }

    public PortfolioReturnTerms varianceReturnTerms(VarianceReturnTerms varianceReturnTerms) {
        this.varianceReturnTerms = varianceReturnTerms;
        return this;
    }

    public VolatilityReturnTerms getVolatilityReturnTerms() {
        return volatilityReturnTerms;
    }

    public PortfolioReturnTerms volatilityReturnTerms(VolatilityReturnTerms volatilityReturnTerms) {
        this.volatilityReturnTerms = volatilityReturnTerms;
        return this;
    }

}
