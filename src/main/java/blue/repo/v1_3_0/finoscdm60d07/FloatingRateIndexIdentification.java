package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CPWLBNsX4TWEZrvv93qjAKorRJH7VggkdzTgZQrZEpic")
public class FloatingRateIndexIdentification {
    public static String blueId() {
        return "CPWLBNsX4TWEZrvv93qjAKorRJH7VggkdzTgZQrZEpic";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FloatingRateIndexIdentification";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FloatingRateIndexIdentification";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FloatingRateIndexIdentification.json";
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

    private ISOCurrencyCodeEnum currency;

    private FieldWithMetaFloatingRateIndexEnum floatingRateIndex;

    private String froType;

    public String getNamespace() {
        return namespace;
    }

    public FloatingRateIndexIdentification namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ISOCurrencyCodeEnum getCurrency() {
        return currency;
    }

    public FloatingRateIndexIdentification currency(ISOCurrencyCodeEnum currency) {
        this.currency = currency;
        return this;
    }

    public FieldWithMetaFloatingRateIndexEnum getFloatingRateIndex() {
        return floatingRateIndex;
    }

    public FloatingRateIndexIdentification floatingRateIndex(FieldWithMetaFloatingRateIndexEnum floatingRateIndex) {
        this.floatingRateIndex = floatingRateIndex;
        return this;
    }

    public String getFroType() {
        return froType;
    }

    public FloatingRateIndexIdentification froType(String froType) {
        this.froType = froType;
        return this;
    }

}
