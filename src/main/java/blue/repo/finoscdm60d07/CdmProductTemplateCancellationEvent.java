package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GL7kvfLULpeB9V9XXCdKe1UF2uxCtBADgHjSC5EXphAy")
public class CdmProductTemplateCancellationEvent {
    public static String blueId() {
        return "GL7kvfLULpeB9V9XXCdKe1UF2uxCtBADgHjSC5EXphAy";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/CancellationEvent";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/CancellationEvent";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateCancellationEvent.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String adjustedEarlyTerminationDate;

    private String adjustedExerciseDate;

    public String getAdjustedEarlyTerminationDate() {
        return adjustedEarlyTerminationDate;
    }

    public CdmProductTemplateCancellationEvent adjustedEarlyTerminationDate(String adjustedEarlyTerminationDate) {
        this.adjustedEarlyTerminationDate = adjustedEarlyTerminationDate;
        return this;
    }

    public String getAdjustedExerciseDate() {
        return adjustedExerciseDate;
    }

    public CdmProductTemplateCancellationEvent adjustedExerciseDate(String adjustedExerciseDate) {
        this.adjustedExerciseDate = adjustedExerciseDate;
        return this;
    }

}
