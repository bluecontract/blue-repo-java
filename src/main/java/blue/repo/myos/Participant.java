package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BDWxt7xTGsK2mZKinCxD4hENHUUfEtupZPtaYzwLmKJm")
public class Participant {
    public static String blueId() {
        return "BDWxt7xTGsK2mZKinCxD4hENHUUfEtupZPtaYzwLmKJm";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Participant";
    }

    public static String qualifiedName() {
        return "MyOS/Participant";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/Participant.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String accountId;

    private String email;

    private String timelineId;

    private ParticipantActivationState status;

    public String getAccountId() {
        return accountId;
    }

    public Participant accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Participant email(String email) {
        this.email = email;
        return this;
    }

    public String getTimelineId() {
        return timelineId;
    }

    public Participant timelineId(String timelineId) {
        this.timelineId = timelineId;
        return this;
    }

    public ParticipantActivationState getStatus() {
        return status;
    }

    public Participant status(ParticipantActivationState status) {
        this.status = status;
        return this;
    }

}
