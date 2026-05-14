package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7wco1UNiJu6XNmJRfqZmanAauDxz6zVV5jyzzmdsjUAm")
public class MarketDisruptionEnum {
    public static String blueId() {
        return "7wco1UNiJu6XNmJRfqZmanAauDxz6zVV5jyzzmdsjUAm";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MarketDisruptionEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MarketDisruptionEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/MarketDisruptionEnum.json";
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

    public MarketDisruptionEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
