package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("CBN4M5HDnGN1STrbkuST4PB9q5fycXW53pBBjWaBSXWZ")
public class PriceQuantity {
    public static String blueId() {
        return "CBN4M5HDnGN1STrbkuST4PB9q5fycXW53pBBjWaBSXWZ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PriceQuantity";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PriceQuantity";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/PriceQuantity.json";
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

    private AdjustableOrRelativeDate effectiveDate;

    private FieldWithMetaObservable observable;

    private List<FieldWithMetaPriceSchedule> price;

    private List<FieldWithMetaNonNegativeQuantitySchedule> quantity;

    public String getNamespace() {
        return namespace;
    }

    public PriceQuantity namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AdjustableOrRelativeDate getEffectiveDate() {
        return effectiveDate;
    }

    public PriceQuantity effectiveDate(AdjustableOrRelativeDate effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public FieldWithMetaObservable getObservable() {
        return observable;
    }

    public PriceQuantity observable(FieldWithMetaObservable observable) {
        this.observable = observable;
        return this;
    }

    public List<FieldWithMetaPriceSchedule> getPrice() {
        return price;
    }

    public PriceQuantity price(List<FieldWithMetaPriceSchedule> price) {
        this.price = price;
        return this;
    }

    public List<FieldWithMetaNonNegativeQuantitySchedule> getQuantity() {
        return quantity;
    }

    public PriceQuantity quantity(List<FieldWithMetaNonNegativeQuantitySchedule> quantity) {
        this.quantity = quantity;
        return this;
    }

}
