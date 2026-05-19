package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7CgNFaYvZ81Gh5ypAfc1h3K5U2oTNX1EFWcxhPJXw3YV")
public class StrikeSchedule {
    public static String blueId() {
        return "7CgNFaYvZ81Gh5ypAfc1h3K5U2oTNX1EFWcxhPJXw3YV";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "StrikeSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/StrikeSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/StrikeSchedule.json";
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

    private PayerReceiverEnum buyer;

    private ReferenceWithMetaPriceSchedule price;

    private PayerReceiverEnum seller;

    public String getNamespace() {
        return namespace;
    }

    public StrikeSchedule namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public PayerReceiverEnum getBuyer() {
        return buyer;
    }

    public StrikeSchedule buyer(PayerReceiverEnum buyer) {
        this.buyer = buyer;
        return this;
    }

    public ReferenceWithMetaPriceSchedule getPrice() {
        return price;
    }

    public StrikeSchedule price(ReferenceWithMetaPriceSchedule price) {
        this.price = price;
        return this;
    }

    public PayerReceiverEnum getSeller() {
        return seller;
    }

    public StrikeSchedule seller(PayerReceiverEnum seller) {
        this.seller = seller;
        return this;
    }

}
