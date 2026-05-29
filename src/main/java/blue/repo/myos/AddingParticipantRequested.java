package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;

@TypeBlueId("BmERQxQSUDw8vTBAR32U9XBcFGjdVfUfpfUhCm1xsxVV")
public class AddingParticipantRequested extends Request {
    public static String blueId() {
        return "BmERQxQSUDw8vTBAR32U9XBcFGjdVfUfpfUhCm1xsxVV";
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
        return "blue/repo/definitions/MyOS/AddingParticipantRequested.json";
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
