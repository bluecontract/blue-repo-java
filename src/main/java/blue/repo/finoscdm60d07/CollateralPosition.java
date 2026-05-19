package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("C8Mnx6MLf56N9kcyR81gdNd7rtp69b8DHt5x2wqVPkna")
public class CollateralPosition {
    public static String blueId() {
        return "C8Mnx6MLf56N9kcyR81gdNd7rtp69b8DHt5x2wqVPkna";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CollateralPosition";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CollateralPosition";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CollateralPosition.json";
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

    private CollateralStatusEnum collateralPositionStatus;

    private List<PriceQuantity> priceQuantity;

    private Product product;

    private ReferenceWithMetaTradeState tradeReference;

    private CollateralTreatment treatment;

    public String getNamespace() {
        return namespace;
    }

    public CollateralPosition namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Money getCashBalance() {
        return cashBalance;
    }

    public CollateralPosition cashBalance(Money cashBalance) {
        this.cashBalance = cashBalance;
        return this;
    }

    public CollateralStatusEnum getCollateralPositionStatus() {
        return collateralPositionStatus;
    }

    public CollateralPosition collateralPositionStatus(CollateralStatusEnum collateralPositionStatus) {
        this.collateralPositionStatus = collateralPositionStatus;
        return this;
    }

    public List<PriceQuantity> getPriceQuantity() {
        return priceQuantity;
    }

    public CollateralPosition priceQuantity(List<PriceQuantity> priceQuantity) {
        this.priceQuantity = priceQuantity;
        return this;
    }

    public Product getProduct() {
        return product;
    }

    public CollateralPosition product(Product product) {
        this.product = product;
        return this;
    }

    public ReferenceWithMetaTradeState getTradeReference() {
        return tradeReference;
    }

    public CollateralPosition tradeReference(ReferenceWithMetaTradeState tradeReference) {
        this.tradeReference = tradeReference;
        return this;
    }

    public CollateralTreatment getTreatment() {
        return treatment;
    }

    public CollateralPosition treatment(CollateralTreatment treatment) {
        this.treatment = treatment;
        return this;
    }

}
