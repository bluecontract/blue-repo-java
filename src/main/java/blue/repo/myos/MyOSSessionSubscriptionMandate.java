package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.mandate.DocumentResponderMandate;

@TypeBlueId("AL6L3bSbHPYmgh9JXnEPaJbMcUJq5VEzvHU3NK4X34xD")
public class MyOSSessionSubscriptionMandate extends DocumentResponderMandate {
    public static String blueId() {
        return "AL6L3bSbHPYmgh9JXnEPaJbMcUJq5VEzvHU3NK4X34xD";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS Session Subscription Mandate";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS Session Subscription Mandate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/MyOSSessionSubscriptionMandate.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node sourceInitialDocument;

    private String sourceDocumentSessionId;

    private Node linkedDocuments;

    public Node getSourceInitialDocument() {
        return sourceInitialDocument;
    }

    public MyOSSessionSubscriptionMandate sourceInitialDocument(Node sourceInitialDocument) {
        this.sourceInitialDocument = sourceInitialDocument;
        return this;
    }

    public String getSourceDocumentSessionId() {
        return sourceDocumentSessionId;
    }

    public MyOSSessionSubscriptionMandate sourceDocumentSessionId(String sourceDocumentSessionId) {
        this.sourceDocumentSessionId = sourceDocumentSessionId;
        return this;
    }

    public Node getLinkedDocuments() {
        return linkedDocuments;
    }

    public MyOSSessionSubscriptionMandate linkedDocuments(Node linkedDocuments) {
        this.linkedDocuments = linkedDocuments;
        return this;
    }

}
