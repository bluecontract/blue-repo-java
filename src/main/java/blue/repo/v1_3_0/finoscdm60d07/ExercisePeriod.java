package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HebiJwmcgCJ3VRawLCSQ4fYqQaivJQu7YLtcK76pn3Nz")
public class ExercisePeriod {
    public static String blueId() {
        return "HebiJwmcgCJ3VRawLCSQ4fYqQaivJQu7YLtcK76pn3Nz";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ExercisePeriod";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ExercisePeriod";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ExercisePeriod.json";
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

    private Period earliestExerciseDateTenor;

    private Period exerciseFrequency;

    public String getNamespace() {
        return namespace;
    }

    public ExercisePeriod namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Period getEarliestExerciseDateTenor() {
        return earliestExerciseDateTenor;
    }

    public ExercisePeriod earliestExerciseDateTenor(Period earliestExerciseDateTenor) {
        this.earliestExerciseDateTenor = earliestExerciseDateTenor;
        return this;
    }

    public Period getExerciseFrequency() {
        return exerciseFrequency;
    }

    public ExercisePeriod exerciseFrequency(Period exerciseFrequency) {
        this.exerciseFrequency = exerciseFrequency;
        return this;
    }

}
