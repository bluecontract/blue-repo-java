package blue.repo.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EQhLKv5EAcFriegGYEP7ykwbjeyzFoaTxeizzuTd8VDq")
public class ParticipantActivated {
    public static String blueId() {
        return "EQhLKv5EAcFriegGYEP7ykwbjeyzFoaTxeizzuTd8VDq";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Participant Activated";
    }

    public static String qualifiedName() {
        return "MyOS/Participant Activated";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/MyOS/ParticipantActivated.json";
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

    private Participant participant;

    public String getChannelName() {
        return channelName;
    }

    public ParticipantActivated channelName(String channelName) {
        this.channelName = channelName;
        return this;
    }

    public Participant getParticipant() {
        return participant;
    }

    public ParticipantActivated participant(Participant participant) {
        this.participant = participant;
        return this;
    }

}
