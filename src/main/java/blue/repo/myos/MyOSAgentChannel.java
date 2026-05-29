package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2YzZXsXxQSeCKZ4Qrptrdrf9gy4Hwrfdvh8gpakpnDBL")
public class MyOSAgentChannel {
    public static String blueId() {
        return "2YzZXsXxQSeCKZ4Qrptrdrf9gy4Hwrfdvh8gpakpnDBL";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS Agent Channel";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS Agent Channel";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/MyOSAgentChannel.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private MyOSAgent agent;

    private Node event;

    public MyOSAgent getAgent() {
        return agent;
    }

    public MyOSAgentChannel agent(MyOSAgent agent) {
        this.agent = agent;
        return this;
    }

    public Node getEvent() {
        return event;
    }

    public MyOSAgentChannel event(Node event) {
        this.event = event;
        return this;
    }

}
