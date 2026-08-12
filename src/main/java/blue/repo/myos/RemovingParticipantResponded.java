package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("9RMo7whDiDzk2S1uJHCvyoWysg8iSTGgnTM1DT5bNzsH")
public class RemovingParticipantResponded extends Response {
    public static String blueId() {
        return "9RMo7whDiDzk2S1uJHCvyoWysg8iSTGgnTM1DT5bNzsH";
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
        return "blue/repo/definitions/MyOS/RemovingParticipantResponded.json";
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
