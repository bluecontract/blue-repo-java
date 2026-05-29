package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("BcvGAzoQ8R7FKbJ1pnoEgjPmP992MTDGuE1LPxWNjyqT#1")
public class CdmEventCommonExerciseInstruction {
    public static String blueId() {
        return "BcvGAzoQ8R7FKbJ1pnoEgjPmP992MTDGuE1LPxWNjyqT#1";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/ExerciseInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/ExerciseInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonExerciseInstruction.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeAdjustableOrAdjustedDate exerciseDate;

    private CdmProductTemplateMetafieldsReferenceWithMetaOptionPayout exerciseOption;

    private CdmEventCommonPrimitiveInstruction exerciseQuantity;

    private CdmBaseDatetimeBusinessCenterTime exerciseTime;

    private List<CdmEventCommonTradeIdentifier> replacementTradeIdentifier;

    public CdmBaseDatetimeAdjustableOrAdjustedDate getExerciseDate() {
        return exerciseDate;
    }

    public CdmEventCommonExerciseInstruction exerciseDate(CdmBaseDatetimeAdjustableOrAdjustedDate exerciseDate) {
        this.exerciseDate = exerciseDate;
        return this;
    }

    public CdmProductTemplateMetafieldsReferenceWithMetaOptionPayout getExerciseOption() {
        return exerciseOption;
    }

    public CdmEventCommonExerciseInstruction exerciseOption(CdmProductTemplateMetafieldsReferenceWithMetaOptionPayout exerciseOption) {
        this.exerciseOption = exerciseOption;
        return this;
    }

    public CdmEventCommonPrimitiveInstruction getExerciseQuantity() {
        return exerciseQuantity;
    }

    public CdmEventCommonExerciseInstruction exerciseQuantity(CdmEventCommonPrimitiveInstruction exerciseQuantity) {
        this.exerciseQuantity = exerciseQuantity;
        return this;
    }

    public CdmBaseDatetimeBusinessCenterTime getExerciseTime() {
        return exerciseTime;
    }

    public CdmEventCommonExerciseInstruction exerciseTime(CdmBaseDatetimeBusinessCenterTime exerciseTime) {
        this.exerciseTime = exerciseTime;
        return this;
    }

    public List<CdmEventCommonTradeIdentifier> getReplacementTradeIdentifier() {
        return replacementTradeIdentifier;
    }

    public CdmEventCommonExerciseInstruction replacementTradeIdentifier(List<CdmEventCommonTradeIdentifier> replacementTradeIdentifier) {
        this.replacementTradeIdentifier = replacementTradeIdentifier;
        return this;
    }

}
