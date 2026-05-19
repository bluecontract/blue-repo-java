package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6hYRmbAj7ehC4aCynN8JRuKaSWvyg83vkbrXkDNa11Zf")
public class CollateralStatusEnum {
    public static String blueId() {
        return "6hYRmbAj7ehC4aCynN8JRuKaSWvyg83vkbrXkDNa11Zf";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CollateralStatusEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CollateralStatusEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CollateralStatusEnum.json";
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

    public CollateralStatusEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
