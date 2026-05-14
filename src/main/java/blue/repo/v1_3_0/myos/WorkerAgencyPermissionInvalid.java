package blue.repo.v1_3_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_3_0.conversation.Response;
import java.util.List;

@TypeBlueId("29zvV2MA4XAwLoGoNLLhLMa61mEgGceFnDvMznfQauYY")
public class WorkerAgencyPermissionInvalid extends Response {
    public static String blueId() {
        return "29zvV2MA4XAwLoGoNLLhLMa61mEgGceFnDvMznfQauYY";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Worker Agency Permission Invalid";
    }

    public static String qualifiedName() {
        return "MyOS/Worker Agency Permission Invalid";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/MyOS/WorkerAgencyPermissionInvalid.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<String> issues;

    public List<String> getIssues() {
        return issues;
    }

    public WorkerAgencyPermissionInvalid issues(List<String> issues) {
        this.issues = issues;
        return this;
    }

}
