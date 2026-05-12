package blue.repo.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GZLRe2fEsvs1v7dVcg9kEnCrWEdM3cUZYhFH4XqN5jQT")
public class CardTransactionDetails {
    public static String blueId() {
        return "GZLRe2fEsvs1v7dVcg9kEnCrWEdM3cUZYhFH4XqN5jQT";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Card Transaction Details";
    }

    public static String qualifiedName() {
        return "PayNote/Card Transaction Details";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/PayNote/CardTransactionDetails.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String retrievalReferenceNumber;

    private String systemTraceAuditNumber;

    private String transmissionDateTime;

    private String authorizationCode;

    public String getRetrievalReferenceNumber() {
        return retrievalReferenceNumber;
    }

    public CardTransactionDetails retrievalReferenceNumber(String retrievalReferenceNumber) {
        this.retrievalReferenceNumber = retrievalReferenceNumber;
        return this;
    }

    public String getSystemTraceAuditNumber() {
        return systemTraceAuditNumber;
    }

    public CardTransactionDetails systemTraceAuditNumber(String systemTraceAuditNumber) {
        this.systemTraceAuditNumber = systemTraceAuditNumber;
        return this;
    }

    public String getTransmissionDateTime() {
        return transmissionDateTime;
    }

    public CardTransactionDetails transmissionDateTime(String transmissionDateTime) {
        this.transmissionDateTime = transmissionDateTime;
        return this;
    }

    public String getAuthorizationCode() {
        return authorizationCode;
    }

    public CardTransactionDetails authorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
        return this;
    }

}
