package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("De5YXF512CWnhYDb8NFdkqKwTZLVw52SGQtM5q5jEvM1")
public class AssetTypeEnum {
    public static String blueId() {
        return "De5YXF512CWnhYDb8NFdkqKwTZLVw52SGQtM5q5jEvM1";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AssetTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AssetTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/AssetTypeEnum.json";
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

    public AssetTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
