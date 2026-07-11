package blue.repo.bootstrap;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.PrincipalActor;
import blue.repo.coordination.Request;
import java.util.List;

@TypeBlueId("DGtbvBCuFFKAH3ncDb6LAibSAq8Smr5oChLSdvNvGuZu")
public class DocumentBootstrapRequested extends Request {
    public static String blueId() {
        return "DGtbvBCuFFKAH3ncDb6LAibSAq8Smr5oChLSdvNvGuZu";
    }

    public static String packageName() {
        return "Bootstrap";
    }

    public static String typeName() {
        return "Document Bootstrap Requested";
    }

    public static String qualifiedName() {
        return "Bootstrap/Document Bootstrap Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Bootstrap/DocumentBootstrapRequested.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node document;

    private Node channelBindings;

    private List<Node> initialMessages;

    private PrincipalActor onBehalfOf;

    public Node getDocument() {
        return document;
    }

    public DocumentBootstrapRequested document(Node document) {
        this.document = document;
        return this;
    }

    public Node getChannelBindings() {
        return channelBindings;
    }

    public DocumentBootstrapRequested channelBindings(Node channelBindings) {
        this.channelBindings = channelBindings;
        return this;
    }

    public List<Node> getInitialMessages() {
        return initialMessages;
    }

    public DocumentBootstrapRequested initialMessages(List<Node> initialMessages) {
        this.initialMessages = initialMessages;
        return this;
    }

    public PrincipalActor getOnBehalfOf() {
        return onBehalfOf;
    }

    public DocumentBootstrapRequested onBehalfOf(PrincipalActor onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
        return this;
    }

}
