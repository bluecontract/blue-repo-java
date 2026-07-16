package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;
import java.util.List;

@TypeBlueId("72S2g3xuDYEY7Rqm5ZcmJmHKBv1SVmuCbwxyEJuaWcnd")
public class CallOperationResponded extends Response {
    public static String blueId() {
        return "72S2g3xuDYEY7Rqm5ZcmJmHKBv1SVmuCbwxyEJuaWcnd";
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
