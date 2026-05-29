package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2ZFGdsnpngfaZgwXf8UoFcEbgom8Q9pJG8aRS9JWFGsi")
public class CdmProductAssetPriceReturnTerms {
    public static String blueId() {
        return "2ZFGdsnpngfaZgwXf8UoFcEbgom8Q9pJG8aRS9JWFGsi";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/PriceReturnTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/PriceReturnTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetPriceReturnTerms.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Double conversionFactor;

    private String performance;

    private CdmProductAssetReturnTypeEnum returnType;

    public Double getConversionFactor() {
        return conversionFactor;
    }

    public CdmProductAssetPriceReturnTerms conversionFactor(Double conversionFactor) {
        this.conversionFactor = conversionFactor;
        return this;
    }

    public String getPerformance() {
        return performance;
    }

    public CdmProductAssetPriceReturnTerms performance(String performance) {
        this.performance = performance;
        return this;
    }

    public CdmProductAssetReturnTypeEnum getReturnType() {
        return returnType;
    }

    public CdmProductAssetPriceReturnTerms returnType(CdmProductAssetReturnTypeEnum returnType) {
        this.returnType = returnType;
        return this;
    }

}
