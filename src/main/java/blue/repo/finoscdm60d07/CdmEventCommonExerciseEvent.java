package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FxLTZpqx2ynKpEgQNpgo6Y4fzhHv1XfSF148Rxn7cLKW")
public class CdmEventCommonExerciseEvent {
    public static String blueId() {
        return "FxLTZpqx2ynKpEgQNpgo6Y4fzhHv1XfSF148Rxn7cLKW";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/ExerciseEvent";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/ExerciseEvent";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonExerciseEvent.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String adjustedCashSettlementPaymentDate;

    private String adjustedCashSettlementValuationDate;

    private String adjustedExerciseDate;

    private String adjustedExerciseFeePaymentDate;

    private String adjustedRelevantSwapEffectiveDate;

    public String getAdjustedCashSettlementPaymentDate() {
        return adjustedCashSettlementPaymentDate;
    }

    public CdmEventCommonExerciseEvent adjustedCashSettlementPaymentDate(String adjustedCashSettlementPaymentDate) {
        this.adjustedCashSettlementPaymentDate = adjustedCashSettlementPaymentDate;
        return this;
    }

    public String getAdjustedCashSettlementValuationDate() {
        return adjustedCashSettlementValuationDate;
    }

    public CdmEventCommonExerciseEvent adjustedCashSettlementValuationDate(String adjustedCashSettlementValuationDate) {
        this.adjustedCashSettlementValuationDate = adjustedCashSettlementValuationDate;
        return this;
    }

    public String getAdjustedExerciseDate() {
        return adjustedExerciseDate;
    }

    public CdmEventCommonExerciseEvent adjustedExerciseDate(String adjustedExerciseDate) {
        this.adjustedExerciseDate = adjustedExerciseDate;
        return this;
    }

    public String getAdjustedExerciseFeePaymentDate() {
        return adjustedExerciseFeePaymentDate;
    }

    public CdmEventCommonExerciseEvent adjustedExerciseFeePaymentDate(String adjustedExerciseFeePaymentDate) {
        this.adjustedExerciseFeePaymentDate = adjustedExerciseFeePaymentDate;
        return this;
    }

    public String getAdjustedRelevantSwapEffectiveDate() {
        return adjustedRelevantSwapEffectiveDate;
    }

    public CdmEventCommonExerciseEvent adjustedRelevantSwapEffectiveDate(String adjustedRelevantSwapEffectiveDate) {
        this.adjustedRelevantSwapEffectiveDate = adjustedRelevantSwapEffectiveDate;
        return this;
    }

}
