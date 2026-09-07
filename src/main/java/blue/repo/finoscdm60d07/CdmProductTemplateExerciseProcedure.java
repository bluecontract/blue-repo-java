package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6EGhRfB6ccNZdzcgrxjTxg7t2C8431j9YVLncpduSeBa")
public class CdmProductTemplateExerciseProcedure {
    public static String blueId() {
        return "6EGhRfB6ccNZdzcgrxjTxg7t2C8431j9YVLncpduSeBa";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/ExerciseProcedure";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/ExerciseProcedure";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateExerciseProcedure.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductTemplateAutomaticExercise automaticExercise;

    private Boolean followUpConfirmation;

    private Boolean limitedRightToConfirm;

    private CdmProductTemplateManualExercise manualExercise;

    private Boolean splitTicket;

    public CdmProductTemplateAutomaticExercise getAutomaticExercise() {
        return automaticExercise;
    }

    public CdmProductTemplateExerciseProcedure automaticExercise(CdmProductTemplateAutomaticExercise automaticExercise) {
        this.automaticExercise = automaticExercise;
        return this;
    }

    public Boolean getFollowUpConfirmation() {
        return followUpConfirmation;
    }

    public CdmProductTemplateExerciseProcedure followUpConfirmation(Boolean followUpConfirmation) {
        this.followUpConfirmation = followUpConfirmation;
        return this;
    }

    public Boolean getLimitedRightToConfirm() {
        return limitedRightToConfirm;
    }

    public CdmProductTemplateExerciseProcedure limitedRightToConfirm(Boolean limitedRightToConfirm) {
        this.limitedRightToConfirm = limitedRightToConfirm;
        return this;
    }

    public CdmProductTemplateManualExercise getManualExercise() {
        return manualExercise;
    }

    public CdmProductTemplateExerciseProcedure manualExercise(CdmProductTemplateManualExercise manualExercise) {
        this.manualExercise = manualExercise;
        return this;
    }

    public Boolean getSplitTicket() {
        return splitTicket;
    }

    public CdmProductTemplateExerciseProcedure splitTicket(Boolean splitTicket) {
        this.splitTicket = splitTicket;
        return this;
    }

}
