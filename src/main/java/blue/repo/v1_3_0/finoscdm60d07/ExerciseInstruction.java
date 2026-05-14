package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("B5XUcBNe5FkFmU33VGqjgsLyReeFsmprVWp1tZ4aeeNE#0")
public class ExerciseInstruction {
    public static String blueId() {
        return "B5XUcBNe5FkFmU33VGqjgsLyReeFsmprVWp1tZ4aeeNE#0";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ExerciseInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ExerciseInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ExerciseInstruction.json";
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

    private AdjustableOrAdjustedDate exerciseDate;

    private ReferenceWithMetaOptionPayout exerciseOption;

    private PrimitiveInstruction exerciseQuantity;

    private BusinessCenterTime exerciseTime;

    private List<TradeIdentifier> replacementTradeIdentifier;

    public String getNamespace() {
        return namespace;
    }

    public ExerciseInstruction namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AdjustableOrAdjustedDate getExerciseDate() {
        return exerciseDate;
    }

    public ExerciseInstruction exerciseDate(AdjustableOrAdjustedDate exerciseDate) {
        this.exerciseDate = exerciseDate;
        return this;
    }

    public ReferenceWithMetaOptionPayout getExerciseOption() {
        return exerciseOption;
    }

    public ExerciseInstruction exerciseOption(ReferenceWithMetaOptionPayout exerciseOption) {
        this.exerciseOption = exerciseOption;
        return this;
    }

    public PrimitiveInstruction getExerciseQuantity() {
        return exerciseQuantity;
    }

    public ExerciseInstruction exerciseQuantity(PrimitiveInstruction exerciseQuantity) {
        this.exerciseQuantity = exerciseQuantity;
        return this;
    }

    public BusinessCenterTime getExerciseTime() {
        return exerciseTime;
    }

    public ExerciseInstruction exerciseTime(BusinessCenterTime exerciseTime) {
        this.exerciseTime = exerciseTime;
        return this;
    }

    public List<TradeIdentifier> getReplacementTradeIdentifier() {
        return replacementTradeIdentifier;
    }

    public ExerciseInstruction replacementTradeIdentifier(List<TradeIdentifier> replacementTradeIdentifier) {
        this.replacementTradeIdentifier = replacementTradeIdentifier;
        return this;
    }

}
