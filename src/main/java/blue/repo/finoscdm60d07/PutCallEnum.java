package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FG3sZiTzKPNeijhhK8kDnSBmCLafmCxgnoDhc5XYAVjz")
public class PutCallEnum {
    public static String blueId() {
        return "FG3sZiTzKPNeijhhK8kDnSBmCLafmCxgnoDhc5XYAVjz";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PutCallEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PutCallEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PutCallEnum.json";
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

    public PutCallEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
