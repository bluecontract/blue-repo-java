package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("DNCLa19AbeQGvLwDggSDbBKtUMiZ9AHbndAkXs3k4Bcg")
public class MyOSSessionSubscriptionEnded extends Response {
    public static String blueId() {
        return "DNCLa19AbeQGvLwDggSDbBKtUMiZ9AHbndAkXs3k4Bcg";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS Session Subscription Ended";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS Session Subscription Ended";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/MyOSSessionSubscriptionEnded.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String subscriptionId;

    private Node sourceInitialDocument;

    private String reason;

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public MyOSSessionSubscriptionEnded subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public Node getSourceInitialDocument() {
        return sourceInitialDocument;
    }

    public MyOSSessionSubscriptionEnded sourceInitialDocument(Node sourceInitialDocument) {
        this.sourceInitialDocument = sourceInitialDocument;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public MyOSSessionSubscriptionEnded reason(String reason) {
        this.reason = reason;
        return this;
    }

}
