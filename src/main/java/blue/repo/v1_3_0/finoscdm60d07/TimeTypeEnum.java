package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GxfUf2qdd3EqvMhZ8XBUiFk5Cu8CSWELHHJZ6TWKMrd9")
public class TimeTypeEnum {
    public static String blueId() {
        return "GxfUf2qdd3EqvMhZ8XBUiFk5Cu8CSWELHHJZ6TWKMrd9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "TimeTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/TimeTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/TimeTypeEnum.json";
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

    public TimeTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
