package blue.repo.v1_3_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_3_0.common.Timestamp;

@TypeBlueId("9h1AhEexkxxKLYv1NHbEESYCPtvW7Nt51msGtuQC5jWK")
public class CustomerConsentRevoked extends Event {
    public static String blueId() {
        return "9h1AhEexkxxKLYv1NHbEESYCPtvW7Nt51msGtuQC5jWK";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Customer Consent Revoked";
    }

    public static String qualifiedName() {
        return "Conversation/Customer Consent Revoked";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/Conversation/CustomerConsentRevoked.json";
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
