package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3cDgU98TmLi58SZZBEgT4WeARNt6qoe27TjSRiqYZaau")
public class MasterConfirmationTypeEnum {
    public static String blueId() {
        return "3cDgU98TmLi58SZZBEgT4WeARNt6qoe27TjSRiqYZaau";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MasterConfirmationTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MasterConfirmationTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/MasterConfirmationTypeEnum.json";
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

    public MasterConfirmationTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
