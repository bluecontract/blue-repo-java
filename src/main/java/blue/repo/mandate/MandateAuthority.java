package blue.repo.mandate;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Actor;
import blue.repo.coordination.Authority;

@TypeBlueId("ExmQrsf67rLa6o2zk43EJJ2kTYVa9NFECdLvbEJAkCaS")
public class MandateAuthority extends Authority {
    public static String blueId() {
        return "ExmQrsf67rLa6o2zk43EJJ2kTYVa9NFECdLvbEJAkCaS";
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
