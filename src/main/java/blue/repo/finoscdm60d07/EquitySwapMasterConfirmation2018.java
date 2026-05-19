package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GyTXK5XHqjbid8QdP2KGJcDwrGmcmLGJBAtrJeMkdqMM")
public class EquitySwapMasterConfirmation2018 {
    public static String blueId() {
        return "GyTXK5XHqjbid8QdP2KGJcDwrGmcmLGJBAtrJeMkdqMM";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "EquitySwapMasterConfirmation2018";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/EquitySwapMasterConfirmation2018";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/EquitySwapMasterConfirmation2018.json";
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

    private PaymentDates equityCashSettlementDates;

    private InterpolationMethodEnum linearInterpolationElection;

    private PriceReturnTerms pricingMethodElection;

    private SettlementTerms settlementTerms;

    private ReturnTypeEnum typeOfSwapElection;

    private ValuationDates valuationDates;

    public String getNamespace() {
        return namespace;
    }

    public EquitySwapMasterConfirmation2018 namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public PaymentDates getEquityCashSettlementDates() {
        return equityCashSettlementDates;
    }

    public EquitySwapMasterConfirmation2018 equityCashSettlementDates(PaymentDates equityCashSettlementDates) {
        this.equityCashSettlementDates = equityCashSettlementDates;
        return this;
    }

    public InterpolationMethodEnum getLinearInterpolationElection() {
        return linearInterpolationElection;
    }

    public EquitySwapMasterConfirmation2018 linearInterpolationElection(InterpolationMethodEnum linearInterpolationElection) {
        this.linearInterpolationElection = linearInterpolationElection;
        return this;
    }

    public PriceReturnTerms getPricingMethodElection() {
        return pricingMethodElection;
    }

    public EquitySwapMasterConfirmation2018 pricingMethodElection(PriceReturnTerms pricingMethodElection) {
        this.pricingMethodElection = pricingMethodElection;
        return this;
    }

    public SettlementTerms getSettlementTerms() {
        return settlementTerms;
    }

    public EquitySwapMasterConfirmation2018 settlementTerms(SettlementTerms settlementTerms) {
        this.settlementTerms = settlementTerms;
        return this;
    }

    public ReturnTypeEnum getTypeOfSwapElection() {
        return typeOfSwapElection;
    }

    public EquitySwapMasterConfirmation2018 typeOfSwapElection(ReturnTypeEnum typeOfSwapElection) {
        this.typeOfSwapElection = typeOfSwapElection;
        return this;
    }

    public ValuationDates getValuationDates() {
        return valuationDates;
    }

    public EquitySwapMasterConfirmation2018 valuationDates(ValuationDates valuationDates) {
        this.valuationDates = valuationDates;
        return this;
    }

}
