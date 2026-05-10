package blue.repository.v0_28_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.core.Channel;
import java.util.Map;

@TypeBlueId("4derXUpwPZDDkBpYPCTMr6t3mbeGU7AUYmvfW22cZior")
public class DocumentBootstrapRequested extends Request {
    public static String blueId() {
        return "4derXUpwPZDDkBpYPCTMr6t3mbeGU7AUYmvfW22cZior";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Document Bootstrap Requested";
    }

    public static String qualifiedName() {
        return "Conversation/Document Bootstrap Requested";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/Conversation/DocumentBootstrapRequested.json";
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

    private Map<String, Channel> channelBindings;

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

    public Map<String, Channel> getChannelBindings() {
        return channelBindings;
    }

    public DocumentBootstrapRequested channelBindings(Map<String, Channel> channelBindings) {
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
