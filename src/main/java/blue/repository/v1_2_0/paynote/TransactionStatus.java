package blue.repository.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.common.Currency;
import java.math.BigInteger;

@TypeBlueId("FutWoAEUEb3wkmEm4YP4JGFPtu3B3PQ3m71BmnRFFnsQ")
public class TransactionStatus {
    public static String blueId() {
        return "FutWoAEUEb3wkmEm4YP4JGFPtu3B3PQ3m71BmnRFFnsQ";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Transaction Status";
    }

    public static String qualifiedName() {
        return "PayNote/Transaction Status";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/PayNote/TransactionStatus.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String status;

    private BigInteger authorizedAmountMinor;

    private BigInteger capturedAmountMinor;

    private Currency currency;

    public String getStatus() {
        return status;
    }

    public TransactionStatus status(String status) {
        this.status = status;
        return this;
    }

    public BigInteger getAuthorizedAmountMinor() {
        return authorizedAmountMinor;
    }

    public TransactionStatus authorizedAmountMinor(BigInteger authorizedAmountMinor) {
        this.authorizedAmountMinor = authorizedAmountMinor;
        return this;
    }

    public BigInteger getCapturedAmountMinor() {
        return capturedAmountMinor;
    }

    public TransactionStatus capturedAmountMinor(BigInteger capturedAmountMinor) {
        this.capturedAmountMinor = capturedAmountMinor;
        return this;
    }

    public Currency getCurrency() {
        return currency;
    }

    public TransactionStatus currency(Currency currency) {
        this.currency = currency;
        return this;
    }

}
