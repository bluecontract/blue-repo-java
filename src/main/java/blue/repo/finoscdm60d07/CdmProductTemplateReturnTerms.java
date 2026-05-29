package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3omNSBtAn8AEeitT62cedsBDzqzPJSDpHn85P7HyTtoD")
public class CdmProductTemplateReturnTerms {
    public static String blueId() {
        return "3omNSBtAn8AEeitT62cedsBDzqzPJSDpHn85P7HyTtoD";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/ReturnTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/ReturnTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateReturnTerms.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductAssetCorrelationReturnTerms correlationReturnTerms;

    private CdmProductAssetDividendReturnTerms dividendReturnTerms;

    private CdmProductAssetPriceReturnTerms priceReturnTerms;

    private CdmProductAssetVarianceReturnTerms varianceReturnTerms;

    private CdmProductAssetVolatilityReturnTerms volatilityReturnTerms;

    public CdmProductAssetCorrelationReturnTerms getCorrelationReturnTerms() {
        return correlationReturnTerms;
    }

    public CdmProductTemplateReturnTerms correlationReturnTerms(CdmProductAssetCorrelationReturnTerms correlationReturnTerms) {
        this.correlationReturnTerms = correlationReturnTerms;
        return this;
    }

    public CdmProductAssetDividendReturnTerms getDividendReturnTerms() {
        return dividendReturnTerms;
    }

    public CdmProductTemplateReturnTerms dividendReturnTerms(CdmProductAssetDividendReturnTerms dividendReturnTerms) {
        this.dividendReturnTerms = dividendReturnTerms;
        return this;
    }

    public CdmProductAssetPriceReturnTerms getPriceReturnTerms() {
        return priceReturnTerms;
    }

    public CdmProductTemplateReturnTerms priceReturnTerms(CdmProductAssetPriceReturnTerms priceReturnTerms) {
        this.priceReturnTerms = priceReturnTerms;
        return this;
    }

    public CdmProductAssetVarianceReturnTerms getVarianceReturnTerms() {
        return varianceReturnTerms;
    }

    public CdmProductTemplateReturnTerms varianceReturnTerms(CdmProductAssetVarianceReturnTerms varianceReturnTerms) {
        this.varianceReturnTerms = varianceReturnTerms;
        return this;
    }

    public CdmProductAssetVolatilityReturnTerms getVolatilityReturnTerms() {
        return volatilityReturnTerms;
    }

    public CdmProductTemplateReturnTerms volatilityReturnTerms(CdmProductAssetVolatilityReturnTerms volatilityReturnTerms) {
        this.volatilityReturnTerms = volatilityReturnTerms;
        return this;
    }

}
