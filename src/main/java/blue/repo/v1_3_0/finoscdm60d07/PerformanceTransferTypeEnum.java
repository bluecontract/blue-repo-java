package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("D93GBkyd68xyANC8jthJ5etD4FfoxCDXpNhSByBTSvnb")
public class PerformanceTransferTypeEnum {
    public static String blueId() {
        return "D93GBkyd68xyANC8jthJ5etD4FfoxCDXpNhSByBTSvnb";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PerformanceTransferTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PerformanceTransferTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/PerformanceTransferTypeEnum.json";
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

    public PerformanceTransferTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
