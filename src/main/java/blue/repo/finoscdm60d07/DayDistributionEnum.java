package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4LVPGrzA96Uh6Zdw149hUqUfUGpiFbyXumDEHZJtGg7d")
public class DayDistributionEnum {
    public static String blueId() {
        return "4LVPGrzA96Uh6Zdw149hUqUfUGpiFbyXumDEHZJtGg7d";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DayDistributionEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DayDistributionEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/DayDistributionEnum.json";
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

    public DayDistributionEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
