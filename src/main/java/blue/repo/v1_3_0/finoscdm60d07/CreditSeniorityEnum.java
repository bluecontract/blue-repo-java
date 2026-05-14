package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3w2fQ9dcKbDM3czbe29E59KrRNt7u4Vbfjbq63tmfiLz")
public class CreditSeniorityEnum {
    public static String blueId() {
        return "3w2fQ9dcKbDM3czbe29E59KrRNt7u4Vbfjbq63tmfiLz";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CreditSeniorityEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CreditSeniorityEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CreditSeniorityEnum.json";
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

    public CreditSeniorityEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
