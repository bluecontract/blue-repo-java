package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("7nSxNdghnPkGBbyqzqUELC5UcBMNfLdrCr4oXbav2d3J")
public class CdmProductCommonSettlementResolvablePriceQuantity {
    public static String blueId() {
        return "7nSxNdghnPkGBbyqzqUELC5UcBMNfLdrCr4oXbav2d3J";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/ResolvablePriceQuantity";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/ResolvablePriceQuantity";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementResolvablePriceQuantity.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductAssetFutureValueAmount futureValueNotional;

    private List<CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule> priceSchedule;

    private CdmProductCommonSettlementQuantityMultiplier quantityMultiplier;

    private CdmProductCommonSettlementMetafieldsReferenceWithMetaResolvablePriceQuantity quantityReference;

    private CdmBaseMathMetafieldsReferenceWithMetaNonNegativeQuantitySchedule quantitySchedule;

    private Boolean reset;

    private CdmBaseMathQuantity resolvedQuantity;

    public CdmProductAssetFutureValueAmount getFutureValueNotional() {
        return futureValueNotional;
    }

    public CdmProductCommonSettlementResolvablePriceQuantity futureValueNotional(CdmProductAssetFutureValueAmount futureValueNotional) {
        this.futureValueNotional = futureValueNotional;
        return this;
    }

    public List<CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule> getPriceSchedule() {
        return priceSchedule;
    }

    public CdmProductCommonSettlementResolvablePriceQuantity priceSchedule(List<CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule> priceSchedule) {
        this.priceSchedule = priceSchedule;
        return this;
    }

    public CdmProductCommonSettlementQuantityMultiplier getQuantityMultiplier() {
        return quantityMultiplier;
    }

    public CdmProductCommonSettlementResolvablePriceQuantity quantityMultiplier(CdmProductCommonSettlementQuantityMultiplier quantityMultiplier) {
        this.quantityMultiplier = quantityMultiplier;
        return this;
    }

    public CdmProductCommonSettlementMetafieldsReferenceWithMetaResolvablePriceQuantity getQuantityReference() {
        return quantityReference;
    }

    public CdmProductCommonSettlementResolvablePriceQuantity quantityReference(CdmProductCommonSettlementMetafieldsReferenceWithMetaResolvablePriceQuantity quantityReference) {
        this.quantityReference = quantityReference;
        return this;
    }

    public CdmBaseMathMetafieldsReferenceWithMetaNonNegativeQuantitySchedule getQuantitySchedule() {
        return quantitySchedule;
    }

    public CdmProductCommonSettlementResolvablePriceQuantity quantitySchedule(CdmBaseMathMetafieldsReferenceWithMetaNonNegativeQuantitySchedule quantitySchedule) {
        this.quantitySchedule = quantitySchedule;
        return this;
    }

    public Boolean getReset() {
        return reset;
    }

    public CdmProductCommonSettlementResolvablePriceQuantity reset(Boolean reset) {
        this.reset = reset;
        return this;
    }

    public CdmBaseMathQuantity getResolvedQuantity() {
        return resolvedQuantity;
    }

    public CdmProductCommonSettlementResolvablePriceQuantity resolvedQuantity(CdmBaseMathQuantity resolvedQuantity) {
        this.resolvedQuantity = resolvedQuantity;
        return this;
    }

}
