package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Ck1mZy4M4149QLXabhWMxgW12GkjXM8UqNTh9wZJSPbn")
public class LimitLevelEnum {
    public static String blueId() {
        return "Ck1mZy4M4149QLXabhWMxgW12GkjXM8UqNTh9wZJSPbn";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "LimitLevelEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/LimitLevelEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/LimitLevelEnum.json";
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

    public LimitLevelEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
