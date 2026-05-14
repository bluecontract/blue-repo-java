package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BAfxMKfyh37Uh2KRUJf6XgoHnc7AnAYYCeNKGR7RMJ8J")
public class RegMarginTypeEnum {
    public static String blueId() {
        return "BAfxMKfyh37Uh2KRUJf6XgoHnc7AnAYYCeNKGR7RMJ8J";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "RegMarginTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/RegMarginTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/RegMarginTypeEnum.json";
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

    public RegMarginTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
