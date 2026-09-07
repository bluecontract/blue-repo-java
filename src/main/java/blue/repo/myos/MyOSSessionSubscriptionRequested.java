package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;
import java.util.List;

@TypeBlueId("E3yaroZeRcxjCSE2gy9sup3weEm6Af61aYafGCdWnQqW")
public class MyOSSessionSubscriptionRequested extends Request {
    public static String blueId() {
        return "E3yaroZeRcxjCSE2gy9sup3weEm6Af61aYafGCdWnQqW";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS Session Subscription Requested";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS Session Subscription Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/MyOSSessionSubscriptionRequested.json";
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

    private MyOSSessionSubscriptionFilter filter;

    private List<Node> linkedDocuments;

    public Node getSourceInitialDocument() {
        return sourceInitialDocument;
    }

    public MyOSSessionSubscriptionRequested sourceInitialDocument(Node sourceInitialDocument) {
        this.sourceInitialDocument = sourceInitialDocument;
        return this;
    }

    public MyOSSessionSubscriptionFilter getFilter() {
        return filter;
    }

    public MyOSSessionSubscriptionRequested filter(MyOSSessionSubscriptionFilter filter) {
        this.filter = filter;
        return this;
    }

    public List<Node> getLinkedDocuments() {
        return linkedDocuments;
    }

    public MyOSSessionSubscriptionRequested linkedDocuments(List<Node> linkedDocuments) {
        this.linkedDocuments = linkedDocuments;
        return this;
    }

}
