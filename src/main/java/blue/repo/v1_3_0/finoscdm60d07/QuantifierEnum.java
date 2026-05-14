package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6CXzKeVM2AGiXcEPShYNSY1B8UQMkqxS7aw4eMCApEfu")
public class QuantifierEnum {
    public static String blueId() {
        return "6CXzKeVM2AGiXcEPShYNSY1B8UQMkqxS7aw4eMCApEfu";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "QuantifierEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/QuantifierEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/QuantifierEnum.json";
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

    public QuantifierEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
