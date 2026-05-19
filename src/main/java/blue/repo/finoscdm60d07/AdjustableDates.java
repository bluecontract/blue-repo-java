package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("AG6NtvNFFwKWA7v6kDDiySGkSg45fwcTBYAoXYak7neg")
public class AdjustableDates {
    public static String blueId() {
        return "AG6NtvNFFwKWA7v6kDDiySGkSg45fwcTBYAoXYak7neg";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AdjustableDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AdjustableDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/AdjustableDates.json";
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

    private List<FieldWithMetaString> adjustedDate;

    private BusinessDayAdjustments dateAdjustments;

    private List<String> unadjustedDate;

    public String getNamespace() {
        return namespace;
    }

    public AdjustableDates namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<FieldWithMetaString> getAdjustedDate() {
        return adjustedDate;
    }

    public AdjustableDates adjustedDate(List<FieldWithMetaString> adjustedDate) {
        this.adjustedDate = adjustedDate;
        return this;
    }

    public BusinessDayAdjustments getDateAdjustments() {
        return dateAdjustments;
    }

    public AdjustableDates dateAdjustments(BusinessDayAdjustments dateAdjustments) {
        this.dateAdjustments = dateAdjustments;
        return this;
    }

    public List<String> getUnadjustedDate() {
        return unadjustedDate;
    }

    public AdjustableDates unadjustedDate(List<String> unadjustedDate) {
        this.unadjustedDate = unadjustedDate;
        return this;
    }

}
