package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9YpCvHpjjkVKVeqkUBkWZmQsEfzRzg4iTLiAnR8RFpVp")
public class CdmProductTemplateOptionStrike {
    public static String blueId() {
        return "9YpCvHpjjkVKVeqkUBkWZmQsEfzRzg4iTLiAnR8RFpVp";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/OptionStrike";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/OptionStrike";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateOptionStrike.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductTemplateAveragingStrikeFeature averagingStrikeFeature;

    private CdmObservableAssetReferenceSwapCurve referenceSwapCurve;

    private CdmObservableAssetPrice strikePrice;

    private CdmProductAssetMetafieldsReferenceWithMetaFixedRateSpecification strikeReference;

    public CdmProductTemplateAveragingStrikeFeature getAveragingStrikeFeature() {
        return averagingStrikeFeature;
    }

    public CdmProductTemplateOptionStrike averagingStrikeFeature(CdmProductTemplateAveragingStrikeFeature averagingStrikeFeature) {
        this.averagingStrikeFeature = averagingStrikeFeature;
        return this;
    }

    public CdmObservableAssetReferenceSwapCurve getReferenceSwapCurve() {
        return referenceSwapCurve;
    }

    public CdmProductTemplateOptionStrike referenceSwapCurve(CdmObservableAssetReferenceSwapCurve referenceSwapCurve) {
        this.referenceSwapCurve = referenceSwapCurve;
        return this;
    }

    public CdmObservableAssetPrice getStrikePrice() {
        return strikePrice;
    }

    public CdmProductTemplateOptionStrike strikePrice(CdmObservableAssetPrice strikePrice) {
        this.strikePrice = strikePrice;
        return this;
    }

    public CdmProductAssetMetafieldsReferenceWithMetaFixedRateSpecification getStrikeReference() {
        return strikeReference;
    }

    public CdmProductTemplateOptionStrike strikeReference(CdmProductAssetMetafieldsReferenceWithMetaFixedRateSpecification strikeReference) {
        this.strikeReference = strikeReference;
        return this;
    }

}
