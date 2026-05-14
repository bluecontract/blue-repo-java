package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("J8pb3m2xrymrJJdUiirWTTVutttDNTRFfE9pgHy4nBGe")
public class IndexAnnexSourceEnum {
    public static String blueId() {
        return "J8pb3m2xrymrJJdUiirWTTVutttDNTRFfE9pgHy4nBGe";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "IndexAnnexSourceEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/IndexAnnexSourceEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/IndexAnnexSourceEnum.json";
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

    public IndexAnnexSourceEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
