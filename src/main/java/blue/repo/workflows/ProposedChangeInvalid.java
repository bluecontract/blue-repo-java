package blue.repo.workflows;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Event;

@TypeBlueId("6jcAKEeVpGCPenpSnfwwamL2iTHBACRXPFQjEDU5pX1y")
public class ProposedChangeInvalid extends Event {
    public static String blueId() {
        return "6jcAKEeVpGCPenpSnfwwamL2iTHBACRXPFQjEDU5pX1y";
    }

    public static String packageName() {
        return "Workflows";
    }

    public static String typeName() {
        return "Proposed Change Invalid";
    }

    public static String qualifiedName() {
        return "Workflows/Proposed Change Invalid";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Workflows/ProposedChangeInvalid.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String reason;

    public String getReason() {
        return reason;
    }

    public ProposedChangeInvalid reason(String reason) {
        this.reason = reason;
        return this;
    }

}
