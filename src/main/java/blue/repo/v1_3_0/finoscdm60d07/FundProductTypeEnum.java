package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BvZdpXymr9mrkpyuuQG81FFmAtL3vJoL5bggtCMtej23")
public class FundProductTypeEnum {
    public static String blueId() {
        return "BvZdpXymr9mrkpyuuQG81FFmAtL3vJoL5bggtCMtej23";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FundProductTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FundProductTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FundProductTypeEnum.json";
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

    public FundProductTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
