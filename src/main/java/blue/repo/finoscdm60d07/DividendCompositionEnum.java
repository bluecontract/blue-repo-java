package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GFdG7o1t6tWRBaoHHSQ5AJF4xE4cs21JYWNwQMsJpUpV")
public class DividendCompositionEnum {
    public static String blueId() {
        return "GFdG7o1t6tWRBaoHHSQ5AJF4xE4cs21JYWNwQMsJpUpV";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DividendCompositionEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DividendCompositionEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/DividendCompositionEnum.json";
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

    public DividendCompositionEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
