package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8ukLgf8jW8X4readUHYkXmSPo7dCATQYVSqqs97Ph8bo")
public class CdmBaseDatetimeAdjustableOrAdjustedDate {
    public static String blueId() {
        return "8ukLgf8jW8X4readUHYkXmSPo7dCATQYVSqqs97Ph8bo";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/AdjustableOrAdjustedDate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/AdjustableOrAdjustedDate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimeAdjustableOrAdjustedDate.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private ComRosettaModelFieldWithMetaString adjustedDate;

    private CdmBaseDatetimeBusinessDayAdjustments dateAdjustments;

    private String unadjustedDate;

    public ComRosettaModelFieldWithMetaString getAdjustedDate() {
        return adjustedDate;
    }

    public CdmBaseDatetimeAdjustableOrAdjustedDate adjustedDate(ComRosettaModelFieldWithMetaString adjustedDate) {
        this.adjustedDate = adjustedDate;
        return this;
    }

    public CdmBaseDatetimeBusinessDayAdjustments getDateAdjustments() {
        return dateAdjustments;
    }

    public CdmBaseDatetimeAdjustableOrAdjustedDate dateAdjustments(CdmBaseDatetimeBusinessDayAdjustments dateAdjustments) {
        this.dateAdjustments = dateAdjustments;
        return this;
    }

    public String getUnadjustedDate() {
        return unadjustedDate;
    }

    public CdmBaseDatetimeAdjustableOrAdjustedDate unadjustedDate(String unadjustedDate) {
        this.unadjustedDate = unadjustedDate;
        return this;
    }

}
