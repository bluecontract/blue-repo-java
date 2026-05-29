package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("5FV44vQ6KNJuLz77Qpqc71LoiPo1M2CAt3BZ1zBD9DDf")
public class CdmProductCommonScheduleDateRelativeToCalculationPeriodDates {
    public static String blueId() {
        return "5FV44vQ6KNJuLz77Qpqc71LoiPo1M2CAt3BZ1zBD9DDf";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/DateRelativeToCalculationPeriodDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/DateRelativeToCalculationPeriodDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonscheduleDateRelativeToCalculationPeriodDates.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmProductCommonScheduleMetafieldsReferenceWithMetaCalculationPeriodDates> calculationPeriodDatesReference;

    public List<CdmProductCommonScheduleMetafieldsReferenceWithMetaCalculationPeriodDates> getCalculationPeriodDatesReference() {
        return calculationPeriodDatesReference;
    }

    public CdmProductCommonScheduleDateRelativeToCalculationPeriodDates calculationPeriodDatesReference(List<CdmProductCommonScheduleMetafieldsReferenceWithMetaCalculationPeriodDates> calculationPeriodDatesReference) {
        this.calculationPeriodDatesReference = calculationPeriodDatesReference;
        return this;
    }

}
