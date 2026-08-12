package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("G4dRtYHi6XSLg4caxcfJcag7cDcQqTHo18B5pymZAFSP")
public class CdmProductAssetDividendPayoutRatio {
    public static String blueId() {
        return "G4dRtYHi6XSLg4caxcfJcag7cDcQqTHo18B5pymZAFSP";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/DividendPayoutRatio";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/DividendPayoutRatio";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetDividendPayoutRatio.json";
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

    private Double cashRatio;

    private Double nonCashRatio;

    private Double totalRatio;

    public CdmObservableAssetMetafieldsReferenceWithMetaBasketConstituent getBasketConstituent() {
        return basketConstituent;
    }

    public CdmProductAssetDividendPayoutRatio basketConstituent(CdmObservableAssetMetafieldsReferenceWithMetaBasketConstituent basketConstituent) {
        this.basketConstituent = basketConstituent;
        return this;
    }

    public Double getCashRatio() {
        return cashRatio;
    }

    public CdmProductAssetDividendPayoutRatio cashRatio(Double cashRatio) {
        this.cashRatio = cashRatio;
        return this;
    }

    public Double getNonCashRatio() {
        return nonCashRatio;
    }

    public CdmProductAssetDividendPayoutRatio nonCashRatio(Double nonCashRatio) {
        this.nonCashRatio = nonCashRatio;
        return this;
    }

    public Double getTotalRatio() {
        return totalRatio;
    }

    public CdmProductAssetDividendPayoutRatio totalRatio(Double totalRatio) {
        this.totalRatio = totalRatio;
        return this;
    }

}
