package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GhhVrhtTDY87iUm8vR8dYmZxnoUtXhi9h9v6eAcdhphg")
public class AveragingStrikeFeature {
    public static String blueId() {
        return "GhhVrhtTDY87iUm8vR8dYmZxnoUtXhi9h9v6eAcdhphg";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AveragingStrikeFeature";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AveragingStrikeFeature";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/AveragingStrikeFeature.json";
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

    private AveragingCalculation averagingCalculation;

    private ObservationTerms observationTerms;

    public String getNamespace() {
        return namespace;
    }

    public AveragingStrikeFeature namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AveragingCalculation getAveragingCalculation() {
        return averagingCalculation;
    }

    public AveragingStrikeFeature averagingCalculation(AveragingCalculation averagingCalculation) {
        this.averagingCalculation = averagingCalculation;
        return this;
    }

    public ObservationTerms getObservationTerms() {
        return observationTerms;
    }

    public AveragingStrikeFeature observationTerms(ObservationTerms observationTerms) {
        this.observationTerms = observationTerms;
        return this;
    }

}
