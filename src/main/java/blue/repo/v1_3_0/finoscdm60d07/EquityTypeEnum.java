package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("93bW1zkPZXZ27eTUESqx9y8TN8iz682WCvNSxfaFuK3Z")
public class EquityTypeEnum {
    public static String blueId() {
        return "93bW1zkPZXZ27eTUESqx9y8TN8iz682WCvNSxfaFuK3Z";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "EquityTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/EquityTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/EquityTypeEnum.json";
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

    public EquityTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
