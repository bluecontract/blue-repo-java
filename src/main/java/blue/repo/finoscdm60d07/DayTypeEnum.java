package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8Utptv7prCHT9bj4UBzGdFdJC4pHSGJxAe4NehEFUsce")
public class DayTypeEnum {
    public static String blueId() {
        return "8Utptv7prCHT9bj4UBzGdFdJC4pHSGJxAe4NehEFUsce";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DayTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DayTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/DayTypeEnum.json";
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

    public DayTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
