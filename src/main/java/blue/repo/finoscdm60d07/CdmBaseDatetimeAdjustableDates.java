package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("5JcKEFUStAenXhdmeTHE6nvpuhEjPvsvuge4TX2AuQrA")
public class CdmBaseDatetimeAdjustableDates {
    public static String blueId() {
        return "5JcKEFUStAenXhdmeTHE6nvpuhEjPvsvuge4TX2AuQrA";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/AdjustableDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/AdjustableDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimeAdjustableDates.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<ComRosettaModelFieldWithMetaString> adjustedDate;

    private CdmBaseDatetimeBusinessDayAdjustments dateAdjustments;

    private List<String> unadjustedDate;

    public List<ComRosettaModelFieldWithMetaString> getAdjustedDate() {
        return adjustedDate;
    }

    public CdmBaseDatetimeAdjustableDates adjustedDate(List<ComRosettaModelFieldWithMetaString> adjustedDate) {
        this.adjustedDate = adjustedDate;
        return this;
    }

    public CdmBaseDatetimeBusinessDayAdjustments getDateAdjustments() {
        return dateAdjustments;
    }

    public CdmBaseDatetimeAdjustableDates dateAdjustments(CdmBaseDatetimeBusinessDayAdjustments dateAdjustments) {
        this.dateAdjustments = dateAdjustments;
        return this;
    }

    public List<String> getUnadjustedDate() {
        return unadjustedDate;
    }

    public CdmBaseDatetimeAdjustableDates unadjustedDate(List<String> unadjustedDate) {
        this.unadjustedDate = unadjustedDate;
        return this;
    }

}
