package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("JD9mxoTsL4zm9dn3pcGaou97J7rTTb1485ydaHfFmdYa")
public class ManualExercise {
    public static String blueId() {
        return "JD9mxoTsL4zm9dn3pcGaou97J7rTTb1485ydaHfFmdYa";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ManualExercise";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ManualExercise";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ManualExercise.json";
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

    private ExerciseNotice exerciseNotice;

    private Boolean fallbackExercise;

    public String getNamespace() {
        return namespace;
    }

    public ManualExercise namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ExerciseNotice getExerciseNotice() {
        return exerciseNotice;
    }

    public ManualExercise exerciseNotice(ExerciseNotice exerciseNotice) {
        this.exerciseNotice = exerciseNotice;
        return this;
    }

    public Boolean getFallbackExercise() {
        return fallbackExercise;
    }

    public ManualExercise fallbackExercise(Boolean fallbackExercise) {
        this.fallbackExercise = fallbackExercise;
        return this;
    }

}
