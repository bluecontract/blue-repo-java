package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("A27E1xohHPbrcdgjuzS1bMcf9KzC9xb1fXL5FJEL3gby")
public class StandardizedScheduleAssetClassEnum {
    public static String blueId() {
        return "A27E1xohHPbrcdgjuzS1bMcf9KzC9xb1fXL5FJEL3gby";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "StandardizedScheduleAssetClassEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/StandardizedScheduleAssetClassEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/StandardizedScheduleAssetClassEnum.json";
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

    public StandardizedScheduleAssetClassEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
