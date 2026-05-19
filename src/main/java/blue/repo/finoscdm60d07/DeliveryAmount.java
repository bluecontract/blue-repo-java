package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("C2bsvVodgLo5zkFMPHsZKgtQGqHBYEy6whzSRXKFJU85")
public class DeliveryAmount {
    public static String blueId() {
        return "C2bsvVodgLo5zkFMPHsZKgtQGqHBYEy6whzSRXKFJU85";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DeliveryAmount";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DeliveryAmount";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/DeliveryAmount.json";
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

    private String customElection;

    private DeliveryAmountElectionEnum standardElection;

    public String getNamespace() {
        return namespace;
    }

    public DeliveryAmount namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getCustomElection() {
        return customElection;
    }

    public DeliveryAmount customElection(String customElection) {
        this.customElection = customElection;
        return this;
    }

    public DeliveryAmountElectionEnum getStandardElection() {
        return standardElection;
    }

    public DeliveryAmount standardElection(DeliveryAmountElectionEnum standardElection) {
        this.standardElection = standardElection;
        return this;
    }

}
