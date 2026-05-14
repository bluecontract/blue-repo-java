package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("372eWY5sDp2NSbQXbfRfGTdzrWW4fxxWgdtta1srsWaP")
public class FeaturePayment {
    public static String blueId() {
        return "372eWY5sDp2NSbQXbfRfGTdzrWW4fxxWgdtta1srsWaP";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FeaturePayment";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FeaturePayment";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FeaturePayment.json";
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

    private Double amount;

    private FieldWithMetaString currency;

    private Double levelPercentage;

    private PartyReferencePayerReceiver payerReceiver;

    private AdjustableOrRelativeDate paymentDate;

    private TimeTypeEnum time;

    public String getNamespace() {
        return namespace;
    }

    public FeaturePayment namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Double getAmount() {
        return amount;
    }

    public FeaturePayment amount(Double amount) {
        this.amount = amount;
        return this;
    }

    public FieldWithMetaString getCurrency() {
        return currency;
    }

    public FeaturePayment currency(FieldWithMetaString currency) {
        this.currency = currency;
        return this;
    }

    public Double getLevelPercentage() {
        return levelPercentage;
    }

    public FeaturePayment levelPercentage(Double levelPercentage) {
        this.levelPercentage = levelPercentage;
        return this;
    }

    public PartyReferencePayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public FeaturePayment payerReceiver(PartyReferencePayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

    public AdjustableOrRelativeDate getPaymentDate() {
        return paymentDate;
    }

    public FeaturePayment paymentDate(AdjustableOrRelativeDate paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }

    public TimeTypeEnum getTime() {
        return time;
    }

    public FeaturePayment time(TimeTypeEnum time) {
        this.time = time;
        return this;
    }

}
