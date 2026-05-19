package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4NGpRraKTgNfVCz1m7eYCGenaQMtfCTVRRBwMfvo8Pix")
public class ExtensionEvent {
    public static String blueId() {
        return "4NGpRraKTgNfVCz1m7eYCGenaQMtfCTVRRBwMfvo8Pix";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ExtensionEvent";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ExtensionEvent";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ExtensionEvent.json";
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

    private String adjustedExerciseDate;

    private String adjustedExtendedTerminationDate;

    public String getNamespace() {
        return namespace;
    }

    public ExtensionEvent namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getAdjustedExerciseDate() {
        return adjustedExerciseDate;
    }

    public ExtensionEvent adjustedExerciseDate(String adjustedExerciseDate) {
        this.adjustedExerciseDate = adjustedExerciseDate;
        return this;
    }

    public String getAdjustedExtendedTerminationDate() {
        return adjustedExtendedTerminationDate;
    }

    public ExtensionEvent adjustedExtendedTerminationDate(String adjustedExtendedTerminationDate) {
        this.adjustedExtendedTerminationDate = adjustedExtendedTerminationDate;
        return this;
    }

}
