package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5TF8P1YZtVnW4MLUB8XNfNU9ypzqPgDVZtNQasAEi6BJ")
public class CdmProductCommonScheduleStubCalculationPeriodAmount {
    public static String blueId() {
        return "5TF8P1YZtVnW4MLUB8XNfNU9ypzqPgDVZtNQasAEi6BJ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/StubCalculationPeriodAmount";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/StubCalculationPeriodAmount";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonscheduleStubCalculationPeriodAmount.json";
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

    public CdmProductCommonScheduleStubCalculationPeriodAmount calculationPeriodDatesReference(CdmProductCommonScheduleMetafieldsReferenceWithMetaCalculationPeriodDates calculationPeriodDatesReference) {
        this.calculationPeriodDatesReference = calculationPeriodDatesReference;
        return this;
    }

    public CdmProductAssetStubValue getFinalStub() {
        return finalStub;
    }

    public CdmProductCommonScheduleStubCalculationPeriodAmount finalStub(CdmProductAssetStubValue finalStub) {
        this.finalStub = finalStub;
        return this;
    }

    public CdmProductAssetStubValue getInitialStub() {
        return initialStub;
    }

    public CdmProductCommonScheduleStubCalculationPeriodAmount initialStub(CdmProductAssetStubValue initialStub) {
        this.initialStub = initialStub;
        return this;
    }

}
