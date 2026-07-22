package blue.repo.mandate;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Actor;
import blue.repo.coordination.Authority;

@TypeBlueId("AFmG8N66vjJCjfjpuvvowYeTpreb1GrdM8uHzEiDuWto")
public class MandateAuthority extends Authority {
    public static String blueId() {
        return "AFmG8N66vjJCjfjpuvvowYeTpreb1GrdM8uHzEiDuWto";
    }

    public static String packageName() {
        return "Mandate";
    }

    public static String typeName() {
        return "Mandate Authority";
    }

    public static String qualifiedName() {
        return "Mandate/Mandate Authority";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Mandate/MandateAuthority.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Actor actor;

    private Node initialMandateDocument;

    public Actor getActor() {
        return actor;
    }

    public MandateAuthority actor(Actor actor) {
        this.actor = actor;
        return this;
    }

    public Node getInitialMandateDocument() {
        return initialMandateDocument;
    }

    public MandateAuthority initialMandateDocument(Node initialMandateDocument) {
        this.initialMandateDocument = initialMandateDocument;
        return this;
    }

}
