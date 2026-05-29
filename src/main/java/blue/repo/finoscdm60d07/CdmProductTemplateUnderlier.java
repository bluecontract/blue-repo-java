package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import com.fasterxml.jackson.annotation.JsonProperty;

@TypeBlueId("9qWGsXauVnxS5oNKRAwfaMctCyeviwAypHKtHdS4HXZd#3")
public class CdmProductTemplateUnderlier {
    public static String blueId() {
        return "9qWGsXauVnxS5oNKRAwfaMctCyeviwAypHKtHdS4HXZd#3";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/Underlier";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/Underlier";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateUnderlier.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    // Original Blue property name: Observable
    @JsonProperty("Observable")
    private CdmObservableAssetMetafieldsReferenceWithMetaObservable observable;

    // Original Blue property name: Product
    @JsonProperty("Product")
    private CdmProductTemplateProduct product;

    public CdmObservableAssetMetafieldsReferenceWithMetaObservable getObservable() {
        return observable;
    }

    public CdmProductTemplateUnderlier observable(CdmObservableAssetMetafieldsReferenceWithMetaObservable observable) {
        this.observable = observable;
        return this;
    }

    public CdmProductTemplateProduct getProduct() {
        return product;
    }

    public CdmProductTemplateUnderlier product(CdmProductTemplateProduct product) {
        this.product = product;
        return this;
    }

}
