package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7ncA67peeHVDE7ycaaQzkLneaP8b9kPUiGR6Gi7LBD91")
public class PeriodEnum {
    public static String blueId() {
        return "7ncA67peeHVDE7ycaaQzkLneaP8b9kPUiGR6Gi7LBD91";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PeriodEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PeriodEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PeriodEnum.json";
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

    public PeriodEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
