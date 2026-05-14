package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AgxUkZQdxJ1RSx2pLjw3FiRh9QSyEjq6UscYcFFBhNc7")
public class MasterAgreementClauseIdentifierEnum {
    public static String blueId() {
        return "AgxUkZQdxJ1RSx2pLjw3FiRh9QSyEjq6UscYcFFBhNc7";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MasterAgreementClauseIdentifierEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MasterAgreementClauseIdentifierEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/MasterAgreementClauseIdentifierEnum.json";
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

    public MasterAgreementClauseIdentifierEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
