package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("E4LBcLZqVXWj7bfcxZpT3WRYbSWLcVN5e56D4djByoZ3")
public class CorporateActionTypeEnum {
    public static String blueId() {
        return "E4LBcLZqVXWj7bfcxZpT3WRYbSWLcVN5e56D4djByoZ3";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CorporateActionTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CorporateActionTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CorporateActionTypeEnum.json";
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

    public CorporateActionTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
