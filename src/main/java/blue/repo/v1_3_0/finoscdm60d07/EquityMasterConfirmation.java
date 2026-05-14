package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8UDfkGC9C98uKUGWutGfXTBZRxbuR9RywVFnypsGxDzd")
public class EquityMasterConfirmation {
    public static String blueId() {
        return "8UDfkGC9C98uKUGWutGfXTBZRxbuR9RywVFnypsGxDzd";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "EquityMasterConfirmation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/EquityMasterConfirmation";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/EquityMasterConfirmation.json";
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

    public EquityMasterConfirmation namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
