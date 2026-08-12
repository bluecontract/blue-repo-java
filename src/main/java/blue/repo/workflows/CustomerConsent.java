package blue.repo.workflows;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.common.Timestamp;
import java.util.Map;

@TypeBlueId("ATWLhHxoNDLzACS5XaADJWW3iaMDj1pesogCsxdez55w")
public class CustomerConsent {
    public static String blueId() {
        return "ATWLhHxoNDLzACS5XaADJWW3iaMDj1pesogCsxdez55w";
    }

    public static String packageName() {
        return "Workflows";
    }

    public static String typeName() {
        return "Customer Consent";
    }

    public static String qualifiedName() {
        return "Workflows/Customer Consent";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Workflows/CustomerConsent.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node contracts;

    private String consentKind;

    private Map<String, String> consentDetails;

    private String consentStatus;

    private Timestamp grantedAt;

    private Timestamp revokedAt;

    private String revocationReason;

    public Node getContracts() {
        return contracts;
    }

    public CustomerConsent contracts(Node contracts) {
        this.contracts = contracts;
        return this;
    }

    public String getConsentKind() {
        return consentKind;
    }

    public CustomerConsent consentKind(String consentKind) {
        this.consentKind = consentKind;
        return this;
    }

    public Map<String, String> getConsentDetails() {
        return consentDetails;
    }

    public CustomerConsent consentDetails(Map<String, String> consentDetails) {
        this.consentDetails = consentDetails;
        return this;
    }

    public String getConsentStatus() {
        return consentStatus;
    }

    public CustomerConsent consentStatus(String consentStatus) {
        this.consentStatus = consentStatus;
        return this;
    }

    public Timestamp getGrantedAt() {
        return grantedAt;
    }

    public CustomerConsent grantedAt(Timestamp grantedAt) {
        this.grantedAt = grantedAt;
        return this;
    }

    public Timestamp getRevokedAt() {
        return revokedAt;
    }

    public CustomerConsent revokedAt(Timestamp revokedAt) {
        this.revokedAt = revokedAt;
        return this;
    }

    public String getRevocationReason() {
        return revocationReason;
    }

    public CustomerConsent revocationReason(String revocationReason) {
        this.revocationReason = revocationReason;
        return this;
    }

}
