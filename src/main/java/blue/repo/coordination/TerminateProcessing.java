package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GWdZwV4wh4D6d8knKC2ULofFTEZmtVE31Cm6pGtMiKxh")
public class TerminateProcessing extends SequentialWorkflowStep {
    public static String blueId() {
        return "GWdZwV4wh4D6d8knKC2ULofFTEZmtVE31Cm6pGtMiKxh";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Terminate Processing";
    }

    public static String qualifiedName() {
        return "Coordination/Terminate Processing";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/TerminateProcessing.json";
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

    public TerminateProcessing reason(String reason) {
        this.reason = reason;
        return this;
    }

}
