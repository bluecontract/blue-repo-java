package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9qFoDxkPgzYwZrpEB91vrJqk72ae3T9eBszqXyZesD5i")
public class NaturalPersonRoleEnum {
    public static String blueId() {
        return "9qFoDxkPgzYwZrpEB91vrJqk72ae3T9eBszqXyZesD5i";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "NaturalPersonRoleEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/NaturalPersonRoleEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/NaturalPersonRoleEnum.json";
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

    public NaturalPersonRoleEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
