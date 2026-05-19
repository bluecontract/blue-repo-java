package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AVYUqkD3mJqJuUc5wYVfyWDTwQfYepp8PFVfr3pJfdcH")
public class ExerciseFee {
    public static String blueId() {
        return "AVYUqkD3mJqJuUc5wYVfyWDTwQfYepp8PFVfr3pJfdcH";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ExerciseFee";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ExerciseFee";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ExerciseFee.json";
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

    private Double feeAmount;

    private RelativeDateOffset feePaymentDate;

    private Double feeRate;

    private ReferenceWithMetaMoney notionalReference;

    private CounterpartyRoleEnum payer;

    private CounterpartyRoleEnum receiver;

    public String getNamespace() {
        return namespace;
    }

    public ExerciseFee namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Double getFeeAmount() {
        return feeAmount;
    }

    public ExerciseFee feeAmount(Double feeAmount) {
        this.feeAmount = feeAmount;
        return this;
    }

    public RelativeDateOffset getFeePaymentDate() {
        return feePaymentDate;
    }

    public ExerciseFee feePaymentDate(RelativeDateOffset feePaymentDate) {
        this.feePaymentDate = feePaymentDate;
        return this;
    }

    public Double getFeeRate() {
        return feeRate;
    }

    public ExerciseFee feeRate(Double feeRate) {
        this.feeRate = feeRate;
        return this;
    }

    public ReferenceWithMetaMoney getNotionalReference() {
        return notionalReference;
    }

    public ExerciseFee notionalReference(ReferenceWithMetaMoney notionalReference) {
        this.notionalReference = notionalReference;
        return this;
    }

    public CounterpartyRoleEnum getPayer() {
        return payer;
    }

    public ExerciseFee payer(CounterpartyRoleEnum payer) {
        this.payer = payer;
        return this;
    }

    public CounterpartyRoleEnum getReceiver() {
        return receiver;
    }

    public ExerciseFee receiver(CounterpartyRoleEnum receiver) {
        this.receiver = receiver;
        return this;
    }

}
