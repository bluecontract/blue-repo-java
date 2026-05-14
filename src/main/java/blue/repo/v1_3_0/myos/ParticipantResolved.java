package blue.repo.v1_3_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EQVu8aZyp5ivTyKpSm8ueVsDLgprfcrHzr5QWdH1p6Cz")
public class ParticipantResolved {
    public static String blueId() {
        return "EQVu8aZyp5ivTyKpSm8ueVsDLgprfcrHzr5QWdH1p6Cz";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Participant Resolved";
    }

    public static String qualifiedName() {
        return "MyOS/Participant Resolved";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/MyOS/ParticipantResolved.json";
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

    public ParticipantResolved channelName(String channelName) {
        this.channelName = channelName;
        return this;
    }

    public Participant getParticipant() {
        return participant;
    }

    public ParticipantResolved participant(Participant participant) {
        this.participant = participant;
        return this;
    }

}
