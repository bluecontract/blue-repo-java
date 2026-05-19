package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("296zD6PqeG38Q2xqEx71iYKy4cxQzbwkLgEiqE2FNY6h")
public class CashflowRepresentation {
    public static String blueId() {
        return "296zD6PqeG38Q2xqEx71iYKy4cxQzbwkLgEiqE2FNY6h";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CashflowRepresentation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CashflowRepresentation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CashflowRepresentation.json";
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

    private Boolean cashflowsMatchParameters;

    private List<PaymentCalculationPeriod> paymentCalculationPeriod;

    public String getNamespace() {
        return namespace;
    }

    public CashflowRepresentation namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getCashflowsMatchParameters() {
        return cashflowsMatchParameters;
    }

    public CashflowRepresentation cashflowsMatchParameters(Boolean cashflowsMatchParameters) {
        this.cashflowsMatchParameters = cashflowsMatchParameters;
        return this;
    }

    public List<PaymentCalculationPeriod> getPaymentCalculationPeriod() {
        return paymentCalculationPeriod;
    }

    public CashflowRepresentation paymentCalculationPeriod(List<PaymentCalculationPeriod> paymentCalculationPeriod) {
        this.paymentCalculationPeriod = paymentCalculationPeriod;
        return this;
    }

}
