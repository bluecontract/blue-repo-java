package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7Tc1qpgo4nmwbREJEQ737vKZJfh9AxWrzmozZLjrQSbT")
public class CallingPartyEnum {
    public static String blueId() {
        return "7Tc1qpgo4nmwbREJEQ737vKZJfh9AxWrzmozZLjrQSbT";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CallingPartyEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CallingPartyEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CallingPartyEnum.json";
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

    public CallingPartyEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
