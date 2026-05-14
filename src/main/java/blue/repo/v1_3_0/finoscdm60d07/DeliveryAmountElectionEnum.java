package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Hj68aecdNTWfhwvENUbGmN15Nsrced69MBpyKGuLUhhZ")
public class DeliveryAmountElectionEnum {
    public static String blueId() {
        return "Hj68aecdNTWfhwvENUbGmN15Nsrced69MBpyKGuLUhhZ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DeliveryAmountElectionEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DeliveryAmountElectionEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/DeliveryAmountElectionEnum.json";
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

    public DeliveryAmountElectionEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
