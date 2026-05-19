package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6XFQwPiJPU2LegeZTxqtQeFLvp6GntPf6pUekcBtsM5N")
public class TriggerTimeTypeEnum {
    public static String blueId() {
        return "6XFQwPiJPU2LegeZTxqtQeFLvp6GntPf6pUekcBtsM5N";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "TriggerTimeTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/TriggerTimeTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/TriggerTimeTypeEnum.json";
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

    public TriggerTimeTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
