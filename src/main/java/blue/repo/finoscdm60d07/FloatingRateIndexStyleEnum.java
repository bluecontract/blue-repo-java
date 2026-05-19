package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2dHHgXgTuTA4emsmaUpUZU2exshb5y4qNLu8L7Uysbeb")
public class FloatingRateIndexStyleEnum {
    public static String blueId() {
        return "2dHHgXgTuTA4emsmaUpUZU2exshb5y4qNLu8L7Uysbeb";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FloatingRateIndexStyleEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FloatingRateIndexStyleEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FloatingRateIndexStyleEnum.json";
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

    public FloatingRateIndexStyleEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
