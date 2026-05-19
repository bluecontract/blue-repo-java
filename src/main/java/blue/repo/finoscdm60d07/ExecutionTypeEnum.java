package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6GPTMbi6XbnQtY9Jt9DUPM3QkvjzWJNqs6n4AqcoddrU")
public class ExecutionTypeEnum {
    public static String blueId() {
        return "6GPTMbi6XbnQtY9Jt9DUPM3QkvjzWJNqs6n4AqcoddrU";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ExecutionTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ExecutionTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ExecutionTypeEnum.json";
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

    public ExecutionTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
