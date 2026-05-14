package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6d6HbHywwevGdbjqUGeeofYwThTiwBNfgJ5e73xE9v7q")
public class ForeignExchange {
    public static String blueId() {
        return "6d6HbHywwevGdbjqUGeeofYwThTiwBNfgJ5e73xE9v7q";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ForeignExchange";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ForeignExchange";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ForeignExchange.json";
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

    private Cashflow exchangedCurrency1;

    private Cashflow exchangedCurrency2;

    private Period tenorPeriod;

    public String getNamespace() {
        return namespace;
    }

    public ForeignExchange namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Cashflow getExchangedCurrency1() {
        return exchangedCurrency1;
    }

    public ForeignExchange exchangedCurrency1(Cashflow exchangedCurrency1) {
        this.exchangedCurrency1 = exchangedCurrency1;
        return this;
    }

    public Cashflow getExchangedCurrency2() {
        return exchangedCurrency2;
    }

    public ForeignExchange exchangedCurrency2(Cashflow exchangedCurrency2) {
        this.exchangedCurrency2 = exchangedCurrency2;
        return this;
    }

    public Period getTenorPeriod() {
        return tenorPeriod;
    }

    public ForeignExchange tenorPeriod(Period tenorPeriod) {
        this.tenorPeriod = tenorPeriod;
        return this;
    }

}
