package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9kisdpJXrGEED251CAWNxKX6uhTasBSpBwNiaicjtR6x")
public class ExerciseProcedure {
    public static String blueId() {
        return "9kisdpJXrGEED251CAWNxKX6uhTasBSpBwNiaicjtR6x";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ExerciseProcedure";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ExerciseProcedure";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ExerciseProcedure.json";
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

    private AutomaticExercise automaticExercise;

    private Boolean followUpConfirmation;

    private Boolean limitedRightToConfirm;

    private ManualExercise manualExercise;

    private Boolean splitTicket;

    public String getNamespace() {
        return namespace;
    }

    public ExerciseProcedure namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AutomaticExercise getAutomaticExercise() {
        return automaticExercise;
    }

    public ExerciseProcedure automaticExercise(AutomaticExercise automaticExercise) {
        this.automaticExercise = automaticExercise;
        return this;
    }

    public Boolean getFollowUpConfirmation() {
        return followUpConfirmation;
    }

    public ExerciseProcedure followUpConfirmation(Boolean followUpConfirmation) {
        this.followUpConfirmation = followUpConfirmation;
        return this;
    }

    public Boolean getLimitedRightToConfirm() {
        return limitedRightToConfirm;
    }

    public ExerciseProcedure limitedRightToConfirm(Boolean limitedRightToConfirm) {
        this.limitedRightToConfirm = limitedRightToConfirm;
        return this;
    }

    public ManualExercise getManualExercise() {
        return manualExercise;
    }

    public ExerciseProcedure manualExercise(ManualExercise manualExercise) {
        this.manualExercise = manualExercise;
        return this;
    }

    public Boolean getSplitTicket() {
        return splitTicket;
    }

    public ExerciseProcedure splitTicket(Boolean splitTicket) {
        this.splitTicket = splitTicket;
        return this;
    }

}
