package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("76dxeVHCy6MJTJczA1e1mViNexgnzE4RJx85Cmf6ug4L")
public class AveragingObservationList {
    public static String blueId() {
        return "76dxeVHCy6MJTJczA1e1mViNexgnzE4RJx85Cmf6ug4L";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AveragingObservationList";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AveragingObservationList";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/AveragingObservationList.json";
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

    private List<WeightedAveragingObservation> averagingObservation;

    public String getNamespace() {
        return namespace;
    }

    public AveragingObservationList namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<WeightedAveragingObservation> getAveragingObservation() {
        return averagingObservation;
    }

    public AveragingObservationList averagingObservation(List<WeightedAveragingObservation> averagingObservation) {
        this.averagingObservation = averagingObservation;
        return this;
    }

}
