package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;
import java.util.List;

@TypeBlueId("B1RnGH4azPberZAn1F3YrP5c2sGV939EpruSPBD2Kc1u")
public class WorkerAgencyPermissionInvalid extends Response {
    public static String blueId() {
        return "B1RnGH4azPberZAn1F3YrP5c2sGV939EpruSPBD2Kc1u";
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
        return "blue/repo/definitions/MyOS/WorkerAgencyPermissionInvalid.json";
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
