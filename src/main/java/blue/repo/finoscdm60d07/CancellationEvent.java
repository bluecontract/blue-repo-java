package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3uXW8YGzZi2biJn3fY2S8pnSpec2P6vDvJspyv53qVjU")
public class CancellationEvent {
    public static String blueId() {
        return "3uXW8YGzZi2biJn3fY2S8pnSpec2P6vDvJspyv53qVjU";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CancellationEvent";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CancellationEvent";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CancellationEvent.json";
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

    private String adjustedEarlyTerminationDate;

    private String adjustedExerciseDate;

    public String getNamespace() {
        return namespace;
    }

    public CancellationEvent namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getAdjustedEarlyTerminationDate() {
        return adjustedEarlyTerminationDate;
    }

    public CancellationEvent adjustedEarlyTerminationDate(String adjustedEarlyTerminationDate) {
        this.adjustedEarlyTerminationDate = adjustedEarlyTerminationDate;
        return this;
    }

    public String getAdjustedExerciseDate() {
        return adjustedExerciseDate;
    }

    public CancellationEvent adjustedExerciseDate(String adjustedExerciseDate) {
        this.adjustedExerciseDate = adjustedExerciseDate;
        return this;
    }

}
