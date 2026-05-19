package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6GAkH2pgnYt5zT2GZeahKRx2yQgCSWwt9KXdn7CEUX6C")
public class CallTypeEnum {
    public static String blueId() {
        return "6GAkH2pgnYt5zT2GZeahKRx2yQgCSWwt9KXdn7CEUX6C";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CallTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CallTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CallTypeEnum.json";
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

    public CallTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
