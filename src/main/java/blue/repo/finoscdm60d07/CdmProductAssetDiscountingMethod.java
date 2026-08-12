package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("nQ83jRgkpNbMPVNZtMvKxVNog4Z5LhzJe47ocRpDCPb")
public class CdmProductAssetDiscountingMethod {
    public static String blueId() {
        return "nQ83jRgkpNbMPVNZtMvKxVNog4Z5LhzJe47ocRpDCPb";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/DiscountingMethod";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/DiscountingMethod";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetDiscountingMethod.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductAssetDiscountingTypeEnum discountingType;

    private Double discountRate;

    private CdmBaseDatetimeDaycountFieldWithMetaDayCountFractionEnum discountRateDayCountFraction;

    public CdmProductAssetDiscountingTypeEnum getDiscountingType() {
        return discountingType;
    }

    public CdmProductAssetDiscountingMethod discountingType(CdmProductAssetDiscountingTypeEnum discountingType) {
        this.discountingType = discountingType;
        return this;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public CdmProductAssetDiscountingMethod discountRate(Double discountRate) {
        this.discountRate = discountRate;
        return this;
    }

    public CdmBaseDatetimeDaycountFieldWithMetaDayCountFractionEnum getDiscountRateDayCountFraction() {
        return discountRateDayCountFraction;
    }

    public CdmProductAssetDiscountingMethod discountRateDayCountFraction(CdmBaseDatetimeDaycountFieldWithMetaDayCountFractionEnum discountRateDayCountFraction) {
        this.discountRateDayCountFraction = discountRateDayCountFraction;
        return this;
    }

}
