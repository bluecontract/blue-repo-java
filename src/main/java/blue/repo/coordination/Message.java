package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("768MxgQEHnLSkedHWHtjj43mAjH361Zf6pKZgVxi5po3")
public class Message extends Event {
    public static String blueId() {
        return "768MxgQEHnLSkedHWHtjj43mAjH361Zf6pKZgVxi5po3";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Message";
    }

    public static String qualifiedName() {
        return "Coordination/Message";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/Message.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String requestId;

    private String threadId;

    private String recipientChannel;

    private Node inResponseTo;

    public String getRequestId() {
        return requestId;
    }

    public Message requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getThreadId() {
        return threadId;
    }

    public Message threadId(String threadId) {
        this.threadId = threadId;
        return this;
    }

    public String getRecipientChannel() {
        return recipientChannel;
    }

    public Message recipientChannel(String recipientChannel) {
        this.recipientChannel = recipientChannel;
        return this;
    }

    public Node getInResponseTo() {
        return inResponseTo;
    }

    public Message inResponseTo(Node inResponseTo) {
        this.inResponseTo = inResponseTo;
        return this;
    }

}
