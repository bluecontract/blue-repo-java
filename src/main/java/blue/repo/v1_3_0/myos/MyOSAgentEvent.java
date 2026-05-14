package blue.repo.v1_3_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("GiYocGMGQcneiMPm4NH9MxVj7Fr4jwg2BUAMzwZcWRNR")
public class MyOSAgentEvent {
    public static String blueId() {
        return "GiYocGMGQcneiMPm4NH9MxVj7Fr4jwg2BUAMzwZcWRNR";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS Agent Event";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS Agent Event";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/MyOS/MyOSAgentEvent.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String agentId;

    private String id;

    private BigInteger timestamp;

    private Node event;

    public String getAgentId() {
        return agentId;
    }

    public MyOSAgentEvent agentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    public String getId() {
        return id;
    }

    public MyOSAgentEvent id(String id) {
        this.id = id;
        return this;
    }

    public BigInteger getTimestamp() {
        return timestamp;
    }

    public MyOSAgentEvent timestamp(BigInteger timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public Node getEvent() {
        return event;
    }

    public MyOSAgentEvent event(Node event) {
        this.event = event;
        return this;
    }

}
