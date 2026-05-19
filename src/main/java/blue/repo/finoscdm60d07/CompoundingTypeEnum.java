package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4KC3AgSLWT5QiSes7iW3SW5wYtSECeUCgQbYvRmkT3iJ")
public class CompoundingTypeEnum {
    public static String blueId() {
        return "4KC3AgSLWT5QiSes7iW3SW5wYtSECeUCgQbYvRmkT3iJ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CompoundingTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CompoundingTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CompoundingTypeEnum.json";
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

    public CompoundingTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
