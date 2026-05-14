package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Fvtz5ftodTxF1MWWkewwnDTjveFtJhZUu3hp6scBn9V2")
public class ExerciseFeeSchedule {
    public static String blueId() {
        return "Fvtz5ftodTxF1MWWkewwnDTjveFtJhZUu3hp6scBn9V2";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ExerciseFeeSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ExerciseFeeSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ExerciseFeeSchedule.json";
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

    private AmountSchedule feeAmountSchedule;

    private RelativeDateOffset feePaymentDate;

    private Schedule feeRateSchedule;

    private ReferenceWithMetaMoney notionalReference;

    private CounterpartyRoleEnum payer;

    private CounterpartyRoleEnum receiver;

    public String getNamespace() {
        return namespace;
    }

    public ExerciseFeeSchedule namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AmountSchedule getFeeAmountSchedule() {
        return feeAmountSchedule;
    }

    public ExerciseFeeSchedule feeAmountSchedule(AmountSchedule feeAmountSchedule) {
        this.feeAmountSchedule = feeAmountSchedule;
        return this;
    }

    public RelativeDateOffset getFeePaymentDate() {
        return feePaymentDate;
    }

    public ExerciseFeeSchedule feePaymentDate(RelativeDateOffset feePaymentDate) {
        this.feePaymentDate = feePaymentDate;
        return this;
    }

    public Schedule getFeeRateSchedule() {
        return feeRateSchedule;
    }

    public ExerciseFeeSchedule feeRateSchedule(Schedule feeRateSchedule) {
        this.feeRateSchedule = feeRateSchedule;
        return this;
    }

    public ReferenceWithMetaMoney getNotionalReference() {
        return notionalReference;
    }

    public ExerciseFeeSchedule notionalReference(ReferenceWithMetaMoney notionalReference) {
        this.notionalReference = notionalReference;
        return this;
    }

    public CounterpartyRoleEnum getPayer() {
        return payer;
    }

    public ExerciseFeeSchedule payer(CounterpartyRoleEnum payer) {
        this.payer = payer;
        return this;
    }

    public CounterpartyRoleEnum getReceiver() {
        return receiver;
    }

    public ExerciseFeeSchedule receiver(CounterpartyRoleEnum receiver) {
        this.receiver = receiver;
        return this;
    }

}
