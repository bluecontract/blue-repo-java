package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("92SHwxzT1biTfbFpaW8VaqdzRRZNLQtBncCUDfPdoGsG")
public class FxRate {
    public static String blueId() {
        return "92SHwxzT1biTfbFpaW8VaqdzRRZNLQtBncCUDfPdoGsG";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FxRate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FxRate";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FxRate.json";
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

    private QuotedCurrencyPair quotedCurrencyPair;

    private Double rate;

    public String getNamespace() {
        return namespace;
    }

    public FxRate namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public QuotedCurrencyPair getQuotedCurrencyPair() {
        return quotedCurrencyPair;
    }

    public FxRate quotedCurrencyPair(QuotedCurrencyPair quotedCurrencyPair) {
        this.quotedCurrencyPair = quotedCurrencyPair;
        return this;
    }

    public Double getRate() {
        return rate;
    }

    public FxRate rate(Double rate) {
        this.rate = rate;
        return this;
    }

}
