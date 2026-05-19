package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FcqrEn6cjxo4VzsXaUEh87LajQhfbAckd3JUgGtCpMtg")
public class AverageTradingVolumeMethodologyEnum {
    public static String blueId() {
        return "FcqrEn6cjxo4VzsXaUEh87LajQhfbAckd3JUgGtCpMtg";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AverageTradingVolumeMethodologyEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AverageTradingVolumeMethodologyEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/AverageTradingVolumeMethodologyEnum.json";
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

    public String getNamespace() {
        return namespace;
    }

    public AverageTradingVolumeMethodologyEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
