package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("x9xSwNmMduqpv3cxogWSwJQzA7rrkyN62nwWHauPnDu")
public class TriggerTypeEnum {
    public static String blueId() {
        return "x9xSwNmMduqpv3cxogWSwJQzA7rrkyN62nwWHauPnDu";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "TriggerTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/TriggerTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/TriggerTypeEnum.json";
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

    public TriggerTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
