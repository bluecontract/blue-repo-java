package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2NTQ6yhLwyT6d3nvsfpZ7tgtfSN5eHcvqKpQhyD8XjK1")
public class BuyerSeller {
    public static String blueId() {
        return "2NTQ6yhLwyT6d3nvsfpZ7tgtfSN5eHcvqKpQhyD8XjK1";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "BuyerSeller";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/BuyerSeller";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/BuyerSeller.json";
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

    private CounterpartyRoleEnum buyer;

    private CounterpartyRoleEnum seller;

    public String getNamespace() {
        return namespace;
    }

    public BuyerSeller namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CounterpartyRoleEnum getBuyer() {
        return buyer;
    }

    public BuyerSeller buyer(CounterpartyRoleEnum buyer) {
        this.buyer = buyer;
        return this;
    }

    public CounterpartyRoleEnum getSeller() {
        return seller;
    }

    public BuyerSeller seller(CounterpartyRoleEnum seller) {
        this.seller = seller;
        return this;
    }

}
