package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("64PTQ5tRmA9EUvt2nYuwL1XurWEWTaXLb9yxYUDqTdqd")
public class CreditNotation {
    public static String blueId() {
        return "64PTQ5tRmA9EUvt2nYuwL1XurWEWTaXLb9yxYUDqTdqd";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CreditNotation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CreditNotation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CreditNotation.json";
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

    private CreditRatingAgencyEnum agency;

    private CreditRatingCreditWatchEnum creditWatch;

    private CreditRatingDebt debt;

    private FieldWithMetaString notation;

    private CreditRatingOutlookEnum outlook;

    private FieldWithMetaString scale;

    public String getNamespace() {
        return namespace;
    }

    public CreditNotation namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CreditRatingAgencyEnum getAgency() {
        return agency;
    }

    public CreditNotation agency(CreditRatingAgencyEnum agency) {
        this.agency = agency;
        return this;
    }

    public CreditRatingCreditWatchEnum getCreditWatch() {
        return creditWatch;
    }

    public CreditNotation creditWatch(CreditRatingCreditWatchEnum creditWatch) {
        this.creditWatch = creditWatch;
        return this;
    }

    public CreditRatingDebt getDebt() {
        return debt;
    }

    public CreditNotation debt(CreditRatingDebt debt) {
        this.debt = debt;
        return this;
    }

    public FieldWithMetaString getNotation() {
        return notation;
    }

    public CreditNotation notation(FieldWithMetaString notation) {
        this.notation = notation;
        return this;
    }

    public CreditRatingOutlookEnum getOutlook() {
        return outlook;
    }

    public CreditNotation outlook(CreditRatingOutlookEnum outlook) {
        this.outlook = outlook;
        return this;
    }

    public FieldWithMetaString getScale() {
        return scale;
    }

    public CreditNotation scale(FieldWithMetaString scale) {
        this.scale = scale;
        return this;
    }

}
