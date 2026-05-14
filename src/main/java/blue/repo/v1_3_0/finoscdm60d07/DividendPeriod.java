package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("57QDQUwM2BW8zRWgEAhzzr7EwqHeyy8igzndjuMfLVuJ")
public class DividendPeriod {
    public static String blueId() {
        return "57QDQUwM2BW8zRWgEAhzzr7EwqHeyy8igzndjuMfLVuJ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DividendPeriod";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DividendPeriod";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/DividendPeriod.json";
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

    private ReferenceWithMetaBasketConstituent basketConstituent;

    private BusinessDayAdjustments dateAdjustments;

    private DividendPaymentDate dividendPaymentDate;

    private AdjustableOrRelativeDate dividendValuationDate;

    private DividendPaymentDate endDate;

    private DividendPaymentDate startDate;

    public String getNamespace() {
        return namespace;
    }

    public DividendPeriod namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ReferenceWithMetaBasketConstituent getBasketConstituent() {
        return basketConstituent;
    }

    public DividendPeriod basketConstituent(ReferenceWithMetaBasketConstituent basketConstituent) {
        this.basketConstituent = basketConstituent;
        return this;
    }

    public BusinessDayAdjustments getDateAdjustments() {
        return dateAdjustments;
    }

    public DividendPeriod dateAdjustments(BusinessDayAdjustments dateAdjustments) {
        this.dateAdjustments = dateAdjustments;
        return this;
    }

    public DividendPaymentDate getDividendPaymentDate() {
        return dividendPaymentDate;
    }

    public DividendPeriod dividendPaymentDate(DividendPaymentDate dividendPaymentDate) {
        this.dividendPaymentDate = dividendPaymentDate;
        return this;
    }

    public AdjustableOrRelativeDate getDividendValuationDate() {
        return dividendValuationDate;
    }

    public DividendPeriod dividendValuationDate(AdjustableOrRelativeDate dividendValuationDate) {
        this.dividendValuationDate = dividendValuationDate;
        return this;
    }

    public DividendPaymentDate getEndDate() {
        return endDate;
    }

    public DividendPeriod endDate(DividendPaymentDate endDate) {
        this.endDate = endDate;
        return this;
    }

    public DividendPaymentDate getStartDate() {
        return startDate;
    }

    public DividendPeriod startDate(DividendPaymentDate startDate) {
        this.startDate = startDate;
        return this;
    }

}
