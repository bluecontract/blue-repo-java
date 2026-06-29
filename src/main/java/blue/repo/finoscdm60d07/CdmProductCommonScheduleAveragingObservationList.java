package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("GVFbbaLLLxVnRS8pEFt4Pwr3VMsXjMm2nM6PdGfDenD3")
public class CdmProductCommonScheduleAveragingObservationList {
    public static String blueId() {
        return "GVFbbaLLLxVnRS8pEFt4Pwr3VMsXjMm2nM6PdGfDenD3";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/AveragingObservationList";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/AveragingObservationList";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonscheduleAveragingObservationList.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmProductCommonScheduleWeightedAveragingObservation> averagingObservation;

    public List<CdmProductCommonScheduleWeightedAveragingObservation> getAveragingObservation() {
        return averagingObservation;
    }

    public CdmProductCommonScheduleAveragingObservationList averagingObservation(List<CdmProductCommonScheduleWeightedAveragingObservation> averagingObservation) {
        this.averagingObservation = averagingObservation;
        return this;
    }

}
