package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("7YsKn7ZHgyDD7pQjRrdAkov3VoAWp2jXx6L8KBayqGLZ")
public class ExerciseTerms {
    public static String blueId() {
        return "7YsKn7ZHgyDD7pQjRrdAkov3VoAWp2jXx6L8KBayqGLZ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ExerciseTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ExerciseTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ExerciseTerms.json";
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

    private AdjustableOrRelativeDate commencementDate;

    private BusinessCenterTime earliestExerciseTime;

    private AdjustableOrRelativeDates exerciseDates;

    private ExerciseFee exerciseFee;

    private ExerciseFeeSchedule exerciseFeeSchedule;

    private ExerciseProcedure exerciseProcedure;

    private List<AdjustableOrRelativeDate> expirationDate;

    private BusinessCenterTime expirationTime;

    private ExpirationTimeTypeEnum expirationTimeType;

    private BusinessCenterTime latestExerciseTime;

    private MultipleExercise multipleExercise;

    private PartialExercise partialExercise;

    private AdjustableOrRelativeDates relevantUnderlyingDate;

    private OptionExerciseStyleEnum style;

    public String getNamespace() {
        return namespace;
    }

    public ExerciseTerms namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AdjustableOrRelativeDate getCommencementDate() {
        return commencementDate;
    }

    public ExerciseTerms commencementDate(AdjustableOrRelativeDate commencementDate) {
        this.commencementDate = commencementDate;
        return this;
    }

    public BusinessCenterTime getEarliestExerciseTime() {
        return earliestExerciseTime;
    }

    public ExerciseTerms earliestExerciseTime(BusinessCenterTime earliestExerciseTime) {
        this.earliestExerciseTime = earliestExerciseTime;
        return this;
    }

    public AdjustableOrRelativeDates getExerciseDates() {
        return exerciseDates;
    }

    public ExerciseTerms exerciseDates(AdjustableOrRelativeDates exerciseDates) {
        this.exerciseDates = exerciseDates;
        return this;
    }

    public ExerciseFee getExerciseFee() {
        return exerciseFee;
    }

    public ExerciseTerms exerciseFee(ExerciseFee exerciseFee) {
        this.exerciseFee = exerciseFee;
        return this;
    }

    public ExerciseFeeSchedule getExerciseFeeSchedule() {
        return exerciseFeeSchedule;
    }

    public ExerciseTerms exerciseFeeSchedule(ExerciseFeeSchedule exerciseFeeSchedule) {
        this.exerciseFeeSchedule = exerciseFeeSchedule;
        return this;
    }

    public ExerciseProcedure getExerciseProcedure() {
        return exerciseProcedure;
    }

    public ExerciseTerms exerciseProcedure(ExerciseProcedure exerciseProcedure) {
        this.exerciseProcedure = exerciseProcedure;
        return this;
    }

    public List<AdjustableOrRelativeDate> getExpirationDate() {
        return expirationDate;
    }

    public ExerciseTerms expirationDate(List<AdjustableOrRelativeDate> expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    public BusinessCenterTime getExpirationTime() {
        return expirationTime;
    }

    public ExerciseTerms expirationTime(BusinessCenterTime expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    public ExpirationTimeTypeEnum getExpirationTimeType() {
        return expirationTimeType;
    }

    public ExerciseTerms expirationTimeType(ExpirationTimeTypeEnum expirationTimeType) {
        this.expirationTimeType = expirationTimeType;
        return this;
    }

    public BusinessCenterTime getLatestExerciseTime() {
        return latestExerciseTime;
    }

    public ExerciseTerms latestExerciseTime(BusinessCenterTime latestExerciseTime) {
        this.latestExerciseTime = latestExerciseTime;
        return this;
    }

    public MultipleExercise getMultipleExercise() {
        return multipleExercise;
    }

    public ExerciseTerms multipleExercise(MultipleExercise multipleExercise) {
        this.multipleExercise = multipleExercise;
        return this;
    }

    public PartialExercise getPartialExercise() {
        return partialExercise;
    }

    public ExerciseTerms partialExercise(PartialExercise partialExercise) {
        this.partialExercise = partialExercise;
        return this;
    }

    public AdjustableOrRelativeDates getRelevantUnderlyingDate() {
        return relevantUnderlyingDate;
    }

    public ExerciseTerms relevantUnderlyingDate(AdjustableOrRelativeDates relevantUnderlyingDate) {
        this.relevantUnderlyingDate = relevantUnderlyingDate;
        return this;
    }

    public OptionExerciseStyleEnum getStyle() {
        return style;
    }

    public ExerciseTerms style(OptionExerciseStyleEnum style) {
        this.style = style;
        return this;
    }

}
