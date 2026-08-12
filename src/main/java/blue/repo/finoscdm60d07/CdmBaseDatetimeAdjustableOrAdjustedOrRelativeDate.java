package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EsGmKpSwEv5rrzVy75nUtg6sXKYHCmZRDzkGMYyQ7zhX")
public class CdmBaseDatetimeAdjustableOrAdjustedOrRelativeDate {
    public static String blueId() {
        return "EsGmKpSwEv5rrzVy75nUtg6sXKYHCmZRDzkGMYyQ7zhX";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/AdjustableOrAdjustedOrRelativeDate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/AdjustableOrAdjustedOrRelativeDate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimeAdjustableOrAdjustedOrRelativeDate.json";
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

    private CdmBaseDatetimeRelativeDateOffset relativeDate;

    private String unadjustedDate;

    public ComRosettaModelFieldWithMetaString getAdjustedDate() {
        return adjustedDate;
    }

    public CdmBaseDatetimeAdjustableOrAdjustedOrRelativeDate adjustedDate(ComRosettaModelFieldWithMetaString adjustedDate) {
        this.adjustedDate = adjustedDate;
        return this;
    }

    public CdmBaseDatetimeBusinessDayAdjustments getDateAdjustments() {
        return dateAdjustments;
    }

    public CdmBaseDatetimeAdjustableOrAdjustedOrRelativeDate dateAdjustments(CdmBaseDatetimeBusinessDayAdjustments dateAdjustments) {
        this.dateAdjustments = dateAdjustments;
        return this;
    }

    public CdmBaseDatetimeRelativeDateOffset getRelativeDate() {
        return relativeDate;
    }

    public CdmBaseDatetimeAdjustableOrAdjustedOrRelativeDate relativeDate(CdmBaseDatetimeRelativeDateOffset relativeDate) {
        this.relativeDate = relativeDate;
        return this;
    }

    public String getUnadjustedDate() {
        return unadjustedDate;
    }

    public CdmBaseDatetimeAdjustableOrAdjustedOrRelativeDate unadjustedDate(String unadjustedDate) {
        this.unadjustedDate = unadjustedDate;
        return this;
    }

}
