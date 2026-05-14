package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GgLuKofJbYPcFoAaAqP8AVcenx7So5VoHUcuJViFuER5")
public class AdjustableDate {
    public static String blueId() {
        return "GgLuKofJbYPcFoAaAqP8AVcenx7So5VoHUcuJViFuER5";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AdjustableDate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AdjustableDate";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/AdjustableDate.json";
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

    private ReferenceWithMetaBusinessDayAdjustments dateAdjustmentsReference;

    private String unadjustedDate;

    public String getNamespace() {
        return namespace;
    }

    public AdjustableDate namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FieldWithMetaString getAdjustedDate() {
        return adjustedDate;
    }

    public AdjustableDate adjustedDate(FieldWithMetaString adjustedDate) {
        this.adjustedDate = adjustedDate;
        return this;
    }

    public BusinessDayAdjustments getDateAdjustments() {
        return dateAdjustments;
    }

    public AdjustableDate dateAdjustments(BusinessDayAdjustments dateAdjustments) {
        this.dateAdjustments = dateAdjustments;
        return this;
    }

    public ReferenceWithMetaBusinessDayAdjustments getDateAdjustmentsReference() {
        return dateAdjustmentsReference;
    }

    public AdjustableDate dateAdjustmentsReference(ReferenceWithMetaBusinessDayAdjustments dateAdjustmentsReference) {
        this.dateAdjustmentsReference = dateAdjustmentsReference;
        return this;
    }

    public String getUnadjustedDate() {
        return unadjustedDate;
    }

    public AdjustableDate unadjustedDate(String unadjustedDate) {
        this.unadjustedDate = unadjustedDate;
        return this;
    }

}
