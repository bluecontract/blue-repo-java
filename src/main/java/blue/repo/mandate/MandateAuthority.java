package blue.repo.mandate;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Actor;
import blue.repo.coordination.Authority;

@TypeBlueId("5bFqx3YquAHCFUvVzVEZ1h6aF89yhxfb1c3HnQys2kKz")
public class MandateAuthority extends Authority {
    public static String blueId() {
        return "5bFqx3YquAHCFUvVzVEZ1h6aF89yhxfb1c3HnQys2kKz";
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

    private Mandate initialMandateDocument;

    public Actor getActor() {
        return actor;
    }

    public MandateAuthority actor(Actor actor) {
        this.actor = actor;
        return this;
    }

    public Mandate getInitialMandateDocument() {
        return initialMandateDocument;
    }

    public MandateAuthority initialMandateDocument(Mandate initialMandateDocument) {
        this.initialMandateDocument = initialMandateDocument;
        return this;
    }

}
