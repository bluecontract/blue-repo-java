package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9mRZgNPpJdn5cXkU77DBnBZNfrESkxgCSg6mJqzj8grL")
public class AdjustableOrAdjustedDate {
    public static String blueId() {
        return "9mRZgNPpJdn5cXkU77DBnBZNfrESkxgCSg6mJqzj8grL";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AdjustableOrAdjustedDate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AdjustableOrAdjustedDate";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/AdjustableOrAdjustedDate.json";
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

    private FieldWithMetaString adjustedDate;

    private BusinessDayAdjustments dateAdjustments;

    private String unadjustedDate;

    public String getNamespace() {
        return namespace;
    }

    public AdjustableOrAdjustedDate namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FieldWithMetaString getAdjustedDate() {
        return adjustedDate;
    }

    public AdjustableOrAdjustedDate adjustedDate(FieldWithMetaString adjustedDate) {
        this.adjustedDate = adjustedDate;
        return this;
    }

    public BusinessDayAdjustments getDateAdjustments() {
        return dateAdjustments;
    }

    public AdjustableOrAdjustedDate dateAdjustments(BusinessDayAdjustments dateAdjustments) {
        this.dateAdjustments = dateAdjustments;
        return this;
    }

    public String getUnadjustedDate() {
        return unadjustedDate;
    }

    public AdjustableOrAdjustedDate unadjustedDate(String unadjustedDate) {
        this.unadjustedDate = unadjustedDate;
        return this;
    }

}
