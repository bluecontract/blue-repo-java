package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9vURffQq9RSL6e1qGWqoqbSKX2FaW3fp4RxdMBEQJFZa")
public class PositionEventIntentEnum {
    public static String blueId() {
        return "9vURffQq9RSL6e1qGWqoqbSKX2FaW3fp4RxdMBEQJFZa";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PositionEventIntentEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PositionEventIntentEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/PositionEventIntentEnum.json";
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

    public PositionEventIntentEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
