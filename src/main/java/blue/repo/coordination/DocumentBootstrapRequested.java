package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.Map;

@TypeBlueId("3Uch8WXAZXUnHiWYF1Y2KaDBnfAFyUbZoDkeoPRYHZWC")
public class DocumentBootstrapRequested extends Request {
    public static String blueId() {
        return "3Uch8WXAZXUnHiWYF1Y2KaDBnfAFyUbZoDkeoPRYHZWC";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Document Bootstrap Requested";
    }

    public static String qualifiedName() {
        return "Coordination/Document Bootstrap Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/DocumentBootstrapRequested.json";
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

    private Map<String, Node> channelBindings;

    private Node initialMessages;

    private String bootstrapAssignee;

    private String onBehalfOf;

    public Node getDocument() {
        return document;
    }

    public DocumentBootstrapRequested document(Node document) {
        this.document = document;
        return this;
    }

    public Map<String, Node> getChannelBindings() {
        return channelBindings;
    }

    public DocumentBootstrapRequested channelBindings(Map<String, Node> channelBindings) {
        this.channelBindings = channelBindings;
        return this;
    }

    public Node getInitialMessages() {
        return initialMessages;
    }

    public DocumentBootstrapRequested initialMessages(Node initialMessages) {
        this.initialMessages = initialMessages;
        return this;
    }

    public String getBootstrapAssignee() {
        return bootstrapAssignee;
    }

    public DocumentBootstrapRequested bootstrapAssignee(String bootstrapAssignee) {
        this.bootstrapAssignee = bootstrapAssignee;
        return this;
    }

    public String getOnBehalfOf() {
        return onBehalfOf;
    }

    public DocumentBootstrapRequested onBehalfOf(String onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
        return this;
    }

}
