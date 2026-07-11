package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;
import java.util.Map;

@TypeBlueId("EQx8myuxYAQfzWxuHfXnG97ymr9PbZfUM4R8Eymvbvhg")
public class StartWorkerSessionRequested extends Request {
    public static String blueId() {
        return "EQx8myuxYAQfzWxuHfXnG97ymr9PbZfUM4R8Eymvbvhg";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Start Worker Session Requested";
    }

    public static String qualifiedName() {
        return "MyOS/Start Worker Session Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/StartWorkerSessionRequested.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String onBehalfOf;

    private Node document;

    private Map<String, Node> channelBindings;

    private Node initialMessages;

    private Map<String, Boolean> capabilities;

    public String getOnBehalfOf() {
        return onBehalfOf;
    }

    public StartWorkerSessionRequested onBehalfOf(String onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
        return this;
    }

    public Node getDocument() {
        return document;
    }

    public StartWorkerSessionRequested document(Node document) {
        this.document = document;
        return this;
    }

    public Map<String, Node> getChannelBindings() {
        return channelBindings;
    }

    public StartWorkerSessionRequested channelBindings(Map<String, Node> channelBindings) {
        this.channelBindings = channelBindings;
        return this;
    }

    public Node getInitialMessages() {
        return initialMessages;
    }

    public StartWorkerSessionRequested initialMessages(Node initialMessages) {
        this.initialMessages = initialMessages;
        return this;
    }

    public Map<String, Boolean> getCapabilities() {
        return capabilities;
    }

    public StartWorkerSessionRequested capabilities(Map<String, Boolean> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

}
