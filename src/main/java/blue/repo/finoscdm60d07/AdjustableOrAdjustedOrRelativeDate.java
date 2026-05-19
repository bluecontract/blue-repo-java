package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FYJyVGYxP2GD7vW6m7fwvfBppdWaSDvxizuhuvvgtibD")
public class AdjustableOrAdjustedOrRelativeDate {
    public static String blueId() {
        return "FYJyVGYxP2GD7vW6m7fwvfBppdWaSDvxizuhuvvgtibD";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AdjustableOrAdjustedOrRelativeDate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AdjustableOrAdjustedOrRelativeDate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/AdjustableOrAdjustedOrRelativeDate.json";
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

    private RelativeDateOffset relativeDate;

    private String unadjustedDate;

    public String getNamespace() {
        return namespace;
    }

    public AdjustableOrAdjustedOrRelativeDate namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FieldWithMetaString getAdjustedDate() {
        return adjustedDate;
    }

    public AdjustableOrAdjustedOrRelativeDate adjustedDate(FieldWithMetaString adjustedDate) {
        this.adjustedDate = adjustedDate;
        return this;
    }

    public BusinessDayAdjustments getDateAdjustments() {
        return dateAdjustments;
    }

    public AdjustableOrAdjustedOrRelativeDate dateAdjustments(BusinessDayAdjustments dateAdjustments) {
        this.dateAdjustments = dateAdjustments;
        return this;
    }

    public RelativeDateOffset getRelativeDate() {
        return relativeDate;
    }

    public AdjustableOrAdjustedOrRelativeDate relativeDate(RelativeDateOffset relativeDate) {
        this.relativeDate = relativeDate;
        return this;
    }

    public String getUnadjustedDate() {
        return unadjustedDate;
    }

    public AdjustableOrAdjustedOrRelativeDate unadjustedDate(String unadjustedDate) {
        this.unadjustedDate = unadjustedDate;
        return this;
    }

}
