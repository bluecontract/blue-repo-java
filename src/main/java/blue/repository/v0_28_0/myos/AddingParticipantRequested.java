package blue.repository.v0_28_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.conversation.Request;

@TypeBlueId("98JmkF189jZpQRyzaiQxLbc2rRUqnRy2o6bH2qCRaBg3")
public class AddingParticipantRequested extends Request {
    public static String blueId() {
        return "98JmkF189jZpQRyzaiQxLbc2rRUqnRy2o6bH2qCRaBg3";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Adding Participant Requested";
    }

    public static String qualifiedName() {
        return "MyOS/Adding Participant Requested";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/MyOS/AddingParticipantRequested.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String channelName;

    private Node participantBinding;

    public String getChannelName() {
        return channelName;
    }

    public AddingParticipantRequested channelName(String channelName) {
        this.channelName = channelName;
        return this;
    }

    public Node getParticipantBinding() {
        return participantBinding;
    }

    public AddingParticipantRequested participantBinding(Node participantBinding) {
        this.participantBinding = participantBinding;
        return this;
    }

}
