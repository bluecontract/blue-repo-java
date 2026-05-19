package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DzTeu7oCsdEwafTvbz1EcPvQ6Wvxa2wBWYC5CbL29Hcg")
public class DeliveryMethodEnum {
    public static String blueId() {
        return "DzTeu7oCsdEwafTvbz1EcPvQ6Wvxa2wBWYC5CbL29Hcg";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DeliveryMethodEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DeliveryMethodEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/DeliveryMethodEnum.json";
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

    public DeliveryMethodEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
