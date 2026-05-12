package blue.repository.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.conversation.Response;

@TypeBlueId("6efzqM67y1po3YWbsbYSkKW8L41Tx8THeMv1q1TksAmr")
public class RemovingParticipantResponded extends Response {
    public static String blueId() {
        return "6efzqM67y1po3YWbsbYSkKW8L41Tx8THeMv1q1TksAmr";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Removing Participant Responded";
    }

    public static String qualifiedName() {
        return "MyOS/Removing Participant Responded";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/MyOS/RemovingParticipantResponded.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private RemovingParticipantRequested request;

    private String status;

    public RemovingParticipantRequested getRequest() {
        return request;
    }

    public RemovingParticipantResponded request(RemovingParticipantRequested request) {
        this.request = request;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public RemovingParticipantResponded status(String status) {
        this.status = status;
        return this;
    }

}
