package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7P7Ri4CwwHWRACFsRRhBefcwgSpbjXdU4KyRJWWwWQb9")
public class QuotedCurrencyPair {
    public static String blueId() {
        return "7P7Ri4CwwHWRACFsRRhBefcwgSpbjXdU4KyRJWWwWQb9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "QuotedCurrencyPair";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/QuotedCurrencyPair";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/QuotedCurrencyPair.json";
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

    private FieldWithMetaString currency1;

    private FieldWithMetaString currency2;

    private QuoteBasisEnum quoteBasis;

    public String getNamespace() {
        return namespace;
    }

    public QuotedCurrencyPair namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FieldWithMetaString getCurrency1() {
        return currency1;
    }

    public QuotedCurrencyPair currency1(FieldWithMetaString currency1) {
        this.currency1 = currency1;
        return this;
    }

    public FieldWithMetaString getCurrency2() {
        return currency2;
    }

    public QuotedCurrencyPair currency2(FieldWithMetaString currency2) {
        this.currency2 = currency2;
        return this;
    }

    public QuoteBasisEnum getQuoteBasis() {
        return quoteBasis;
    }

    public QuotedCurrencyPair quoteBasis(QuoteBasisEnum quoteBasis) {
        this.quoteBasis = quoteBasis;
        return this;
    }

}
