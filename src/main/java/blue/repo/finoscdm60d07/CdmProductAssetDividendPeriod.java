package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EQ1DnA2mvWsTZJUqo9NJBj9AF7uJYZXPRwQw2ZUqpqQC")
public class CdmProductAssetDividendPeriod {
    public static String blueId() {
        return "EQ1DnA2mvWsTZJUqo9NJBj9AF7uJYZXPRwQw2ZUqpqQC";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/DividendPeriod";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/DividendPeriod";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetDividendPeriod.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetMetafieldsReferenceWithMetaBasketConstituent basketConstituent;

    private CdmBaseDatetimeBusinessDayAdjustments dateAdjustments;

    private CdmProductAssetDividendPaymentDate dividendPaymentDate;

    private CdmBaseDatetimeAdjustableOrRelativeDate dividendValuationDate;

    private CdmProductAssetDividendPaymentDate endDate;

    private CdmProductAssetDividendPaymentDate startDate;

    public CdmObservableAssetMetafieldsReferenceWithMetaBasketConstituent getBasketConstituent() {
        return basketConstituent;
    }

    public CdmProductAssetDividendPeriod basketConstituent(CdmObservableAssetMetafieldsReferenceWithMetaBasketConstituent basketConstituent) {
        this.basketConstituent = basketConstituent;
        return this;
    }

    public CdmBaseDatetimeBusinessDayAdjustments getDateAdjustments() {
        return dateAdjustments;
    }

    public CdmProductAssetDividendPeriod dateAdjustments(CdmBaseDatetimeBusinessDayAdjustments dateAdjustments) {
        this.dateAdjustments = dateAdjustments;
        return this;
    }

    public CdmProductAssetDividendPaymentDate getDividendPaymentDate() {
        return dividendPaymentDate;
    }

    public CdmProductAssetDividendPeriod dividendPaymentDate(CdmProductAssetDividendPaymentDate dividendPaymentDate) {
        this.dividendPaymentDate = dividendPaymentDate;
        return this;
    }

    public CdmBaseDatetimeAdjustableOrRelativeDate getDividendValuationDate() {
        return dividendValuationDate;
    }

    public CdmProductAssetDividendPeriod dividendValuationDate(CdmBaseDatetimeAdjustableOrRelativeDate dividendValuationDate) {
        this.dividendValuationDate = dividendValuationDate;
        return this;
    }

    public CdmProductAssetDividendPaymentDate getEndDate() {
        return endDate;
    }

    public CdmProductAssetDividendPeriod endDate(CdmProductAssetDividendPaymentDate endDate) {
        this.endDate = endDate;
        return this;
    }

    public CdmProductAssetDividendPaymentDate getStartDate() {
        return startDate;
    }

    public CdmProductAssetDividendPeriod startDate(CdmProductAssetDividendPaymentDate startDate) {
        this.startDate = startDate;
        return this;
    }

}
