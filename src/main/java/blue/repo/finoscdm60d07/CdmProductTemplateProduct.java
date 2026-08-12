package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import com.fasterxml.jackson.annotation.JsonProperty;

@TypeBlueId("52zbUBnH8375AE19gNSXRU7GgGs5tcoUhR84LVdMrBWi#0")
public class CdmProductTemplateProduct {
    public static String blueId() {
        return "52zbUBnH8375AE19gNSXRU7GgGs5tcoUhR84LVdMrBWi#0";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/Product";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/Product";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateProduct.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    // Original Blue property name: NonTransferableProduct
    @JsonProperty("NonTransferableProduct")
    private CdmProductTemplateNonTransferableProduct nonTransferableProduct;

    // Original Blue property name: TransferableProduct
    @JsonProperty("TransferableProduct")
    private CdmProductTemplateTransferableProduct transferableProduct;

    public CdmProductTemplateNonTransferableProduct getNonTransferableProduct() {
        return nonTransferableProduct;
    }

    public CdmProductTemplateProduct nonTransferableProduct(CdmProductTemplateNonTransferableProduct nonTransferableProduct) {
        this.nonTransferableProduct = nonTransferableProduct;
        return this;
    }

    public CdmProductTemplateTransferableProduct getTransferableProduct() {
        return transferableProduct;
    }

    public CdmProductTemplateProduct transferableProduct(CdmProductTemplateTransferableProduct transferableProduct) {
        this.transferableProduct = transferableProduct;
        return this;
    }

}
