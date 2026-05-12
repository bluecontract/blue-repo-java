package blue.repository.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.conversation.Response;
import java.util.List;

@TypeBlueId("3P4vsTx8Ky2pucXxKgkn8MouveP2DBRjkwZckCG5b9Lb")
public class CallOperationResponded extends Response {
    public static String blueId() {
        return "3P4vsTx8Ky2pucXxKgkn8MouveP2DBRjkwZckCG5b9Lb";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Call Operation Responded";
    }

    public static String qualifiedName() {
        return "MyOS/Call Operation Responded";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/MyOS/CallOperationResponded.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<Response> events;

    public List<Response> getEvents() {
        return events;
    }

    public CallOperationResponded events(List<Response> events) {
        this.events = events;
        return this;
    }

}
