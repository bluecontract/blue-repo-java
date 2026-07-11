package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;

@TypeBlueId("BcSFAt3ZtG3CdpNzKUKBodvz9cux8kwtbNNNPrrhYSja")
public class RemovingParticipantRequested extends Request {
    public static String blueId() {
        return "BcSFAt3ZtG3CdpNzKUKBodvz9cux8kwtbNNNPrrhYSja";
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
        return "blue/repo/definitions/MyOS/RemovingParticipantRequested.json";
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
