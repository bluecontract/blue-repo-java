package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HooLPpmtC3Rf6jJ2eGGr4SyBbi2XYPzYBm4UpuzYke6D")
public class AgentActor extends Actor {
    public static String blueId() {
        return "HooLPpmtC3Rf6jJ2eGGr4SyBbi2XYPzYBm4UpuzYke6D";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Agent Actor";
    }

    public static String qualifiedName() {
        return "Coordination/Agent Actor";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/AgentActor.json";
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
