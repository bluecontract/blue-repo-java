package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Hc3Jg3R2Yiqptd8j3sd4kPnTmKCoFJQbYtxTDPfhdna5")
public class MasterConfirmationBase {
    public static String blueId() {
        return "Hc3Jg3R2Yiqptd8j3sd4kPnTmKCoFJQbYtxTDPfhdna5";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MasterConfirmationBase";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MasterConfirmationBase";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/MasterConfirmationBase.json";
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

    public MasterConfirmationBase namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
