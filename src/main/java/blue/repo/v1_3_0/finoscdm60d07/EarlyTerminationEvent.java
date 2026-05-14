package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DnjwpjvBmmqgaEE74wmJwFWFrqLt94Cm4Ji59z5DmbPC")
public class EarlyTerminationEvent {
    public static String blueId() {
        return "DnjwpjvBmmqgaEE74wmJwFWFrqLt94Cm4Ji59z5DmbPC";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "EarlyTerminationEvent";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/EarlyTerminationEvent";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/EarlyTerminationEvent.json";
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

    private String adjustedCashSettlementPaymentDate;

    private String adjustedCashSettlementValuationDate;

    private String adjustedEarlyTerminationDate;

    private String adjustedExerciseDate;

    private String adjustedExerciseFeePaymentDate;

    public String getNamespace() {
        return namespace;
    }

    public EarlyTerminationEvent namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getAdjustedCashSettlementPaymentDate() {
        return adjustedCashSettlementPaymentDate;
    }

    public EarlyTerminationEvent adjustedCashSettlementPaymentDate(String adjustedCashSettlementPaymentDate) {
        this.adjustedCashSettlementPaymentDate = adjustedCashSettlementPaymentDate;
        return this;
    }

    public String getAdjustedCashSettlementValuationDate() {
        return adjustedCashSettlementValuationDate;
    }

    public EarlyTerminationEvent adjustedCashSettlementValuationDate(String adjustedCashSettlementValuationDate) {
        this.adjustedCashSettlementValuationDate = adjustedCashSettlementValuationDate;
        return this;
    }

    public String getAdjustedEarlyTerminationDate() {
        return adjustedEarlyTerminationDate;
    }

    public EarlyTerminationEvent adjustedEarlyTerminationDate(String adjustedEarlyTerminationDate) {
        this.adjustedEarlyTerminationDate = adjustedEarlyTerminationDate;
        return this;
    }

    public String getAdjustedExerciseDate() {
        return adjustedExerciseDate;
    }

    public EarlyTerminationEvent adjustedExerciseDate(String adjustedExerciseDate) {
        this.adjustedExerciseDate = adjustedExerciseDate;
        return this;
    }

    public String getAdjustedExerciseFeePaymentDate() {
        return adjustedExerciseFeePaymentDate;
    }

    public EarlyTerminationEvent adjustedExerciseFeePaymentDate(String adjustedExerciseFeePaymentDate) {
        this.adjustedExerciseFeePaymentDate = adjustedExerciseFeePaymentDate;
        return this;
    }

}
