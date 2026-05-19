package blue.repo.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FM1K89eMHRDN6vHtHfGwFNojmgvSnACuYdtc3qQ6qPYB")
public class AgentActor extends Actor {
    public static String blueId() {
        return "FM1K89eMHRDN6vHtHfGwFNojmgvSnACuYdtc3qQ6qPYB";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Agent Actor";
    }

    public static String qualifiedName() {
        return "Conversation/Agent Actor";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Conversation/AgentActor.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Actor onBehalfOf;

    public Actor getOnBehalfOf() {
        return onBehalfOf;
    }

    public AgentActor onBehalfOf(Actor onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
        return this;
    }

}
