package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.common.Currency;
import java.math.BigInteger;

@TypeBlueId("DtMSkzcFRUytFjeQEB5ZSEnu1jewVNMuHbN6sDWKjQ7d")
public class TransactionStatus {
    public static String blueId() {
        return "DtMSkzcFRUytFjeQEB5ZSEnu1jewVNMuHbN6sDWKjQ7d";
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
        return "blue/repo/definitions/PayNote/TransactionStatus.json";
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
