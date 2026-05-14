package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AAT6S15uy3hYt9iAvjeNRh4qvGHZEmvVYW2zF5yVmhqr")
public class PartyDeterminationEnum {
    public static String blueId() {
        return "AAT6S15uy3hYt9iAvjeNRh4qvGHZEmvVYW2zF5yVmhqr";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PartyDeterminationEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PartyDeterminationEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/PartyDeterminationEnum.json";
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

    public PartyDeterminationEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
