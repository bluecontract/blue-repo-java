package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EmwZhjddftGhjHyN21m8sf4f2DU47bmm4Sr9CRk5yM8b")
public class CdmProductTemplateExercisePeriod {
    public static String blueId() {
        return "EmwZhjddftGhjHyN21m8sf4f2DU47bmm4Sr9CRk5yM8b";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/ExercisePeriod";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/ExercisePeriod";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateExercisePeriod.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimePeriod earliestExerciseDateTenor;

    private CdmBaseDatetimePeriod exerciseFrequency;

    public CdmBaseDatetimePeriod getEarliestExerciseDateTenor() {
        return earliestExerciseDateTenor;
    }

    public CdmProductTemplateExercisePeriod earliestExerciseDateTenor(CdmBaseDatetimePeriod earliestExerciseDateTenor) {
        this.earliestExerciseDateTenor = earliestExerciseDateTenor;
        return this;
    }

    public CdmBaseDatetimePeriod getExerciseFrequency() {
        return exerciseFrequency;
    }

    public CdmProductTemplateExercisePeriod exerciseFrequency(CdmBaseDatetimePeriod exerciseFrequency) {
        this.exerciseFrequency = exerciseFrequency;
        return this;
    }

}
