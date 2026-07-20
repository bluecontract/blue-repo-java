package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Event;

@TypeBlueId("3cujh2pNfS1bvc1L5eWhLaaeBepXjByWZ75XF5erArKU")
public class ParticipantResolved extends Event {
    public static String blueId() {
        return "3cujh2pNfS1bvc1L5eWhLaaeBepXjByWZ75XF5erArKU";
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
        return "blue/repo/definitions/MyOS/ParticipantResolved.json";
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
