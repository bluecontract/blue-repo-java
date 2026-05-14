package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("FLnz4WfeNAWBJM3pgewANCrnYj6AgKBqDnieZkcrVWzd")
public class FutureValueAmount {
    public static String blueId() {
        return "FLnz4WfeNAWBJM3pgewANCrnYj6AgKBqDnieZkcrVWzd";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FutureValueAmount";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FutureValueAmount";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FutureValueAmount.json";
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

    private BigInteger calculationPeriodNumberOfDays;

    private FieldWithMetaString currency;

    private ReferenceWithMetaNonNegativeQuantitySchedule quantity;

    private String valueDate;

    public String getNamespace() {
        return namespace;
    }

    public FutureValueAmount namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public BigInteger getCalculationPeriodNumberOfDays() {
        return calculationPeriodNumberOfDays;
    }

    public FutureValueAmount calculationPeriodNumberOfDays(BigInteger calculationPeriodNumberOfDays) {
        this.calculationPeriodNumberOfDays = calculationPeriodNumberOfDays;
        return this;
    }

    public FieldWithMetaString getCurrency() {
        return currency;
    }

    public FutureValueAmount currency(FieldWithMetaString currency) {
        this.currency = currency;
        return this;
    }

    public ReferenceWithMetaNonNegativeQuantitySchedule getQuantity() {
        return quantity;
    }

    public FutureValueAmount quantity(ReferenceWithMetaNonNegativeQuantitySchedule quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getValueDate() {
        return valueDate;
    }

    public FutureValueAmount valueDate(String valueDate) {
        this.valueDate = valueDate;
        return this;
    }

}
