package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.common.Timestamp;

@TypeBlueId("BffmfCSM6r3GgrQU9XK3Qaj83gw4H8rfa1N7gXuab1ma")
public class CustomerConsentRevoked extends Event {
    public static String blueId() {
        return "BffmfCSM6r3GgrQU9XK3Qaj83gw4H8rfa1N7gXuab1ma";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Customer Consent Revoked";
    }

    public static String qualifiedName() {
        return "Coordination/Customer Consent Revoked";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/CustomerConsentRevoked.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String reason;

    private Timestamp revokedAt;

    public String getReason() {
        return reason;
    }

    public CustomerConsentRevoked reason(String reason) {
        this.reason = reason;
        return this;
    }

    public Timestamp getRevokedAt() {
        return revokedAt;
    }

    public CustomerConsentRevoked revokedAt(Timestamp revokedAt) {
        this.revokedAt = revokedAt;
        return this;
    }

}
