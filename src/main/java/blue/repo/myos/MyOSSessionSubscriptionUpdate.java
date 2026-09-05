package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;
import java.util.List;

@TypeBlueId("BegPKfK2XYMWgJbjtwnZdobDZ8ZGZ4hdCkVDsr6iGLb2")
public class MyOSSessionSubscriptionUpdate extends Response {
    public static String blueId() {
        return "BegPKfK2XYMWgJbjtwnZdobDZ8ZGZ4hdCkVDsr6iGLb2";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS Session Subscription Update";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS Session Subscription Update";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/MyOSSessionSubscriptionUpdate.json";
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

    private Node document;

    private List<Node> events;

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public MyOSSessionSubscriptionUpdate subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public Node getSourceInitialDocument() {
        return sourceInitialDocument;
    }

    public MyOSSessionSubscriptionUpdate sourceInitialDocument(Node sourceInitialDocument) {
        this.sourceInitialDocument = sourceInitialDocument;
        return this;
    }

    public Node getDocument() {
        return document;
    }

    public MyOSSessionSubscriptionUpdate document(Node document) {
        this.document = document;
        return this;
    }

    public List<Node> getEvents() {
        return events;
    }

    public MyOSSessionSubscriptionUpdate events(List<Node> events) {
        this.events = events;
        return this;
    }

}
