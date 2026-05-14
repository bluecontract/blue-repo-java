package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3nSX3eFwbKFJ4ZoBPCRkY1SRsDYTPDAdMz3naVidsQnr")
public class AdjustableOrRelativeDates {
    public static String blueId() {
        return "3nSX3eFwbKFJ4ZoBPCRkY1SRsDYTPDAdMz3naVidsQnr";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AdjustableOrRelativeDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AdjustableOrRelativeDates";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/AdjustableOrRelativeDates.json";
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

    private AdjustableDates adjustableDates;

    private RelativeDates relativeDates;

    public String getNamespace() {
        return namespace;
    }

    public AdjustableOrRelativeDates namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AdjustableDates getAdjustableDates() {
        return adjustableDates;
    }

    public AdjustableOrRelativeDates adjustableDates(AdjustableDates adjustableDates) {
        this.adjustableDates = adjustableDates;
        return this;
    }

    public RelativeDates getRelativeDates() {
        return relativeDates;
    }

    public AdjustableOrRelativeDates relativeDates(RelativeDates relativeDates) {
        this.relativeDates = relativeDates;
        return this;
    }

}
