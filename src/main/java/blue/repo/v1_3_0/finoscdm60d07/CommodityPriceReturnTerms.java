package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FFzAsQUCZYmCovs54RpGJs7EP6kf1mHd4kfE6W2Hf4h5")
public class CommodityPriceReturnTerms {
    public static String blueId() {
        return "FFzAsQUCZYmCovs54RpGJs7EP6kf1mHd4kfE6W2Hf4h5";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CommodityPriceReturnTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CommodityPriceReturnTerms";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CommodityPriceReturnTerms.json";
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

    private Double conversionFactor;

    private RollFeature rollFeature;

    private Rounding rounding;

    private SpreadSchedule spread;

    public String getNamespace() {
        return namespace;
    }

    public CommodityPriceReturnTerms namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Double getConversionFactor() {
        return conversionFactor;
    }

    public CommodityPriceReturnTerms conversionFactor(Double conversionFactor) {
        this.conversionFactor = conversionFactor;
        return this;
    }

    public RollFeature getRollFeature() {
        return rollFeature;
    }

    public CommodityPriceReturnTerms rollFeature(RollFeature rollFeature) {
        this.rollFeature = rollFeature;
        return this;
    }

    public Rounding getRounding() {
        return rounding;
    }

    public CommodityPriceReturnTerms rounding(Rounding rounding) {
        this.rounding = rounding;
        return this;
    }

    public SpreadSchedule getSpread() {
        return spread;
    }

    public CommodityPriceReturnTerms spread(SpreadSchedule spread) {
        this.spread = spread;
        return this;
    }

}
