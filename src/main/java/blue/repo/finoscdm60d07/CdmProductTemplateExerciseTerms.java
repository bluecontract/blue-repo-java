package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("5gJQwLbmDRFr1hrMPaZEsHFgWih7ce9ciXS2YMUGt55A")
public class CdmProductTemplateExerciseTerms {
    public static String blueId() {
        return "5gJQwLbmDRFr1hrMPaZEsHFgWih7ce9ciXS2YMUGt55A";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/ExerciseTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/ExerciseTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateExerciseTerms.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeAdjustableOrRelativeDate commencementDate;

    private CdmBaseDatetimeBusinessCenterTime earliestExerciseTime;

    private CdmBaseDatetimeAdjustableOrRelativeDates exerciseDates;

    private CdmProductTemplateExerciseFee exerciseFee;

    private CdmProductTemplateExerciseFeeSchedule exerciseFeeSchedule;

    private CdmProductTemplateExerciseProcedure exerciseProcedure;

    private List<CdmBaseDatetimeAdjustableOrRelativeDate> expirationDate;

    private CdmBaseDatetimeBusinessCenterTime expirationTime;

    private CdmProductTemplateExpirationTimeTypeEnum expirationTimeType;

    private CdmBaseDatetimeBusinessCenterTime latestExerciseTime;

    private CdmProductTemplateMultipleExercise multipleExercise;

    private CdmProductTemplatePartialExercise partialExercise;

    private CdmBaseDatetimeAdjustableOrRelativeDates relevantUnderlyingDate;

    private CdmProductTemplateOptionExerciseStyleEnum style;

    public CdmBaseDatetimeAdjustableOrRelativeDate getCommencementDate() {
        return commencementDate;
    }

    public CdmProductTemplateExerciseTerms commencementDate(CdmBaseDatetimeAdjustableOrRelativeDate commencementDate) {
        this.commencementDate = commencementDate;
        return this;
    }

    public CdmBaseDatetimeBusinessCenterTime getEarliestExerciseTime() {
        return earliestExerciseTime;
    }

    public CdmProductTemplateExerciseTerms earliestExerciseTime(CdmBaseDatetimeBusinessCenterTime earliestExerciseTime) {
        this.earliestExerciseTime = earliestExerciseTime;
        return this;
    }

    public CdmBaseDatetimeAdjustableOrRelativeDates getExerciseDates() {
        return exerciseDates;
    }

    public CdmProductTemplateExerciseTerms exerciseDates(CdmBaseDatetimeAdjustableOrRelativeDates exerciseDates) {
        this.exerciseDates = exerciseDates;
        return this;
    }

    public CdmProductTemplateExerciseFee getExerciseFee() {
        return exerciseFee;
    }

    public CdmProductTemplateExerciseTerms exerciseFee(CdmProductTemplateExerciseFee exerciseFee) {
        this.exerciseFee = exerciseFee;
        return this;
    }

    public CdmProductTemplateExerciseFeeSchedule getExerciseFeeSchedule() {
        return exerciseFeeSchedule;
    }

    public CdmProductTemplateExerciseTerms exerciseFeeSchedule(CdmProductTemplateExerciseFeeSchedule exerciseFeeSchedule) {
        this.exerciseFeeSchedule = exerciseFeeSchedule;
        return this;
    }

    public CdmProductTemplateExerciseProcedure getExerciseProcedure() {
        return exerciseProcedure;
    }

    public CdmProductTemplateExerciseTerms exerciseProcedure(CdmProductTemplateExerciseProcedure exerciseProcedure) {
        this.exerciseProcedure = exerciseProcedure;
        return this;
    }

    public List<CdmBaseDatetimeAdjustableOrRelativeDate> getExpirationDate() {
        return expirationDate;
    }

    public CdmProductTemplateExerciseTerms expirationDate(List<CdmBaseDatetimeAdjustableOrRelativeDate> expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    public CdmBaseDatetimeBusinessCenterTime getExpirationTime() {
        return expirationTime;
    }

    public CdmProductTemplateExerciseTerms expirationTime(CdmBaseDatetimeBusinessCenterTime expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    public CdmProductTemplateExpirationTimeTypeEnum getExpirationTimeType() {
        return expirationTimeType;
    }

    public CdmProductTemplateExerciseTerms expirationTimeType(CdmProductTemplateExpirationTimeTypeEnum expirationTimeType) {
        this.expirationTimeType = expirationTimeType;
        return this;
    }

    public CdmBaseDatetimeBusinessCenterTime getLatestExerciseTime() {
        return latestExerciseTime;
    }

    public CdmProductTemplateExerciseTerms latestExerciseTime(CdmBaseDatetimeBusinessCenterTime latestExerciseTime) {
        this.latestExerciseTime = latestExerciseTime;
        return this;
    }

    public CdmProductTemplateMultipleExercise getMultipleExercise() {
        return multipleExercise;
    }

    public CdmProductTemplateExerciseTerms multipleExercise(CdmProductTemplateMultipleExercise multipleExercise) {
        this.multipleExercise = multipleExercise;
        return this;
    }

    public CdmProductTemplatePartialExercise getPartialExercise() {
        return partialExercise;
    }

    public CdmProductTemplateExerciseTerms partialExercise(CdmProductTemplatePartialExercise partialExercise) {
        this.partialExercise = partialExercise;
        return this;
    }

    public CdmBaseDatetimeAdjustableOrRelativeDates getRelevantUnderlyingDate() {
        return relevantUnderlyingDate;
    }

    public CdmProductTemplateExerciseTerms relevantUnderlyingDate(CdmBaseDatetimeAdjustableOrRelativeDates relevantUnderlyingDate) {
        this.relevantUnderlyingDate = relevantUnderlyingDate;
        return this;
    }

    public CdmProductTemplateOptionExerciseStyleEnum getStyle() {
        return style;
    }

    public CdmProductTemplateExerciseTerms style(CdmProductTemplateOptionExerciseStyleEnum style) {
        this.style = style;
        return this;
    }

}
