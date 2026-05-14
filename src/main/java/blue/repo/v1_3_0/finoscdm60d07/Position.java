package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("3eU4NCCszrj6MhDev9aHqKS2t6XBSEL7UZvpwwznAbQX")
public class Position {
    public static String blueId() {
        return "3eU4NCCszrj6MhDev9aHqKS2t6XBSEL7UZvpwwznAbQX";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Position";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Position";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Position.json";
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

    private Money cashBalance;

    private List<PriceQuantity> priceQuantity;

    private Product product;

    private ReferenceWithMetaTradeState tradeReference;

    public String getNamespace() {
        return namespace;
    }

    public Position namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Money getCashBalance() {
        return cashBalance;
    }

    public Position cashBalance(Money cashBalance) {
        this.cashBalance = cashBalance;
        return this;
    }

    public List<PriceQuantity> getPriceQuantity() {
        return priceQuantity;
    }

    public Position priceQuantity(List<PriceQuantity> priceQuantity) {
        this.priceQuantity = priceQuantity;
        return this;
    }

    public Product getProduct() {
        return product;
    }

    public Position product(Product product) {
        this.product = product;
        return this;
    }

    public ReferenceWithMetaTradeState getTradeReference() {
        return tradeReference;
    }

    public Position tradeReference(ReferenceWithMetaTradeState tradeReference) {
        this.tradeReference = tradeReference;
        return this;
    }

}
