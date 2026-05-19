package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.conversation.Response;

@TypeBlueId("3B7ErHwZ9NHiW4e6msFDt57U8sTvFXZQBEwHzcdNCjmf")
public class WorkerSessionStarting extends Response {
    public static String blueId() {
        return "3B7ErHwZ9NHiW4e6msFDt57U8sTvFXZQBEwHzcdNCjmf";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Worker Session Starting";
    }

    public static String qualifiedName() {
        return "MyOS/Worker Session Starting";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/WorkerSessionStarting.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String granteeDocumentId;

    private String targetDocumentType;

    public String getGranteeDocumentId() {
        return granteeDocumentId;
    }

    public WorkerSessionStarting granteeDocumentId(String granteeDocumentId) {
        this.granteeDocumentId = granteeDocumentId;
        return this;
    }

    public String getTargetDocumentType() {
        return targetDocumentType;
    }

    public WorkerSessionStarting targetDocumentType(String targetDocumentType) {
        this.targetDocumentType = targetDocumentType;
        return this;
    }

}
