package blue.repo.v1_3_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_3_0.conversation.Request;

@TypeBlueId("8PrHr6fcJ1xMyNFptEy2sksyYYuZ48Ypkcnjv4V2WcoD")
public class RemovingParticipantRequested extends Request {
    public static String blueId() {
        return "8PrHr6fcJ1xMyNFptEy2sksyYYuZ48Ypkcnjv4V2WcoD";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Removing Participant Requested";
    }

    public static String qualifiedName() {
        return "MyOS/Removing Participant Requested";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/MyOS/RemovingParticipantRequested.json";
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

    public String getChannelName() {
        return channelName;
    }

    public RemovingParticipantRequested channelName(String channelName) {
        this.channelName = channelName;
        return this;
    }

}
