package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Fhg6N2irU7zapPNUKn5bE9DRQ58XUNkQJbvM7HjG2zW1")
public class CdmProductTemplateExtensionEvent {
    public static String blueId() {
        return "Fhg6N2irU7zapPNUKn5bE9DRQ58XUNkQJbvM7HjG2zW1";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/ExtensionEvent";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/ExtensionEvent";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateExtensionEvent.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String adjustedExerciseDate;

    private String adjustedExtendedTerminationDate;

    public String getAdjustedExerciseDate() {
        return adjustedExerciseDate;
    }

    public CdmProductTemplateExtensionEvent adjustedExerciseDate(String adjustedExerciseDate) {
        this.adjustedExerciseDate = adjustedExerciseDate;
        return this;
    }

    public String getAdjustedExtendedTerminationDate() {
        return adjustedExtendedTerminationDate;
    }

    public CdmProductTemplateExtensionEvent adjustedExtendedTerminationDate(String adjustedExtendedTerminationDate) {
        this.adjustedExtendedTerminationDate = adjustedExtendedTerminationDate;
        return this;
    }

}
