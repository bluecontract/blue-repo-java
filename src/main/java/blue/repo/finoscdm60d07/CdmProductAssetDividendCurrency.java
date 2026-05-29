package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4gPA4TtCTkNSjhhBS3R28A659MEkv5p7W9fZUumrMyLd")
public class CdmProductAssetDividendCurrency {
    public static String blueId() {
        return "4gPA4TtCTkNSjhhBS3R28A659MEkv5p7W9fZUumrMyLd";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/DividendCurrency";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/DividendCurrency";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetDividendCurrency.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private ComRosettaModelFieldWithMetaString currency;

    private ComRosettaModelMetafieldsReferenceWithMetaString currencyReference;

    private CdmObservableCommonDeterminationMethodEnum determinationMethod;

    public ComRosettaModelFieldWithMetaString getCurrency() {
        return currency;
    }

    public CdmProductAssetDividendCurrency currency(ComRosettaModelFieldWithMetaString currency) {
        this.currency = currency;
        return this;
    }

    public ComRosettaModelMetafieldsReferenceWithMetaString getCurrencyReference() {
        return currencyReference;
    }

    public CdmProductAssetDividendCurrency currencyReference(ComRosettaModelMetafieldsReferenceWithMetaString currencyReference) {
        this.currencyReference = currencyReference;
        return this;
    }

    public CdmObservableCommonDeterminationMethodEnum getDeterminationMethod() {
        return determinationMethod;
    }

    public CdmProductAssetDividendCurrency determinationMethod(CdmObservableCommonDeterminationMethodEnum determinationMethod) {
        this.determinationMethod = determinationMethod;
        return this;
    }

}
