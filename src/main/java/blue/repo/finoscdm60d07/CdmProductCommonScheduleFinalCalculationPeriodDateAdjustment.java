package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FLLBtJA3uBehX7mffS1DNAvuAgzQmL3tLBCtQL9xQRBY")
public class CdmProductCommonScheduleFinalCalculationPeriodDateAdjustment {
    public static String blueId() {
        return "FLLBtJA3uBehX7mffS1DNAvuAgzQmL3tLBCtQL9xQRBY";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/FinalCalculationPeriodDateAdjustment";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/FinalCalculationPeriodDateAdjustment";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonscheduleFinalCalculationPeriodDateAdjustment.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeBusinessDayConventionEnum businessDayConvention;

    private CdmBaseDatetimeMetafieldsReferenceWithMetaAdjustableOrRelativeDates relevantUnderlyingDateReference;

    private CdmProductAssetMetafieldsReferenceWithMetaInterestRatePayout swapStreamReference;

    public CdmBaseDatetimeBusinessDayConventionEnum getBusinessDayConvention() {
        return businessDayConvention;
    }

    public CdmProductCommonScheduleFinalCalculationPeriodDateAdjustment businessDayConvention(CdmBaseDatetimeBusinessDayConventionEnum businessDayConvention) {
        this.businessDayConvention = businessDayConvention;
        return this;
    }

    public CdmBaseDatetimeMetafieldsReferenceWithMetaAdjustableOrRelativeDates getRelevantUnderlyingDateReference() {
        return relevantUnderlyingDateReference;
    }

    public CdmProductCommonScheduleFinalCalculationPeriodDateAdjustment relevantUnderlyingDateReference(CdmBaseDatetimeMetafieldsReferenceWithMetaAdjustableOrRelativeDates relevantUnderlyingDateReference) {
        this.relevantUnderlyingDateReference = relevantUnderlyingDateReference;
        return this;
    }

    public CdmProductAssetMetafieldsReferenceWithMetaInterestRatePayout getSwapStreamReference() {
        return swapStreamReference;
    }

    public CdmProductCommonScheduleFinalCalculationPeriodDateAdjustment swapStreamReference(CdmProductAssetMetafieldsReferenceWithMetaInterestRatePayout swapStreamReference) {
        this.swapStreamReference = swapStreamReference;
        return this;
    }

}
