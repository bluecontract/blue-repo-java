package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3kL7RjTFp8yyMzH9CMML5d9mtdx22WFLgVuptocznNEb")
public class CdmObservableEventFeaturePayment {
    public static String blueId() {
        return "3kL7RjTFp8yyMzH9CMML5d9mtdx22WFLgVuptocznNEb";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/event/FeaturePayment";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/event/FeaturePayment";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableeventFeaturePayment.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Double amount;

    private ComRosettaModelFieldWithMetaString currency;

    private Double levelPercentage;

    private CdmBaseStaticdataPartyPartyReferencePayerReceiver payerReceiver;

    private CdmBaseDatetimeAdjustableOrRelativeDate paymentDate;

    private CdmObservableCommonTimeTypeEnum time;

    public Double getAmount() {
        return amount;
    }

    public CdmObservableEventFeaturePayment amount(Double amount) {
        this.amount = amount;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getCurrency() {
        return currency;
    }

    public CdmObservableEventFeaturePayment currency(ComRosettaModelFieldWithMetaString currency) {
        this.currency = currency;
        return this;
    }

    public Double getLevelPercentage() {
        return levelPercentage;
    }

    public CdmObservableEventFeaturePayment levelPercentage(Double levelPercentage) {
        this.levelPercentage = levelPercentage;
        return this;
    }

    public CdmBaseStaticdataPartyPartyReferencePayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public CdmObservableEventFeaturePayment payerReceiver(CdmBaseStaticdataPartyPartyReferencePayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

    public CdmBaseDatetimeAdjustableOrRelativeDate getPaymentDate() {
        return paymentDate;
    }

    public CdmObservableEventFeaturePayment paymentDate(CdmBaseDatetimeAdjustableOrRelativeDate paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }

    public CdmObservableCommonTimeTypeEnum getTime() {
        return time;
    }

    public CdmObservableEventFeaturePayment time(CdmObservableCommonTimeTypeEnum time) {
        this.time = time;
        return this;
    }

}
