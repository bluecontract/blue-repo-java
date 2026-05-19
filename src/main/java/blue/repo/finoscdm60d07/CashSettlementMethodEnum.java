package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("26tx1v8BqiKhHAPgG3cEZyNzHrTC7SKUaCnHsukMahLA")
public class CashSettlementMethodEnum {
    public static String blueId() {
        return "26tx1v8BqiKhHAPgG3cEZyNzHrTC7SKUaCnHsukMahLA";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CashSettlementMethodEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CashSettlementMethodEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CashSettlementMethodEnum.json";
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

    public String getNamespace() {
        return namespace;
    }

    public CashSettlementMethodEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
