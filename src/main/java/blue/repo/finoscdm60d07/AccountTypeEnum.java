package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7iY29Qc8N7SxeB3ohV4Pb6Joza7SEk7ggbvKWkNkLAdZ")
public class AccountTypeEnum {
    public static String blueId() {
        return "7iY29Qc8N7SxeB3ohV4Pb6Joza7SEk7ggbvKWkNkLAdZ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AccountTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AccountTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/AccountTypeEnum.json";
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

    public AccountTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
