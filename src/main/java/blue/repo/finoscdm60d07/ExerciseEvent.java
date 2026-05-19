package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("H1ivjfXKgSbm84yo8vdR9PZPDiYe57YAu16uRBtYuJSh")
public class ExerciseEvent {
    public static String blueId() {
        return "H1ivjfXKgSbm84yo8vdR9PZPDiYe57YAu16uRBtYuJSh";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ExerciseEvent";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ExerciseEvent";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ExerciseEvent.json";
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

    private String adjustedExerciseDate;

    private String adjustedExerciseFeePaymentDate;

    private String adjustedRelevantSwapEffectiveDate;

    public String getNamespace() {
        return namespace;
    }

    public ExerciseEvent namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getAdjustedCashSettlementPaymentDate() {
        return adjustedCashSettlementPaymentDate;
    }

    public ExerciseEvent adjustedCashSettlementPaymentDate(String adjustedCashSettlementPaymentDate) {
        this.adjustedCashSettlementPaymentDate = adjustedCashSettlementPaymentDate;
        return this;
    }

    public String getAdjustedCashSettlementValuationDate() {
        return adjustedCashSettlementValuationDate;
    }

    public ExerciseEvent adjustedCashSettlementValuationDate(String adjustedCashSettlementValuationDate) {
        this.adjustedCashSettlementValuationDate = adjustedCashSettlementValuationDate;
        return this;
    }

    public String getAdjustedExerciseDate() {
        return adjustedExerciseDate;
    }

    public ExerciseEvent adjustedExerciseDate(String adjustedExerciseDate) {
        this.adjustedExerciseDate = adjustedExerciseDate;
        return this;
    }

    public String getAdjustedExerciseFeePaymentDate() {
        return adjustedExerciseFeePaymentDate;
    }

    public ExerciseEvent adjustedExerciseFeePaymentDate(String adjustedExerciseFeePaymentDate) {
        this.adjustedExerciseFeePaymentDate = adjustedExerciseFeePaymentDate;
        return this;
    }

    public String getAdjustedRelevantSwapEffectiveDate() {
        return adjustedRelevantSwapEffectiveDate;
    }

    public ExerciseEvent adjustedRelevantSwapEffectiveDate(String adjustedRelevantSwapEffectiveDate) {
        this.adjustedRelevantSwapEffectiveDate = adjustedRelevantSwapEffectiveDate;
        return this;
    }

}
