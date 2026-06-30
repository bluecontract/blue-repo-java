package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GDsReUUBoQqUk4nzm4MUFgBzwihcp99Xt2hYSukxTdPp")
public class CdmProductCommonScheduleStubPeriod {
    public static String blueId() {
        return "GDsReUUBoQqUk4nzm4MUFgBzwihcp99Xt2hYSukxTdPp";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/StubPeriod";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/StubPeriod";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonscheduleStubPeriod.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCommonScheduleMetafieldsReferenceWithMetaCalculationPeriodDates calculationPeriodDatesReference;

    private CdmProductAssetStubValue finalStub;

    private CdmProductAssetStubValue initialStub;

    public CdmProductCommonScheduleMetafieldsReferenceWithMetaCalculationPeriodDates getCalculationPeriodDatesReference() {
        return calculationPeriodDatesReference;
    }

    public CdmProductCommonScheduleStubPeriod calculationPeriodDatesReference(CdmProductCommonScheduleMetafieldsReferenceWithMetaCalculationPeriodDates calculationPeriodDatesReference) {
        this.calculationPeriodDatesReference = calculationPeriodDatesReference;
        return this;
    }

    public CdmProductAssetStubValue getFinalStub() {
        return finalStub;
    }

    public CdmProductCommonScheduleStubPeriod finalStub(CdmProductAssetStubValue finalStub) {
        this.finalStub = finalStub;
        return this;
    }

    public CdmProductAssetStubValue getInitialStub() {
        return initialStub;
    }

    public CdmProductCommonScheduleStubPeriod initialStub(CdmProductAssetStubValue initialStub) {
        this.initialStub = initialStub;
        return this;
    }

}
