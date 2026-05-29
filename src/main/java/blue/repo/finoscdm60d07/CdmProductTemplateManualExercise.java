package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("27HMWrWxgSF8kuk7fXpwAFph18WTLvQS5aYYLvHHtMbP")
public class CdmProductTemplateManualExercise {
    public static String blueId() {
        return "27HMWrWxgSF8kuk7fXpwAFph18WTLvQS5aYYLvHHtMbP";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/ManualExercise";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/ManualExercise";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateManualExercise.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductTemplateExerciseNotice exerciseNotice;

    private Boolean fallbackExercise;

    public CdmProductTemplateExerciseNotice getExerciseNotice() {
        return exerciseNotice;
    }

    public CdmProductTemplateManualExercise exerciseNotice(CdmProductTemplateExerciseNotice exerciseNotice) {
        this.exerciseNotice = exerciseNotice;
        return this;
    }

    public Boolean getFallbackExercise() {
        return fallbackExercise;
    }

    public CdmProductTemplateManualExercise fallbackExercise(Boolean fallbackExercise) {
        this.fallbackExercise = fallbackExercise;
        return this;
    }

}
