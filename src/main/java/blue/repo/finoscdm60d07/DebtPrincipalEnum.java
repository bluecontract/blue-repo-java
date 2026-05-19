package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4fkHsFfPbyc8iKnq2NR3afbW9sq2Dd8UeSmkyQbBWio5")
public class DebtPrincipalEnum {
    public static String blueId() {
        return "4fkHsFfPbyc8iKnq2NR3afbW9sq2Dd8UeSmkyQbBWio5";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DebtPrincipalEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DebtPrincipalEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/DebtPrincipalEnum.json";
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

    public DebtPrincipalEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
