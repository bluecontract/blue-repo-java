package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("zUsEyks2raxWnqcanopTRjajvh1TzQKhSNAqsJEyYoo")
public class AverageTradingVolume {
    public static String blueId() {
        return "zUsEyks2raxWnqcanopTRjajvh1TzQKhSNAqsJEyYoo";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AverageTradingVolume";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AverageTradingVolume";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/AverageTradingVolume.json";
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

    private AverageTradingVolumeMethodologyEnum methodology;

    private Period period;

    public String getNamespace() {
        return namespace;
    }

    public AverageTradingVolume namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AverageTradingVolumeMethodologyEnum getMethodology() {
        return methodology;
    }

    public AverageTradingVolume methodology(AverageTradingVolumeMethodologyEnum methodology) {
        this.methodology = methodology;
        return this;
    }

    public Period getPeriod() {
        return period;
    }

    public AverageTradingVolume period(Period period) {
        this.period = period;
        return this;
    }

}
