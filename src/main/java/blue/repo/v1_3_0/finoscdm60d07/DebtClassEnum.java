package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CFsNEFnjVCLe3cF54xZtHTXwPhswsPpkfiY7ZWPufRqe")
public class DebtClassEnum {
    public static String blueId() {
        return "CFsNEFnjVCLe3cF54xZtHTXwPhswsPpkfiY7ZWPufRqe";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DebtClassEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DebtClassEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/DebtClassEnum.json";
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

    public DebtClassEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
