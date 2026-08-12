package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;
import java.util.List;

@TypeBlueId("33kWg4MtTrwrHaUoYsMYWzWohKRfsiUvJYqXRPxuvj3z")
public class CallOperationResponded extends Response {
    public static String blueId() {
        return "33kWg4MtTrwrHaUoYsMYWzWohKRfsiUvJYqXRPxuvj3z";
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
        return "blue/repo/definitions/MyOS/CallOperationResponded.json";
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
