package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.conversation.Response;

@TypeBlueId("FUh3TARSh4TjnWKAkM5ydjFWLWEmrFByKMBQzcgQfqRW")
public class CaptureFailed extends Response {
    public static String blueId() {
        return "FUh3TARSh4TjnWKAkM5ydjFWLWEmrFByKMBQzcgQfqRW";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Capture Failed";
    }

    public static String qualifiedName() {
        return "PayNote/Capture Failed";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/CaptureFailed.json";
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

    public CaptureFailed reason(String reason) {
        this.reason = reason;
        return this;
    }

}
