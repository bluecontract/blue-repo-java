package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DdA1XfYPYWcCafA7xcPr6duYFfYLDTM1mn6YTLj1HQhQ")
public class MoneyMarketTypeEnum {
    public static String blueId() {
        return "DdA1XfYPYWcCafA7xcPr6duYFfYLDTM1mn6YTLj1HQhQ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MoneyMarketTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MoneyMarketTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/MoneyMarketTypeEnum.json";
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

    public MoneyMarketTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
