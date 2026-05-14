package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("HRnre2NFtrybWEviuxyFN3CutF3HTzU5vwA5YAS8zDc9")
public class ResolvablePriceQuantity {
    public static String blueId() {
        return "HRnre2NFtrybWEviuxyFN3CutF3HTzU5vwA5YAS8zDc9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ResolvablePriceQuantity";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ResolvablePriceQuantity";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ResolvablePriceQuantity.json";
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

    private FutureValueAmount futureValueNotional;

    private List<ReferenceWithMetaPriceSchedule> priceSchedule;

    private QuantityMultiplier quantityMultiplier;

    private ReferenceWithMetaResolvablePriceQuantity quantityReference;

    private ReferenceWithMetaNonNegativeQuantitySchedule quantitySchedule;

    private Boolean reset;

    private Quantity resolvedQuantity;

    public String getNamespace() {
        return namespace;
    }

    public ResolvablePriceQuantity namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FutureValueAmount getFutureValueNotional() {
        return futureValueNotional;
    }

    public ResolvablePriceQuantity futureValueNotional(FutureValueAmount futureValueNotional) {
        this.futureValueNotional = futureValueNotional;
        return this;
    }

    public List<ReferenceWithMetaPriceSchedule> getPriceSchedule() {
        return priceSchedule;
    }

    public ResolvablePriceQuantity priceSchedule(List<ReferenceWithMetaPriceSchedule> priceSchedule) {
        this.priceSchedule = priceSchedule;
        return this;
    }

    public QuantityMultiplier getQuantityMultiplier() {
        return quantityMultiplier;
    }

    public ResolvablePriceQuantity quantityMultiplier(QuantityMultiplier quantityMultiplier) {
        this.quantityMultiplier = quantityMultiplier;
        return this;
    }

    public ReferenceWithMetaResolvablePriceQuantity getQuantityReference() {
        return quantityReference;
    }

    public ResolvablePriceQuantity quantityReference(ReferenceWithMetaResolvablePriceQuantity quantityReference) {
        this.quantityReference = quantityReference;
        return this;
    }

    public ReferenceWithMetaNonNegativeQuantitySchedule getQuantitySchedule() {
        return quantitySchedule;
    }

    public ResolvablePriceQuantity quantitySchedule(ReferenceWithMetaNonNegativeQuantitySchedule quantitySchedule) {
        this.quantitySchedule = quantitySchedule;
        return this;
    }

    public Boolean getReset() {
        return reset;
    }

    public ResolvablePriceQuantity reset(Boolean reset) {
        this.reset = reset;
        return this;
    }

    public Quantity getResolvedQuantity() {
        return resolvedQuantity;
    }

    public ResolvablePriceQuantity resolvedQuantity(Quantity resolvedQuantity) {
        this.resolvedQuantity = resolvedQuantity;
        return this;
    }

}
