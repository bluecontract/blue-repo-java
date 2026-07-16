package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("5dn8zzefpCa8hamHXyoDaw7qZabq8Wdt9nsnm5HbWNVZ")
public class AddingParticipantResponded extends Response {
    public static String blueId() {
        return "5dn8zzefpCa8hamHXyoDaw7qZabq8Wdt9nsnm5HbWNVZ";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Adding Participant Responded";
    }

    public static String qualifiedName() {
        return "MyOS/Adding Participant Responded";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/AddingParticipantResponded.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private AddingParticipantRequested request;

    private String status;

    public AddingParticipantRequested getRequest() {
        return request;
    }

    public AddingParticipantResponded request(AddingParticipantRequested request) {
        this.request = request;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AddingParticipantResponded status(String status) {
        this.status = status;
        return this;
    }

}
