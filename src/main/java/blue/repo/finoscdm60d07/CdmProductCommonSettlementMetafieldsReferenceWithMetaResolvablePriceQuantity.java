package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Dyqr7TA1HN5EcvzLV8Yzj2SDcBRhKaKqVGCBXkTfUDZZ")
public class CdmProductCommonSettlementMetafieldsReferenceWithMetaResolvablePriceQuantity {
    public static String blueId() {
        return "Dyqr7TA1HN5EcvzLV8Yzj2SDcBRhKaKqVGCBXkTfUDZZ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/metafields/ReferenceWithMetaResolvablePriceQuantity";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/metafields/ReferenceWithMetaResolvablePriceQuantity";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementmetafieldsReferenceWithMetaResolvablePriceQuantity.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private ComRosettaModelLibMetaReference address;

    private String externalReference;

    private String globalReference;

    public ComRosettaModelLibMetaReference getAddress() {
        return address;
    }

    public CdmProductCommonSettlementMetafieldsReferenceWithMetaResolvablePriceQuantity address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmProductCommonSettlementMetafieldsReferenceWithMetaResolvablePriceQuantity externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmProductCommonSettlementMetafieldsReferenceWithMetaResolvablePriceQuantity globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
