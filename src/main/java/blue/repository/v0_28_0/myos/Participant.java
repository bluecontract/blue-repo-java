package blue.repository.v0_28_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("phD9k4YTUgGjWeLPKqXNNn6S1PmqSeBJfVscAnUwFhQ")
public class Participant {
    public static String blueId() {
        return "phD9k4YTUgGjWeLPKqXNNn6S1PmqSeBJfVscAnUwFhQ";
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
        return "blue/repository/v0_28_0/definitions/MyOS/Participant.json";
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
