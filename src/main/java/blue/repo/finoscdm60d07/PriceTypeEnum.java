package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("jwEFZJkBgWYFa4VH5vxpbeNAXBQFhpWs9cxxXoHnUMj")
public class PriceTypeEnum {
    public static String blueId() {
        return "jwEFZJkBgWYFa4VH5vxpbeNAXBQFhpWs9cxxXoHnUMj";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PriceTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PriceTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PriceTypeEnum.json";
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

    public PriceTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
