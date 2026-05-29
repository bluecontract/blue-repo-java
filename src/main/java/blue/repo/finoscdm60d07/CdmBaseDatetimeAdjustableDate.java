package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("vprnR4tQHf4wLZ7dp16UNnvc9DvyZpCLAWTNXcH1vQH")
public class CdmBaseDatetimeAdjustableDate {
    public static String blueId() {
        return "vprnR4tQHf4wLZ7dp16UNnvc9DvyZpCLAWTNXcH1vQH";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/AdjustableDate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/AdjustableDate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimeAdjustableDate.json";
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

    private CdmBaseDatetimeMetafieldsReferenceWithMetaBusinessDayAdjustments dateAdjustmentsReference;

    private String unadjustedDate;

    public ComRosettaModelFieldWithMetaString getAdjustedDate() {
        return adjustedDate;
    }

    public CdmBaseDatetimeAdjustableDate adjustedDate(ComRosettaModelFieldWithMetaString adjustedDate) {
        this.adjustedDate = adjustedDate;
        return this;
    }

    public CdmBaseDatetimeBusinessDayAdjustments getDateAdjustments() {
        return dateAdjustments;
    }

    public CdmBaseDatetimeAdjustableDate dateAdjustments(CdmBaseDatetimeBusinessDayAdjustments dateAdjustments) {
        this.dateAdjustments = dateAdjustments;
        return this;
    }

    public CdmBaseDatetimeMetafieldsReferenceWithMetaBusinessDayAdjustments getDateAdjustmentsReference() {
        return dateAdjustmentsReference;
    }

    public CdmBaseDatetimeAdjustableDate dateAdjustmentsReference(CdmBaseDatetimeMetafieldsReferenceWithMetaBusinessDayAdjustments dateAdjustmentsReference) {
        this.dateAdjustmentsReference = dateAdjustmentsReference;
        return this;
    }

    public String getUnadjustedDate() {
        return unadjustedDate;
    }

    public CdmBaseDatetimeAdjustableDate unadjustedDate(String unadjustedDate) {
        this.unadjustedDate = unadjustedDate;
        return this;
    }

}
