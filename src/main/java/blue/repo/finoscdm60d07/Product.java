package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import com.fasterxml.jackson.annotation.JsonProperty;

@TypeBlueId("5kXk9Uzw8zdnt3rnmXD4h4i6DVxmrWtL7ZKyDsPx9nMf#3")
public class Product {
    public static String blueId() {
        return "5kXk9Uzw8zdnt3rnmXD4h4i6DVxmrWtL7ZKyDsPx9nMf#3";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Product";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Product";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Product.json";
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

    // Original Blue property name: NonTransferableProduct
    @JsonProperty("NonTransferableProduct")
    private NonTransferableProduct nonTransferableProduct;

    // Original Blue property name: TransferableProduct
    @JsonProperty("TransferableProduct")
    private TransferableProduct transferableProduct;

    public String getNamespace() {
        return namespace;
    }

    public Product namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public NonTransferableProduct getNonTransferableProduct() {
        return nonTransferableProduct;
    }

    public Product nonTransferableProduct(NonTransferableProduct nonTransferableProduct) {
        this.nonTransferableProduct = nonTransferableProduct;
        return this;
    }

    public TransferableProduct getTransferableProduct() {
        return transferableProduct;
    }

    public Product transferableProduct(TransferableProduct transferableProduct) {
        this.transferableProduct = transferableProduct;
        return this;
    }

}
