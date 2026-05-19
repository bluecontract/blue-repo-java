package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.conversation.Actor;

@TypeBlueId("3SJK2XGFHJgqXyCK4sjZ6tmAk3VjyuX6imGBJmV2LgQZ")
public class AgentActor extends Actor {
    public static String blueId() {
        return "3SJK2XGFHJgqXyCK4sjZ6tmAk3VjyuX6imGBJmV2LgQZ";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Agent Actor";
    }

    public static String qualifiedName() {
        return "MyOS/Agent Actor";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/AgentActor.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String onBehalfOf;

    private MyOSDocumentSessionReference agentRef;

    private MyOSDocumentSessionReference delegation;

    public String getOnBehalfOf() {
        return onBehalfOf;
    }

    public AgentActor onBehalfOf(String onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
        return this;
    }

    public MyOSDocumentSessionReference getAgentRef() {
        return agentRef;
    }

    public AgentActor agentRef(MyOSDocumentSessionReference agentRef) {
        this.agentRef = agentRef;
        return this;
    }

    public MyOSDocumentSessionReference getDelegation() {
        return delegation;
    }

    public AgentActor delegation(MyOSDocumentSessionReference delegation) {
        this.delegation = delegation;
        return this;
    }

}
