package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("ErZrMNTphbrhdBZXK5fZYiyjBhx6YzMdPXDPZYZtBGEF")
public class DeliveryNearbyTypeEnum {
    public static String blueId() {
        return "ErZrMNTphbrhdBZXK5fZYiyjBhx6YzMdPXDPZYZtBGEF";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DeliveryNearbyTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DeliveryNearbyTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/DeliveryNearbyTypeEnum.json";
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

    public DeliveryNearbyTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
