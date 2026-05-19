package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5xeqf2uhrtfMbQdvC92M5A1a2iCdpM4izhphsoc2LQWF")
public class MoneyBound {
    public static String blueId() {
        return "5xeqf2uhrtfMbQdvC92M5A1a2iCdpM4izhphsoc2LQWF";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MoneyBound";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MoneyBound";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/MoneyBound.json";
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

    private Boolean inclusive;

    private Money money;

    public String getNamespace() {
        return namespace;
    }

    public MoneyBound namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getInclusive() {
        return inclusive;
    }

    public MoneyBound inclusive(Boolean inclusive) {
        this.inclusive = inclusive;
        return this;
    }

    public Money getMoney() {
        return money;
    }

    public MoneyBound money(Money money) {
        this.money = money;
        return this;
    }

}
