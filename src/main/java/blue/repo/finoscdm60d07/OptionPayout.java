package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5kXk9Uzw8zdnt3rnmXD4h4i6DVxmrWtL7ZKyDsPx9nMf#0")
public class OptionPayout {
    public static String blueId() {
        return "5kXk9Uzw8zdnt3rnmXD4h4i6DVxmrWtL7ZKyDsPx9nMf#0";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "OptionPayout";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/OptionPayout";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/OptionPayout.json";
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

    private BuyerSeller buyerSeller;

    private AssetDeliveryInformation delivery;

    private ExerciseTerms exerciseTerms;

    private OptionFeature feature;

    private ObservationTerms observationTerms;

    private OptionTypeEnum optionType;

    private PayerReceiver payerReceiver;

    private ResolvablePriceQuantity priceQuantity;

    private PrincipalPayments principalPayment;

    private CalculationSchedule schedule;

    private SettlementTerms settlementTerms;

    private OptionStrike strike;

    private Underlier underlier;

    public String getNamespace() {
        return namespace;
    }

    public OptionPayout namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public BuyerSeller getBuyerSeller() {
        return buyerSeller;
    }

    public OptionPayout buyerSeller(BuyerSeller buyerSeller) {
        this.buyerSeller = buyerSeller;
        return this;
    }

    public AssetDeliveryInformation getDelivery() {
        return delivery;
    }

    public OptionPayout delivery(AssetDeliveryInformation delivery) {
        this.delivery = delivery;
        return this;
    }

    public ExerciseTerms getExerciseTerms() {
        return exerciseTerms;
    }

    public OptionPayout exerciseTerms(ExerciseTerms exerciseTerms) {
        this.exerciseTerms = exerciseTerms;
        return this;
    }

    public OptionFeature getFeature() {
        return feature;
    }

    public OptionPayout feature(OptionFeature feature) {
        this.feature = feature;
        return this;
    }

    public ObservationTerms getObservationTerms() {
        return observationTerms;
    }

    public OptionPayout observationTerms(ObservationTerms observationTerms) {
        this.observationTerms = observationTerms;
        return this;
    }

    public OptionTypeEnum getOptionType() {
        return optionType;
    }

    public OptionPayout optionType(OptionTypeEnum optionType) {
        this.optionType = optionType;
        return this;
    }

    public PayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public OptionPayout payerReceiver(PayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

    public ResolvablePriceQuantity getPriceQuantity() {
        return priceQuantity;
    }

    public OptionPayout priceQuantity(ResolvablePriceQuantity priceQuantity) {
        this.priceQuantity = priceQuantity;
        return this;
    }

    public PrincipalPayments getPrincipalPayment() {
        return principalPayment;
    }

    public OptionPayout principalPayment(PrincipalPayments principalPayment) {
        this.principalPayment = principalPayment;
        return this;
    }

    public CalculationSchedule getSchedule() {
        return schedule;
    }

    public OptionPayout schedule(CalculationSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    public SettlementTerms getSettlementTerms() {
        return settlementTerms;
    }

    public OptionPayout settlementTerms(SettlementTerms settlementTerms) {
        this.settlementTerms = settlementTerms;
        return this;
    }

    public OptionStrike getStrike() {
        return strike;
    }

    public OptionPayout strike(OptionStrike strike) {
        this.strike = strike;
        return this;
    }

    public Underlier getUnderlier() {
        return underlier;
    }

    public OptionPayout underlier(Underlier underlier) {
        this.underlier = underlier;
        return this;
    }

}
