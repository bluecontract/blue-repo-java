package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.conversation.Request;

@TypeBlueId("4oyKGB49m8MuAFdxgHZauwhDFvdBgziHnb9CCGeKNqEc")
public class CancelBeforeCompletionRequested extends Request {
    public static String blueId() {
        return "4oyKGB49m8MuAFdxgHZauwhDFvdBgziHnb9CCGeKNqEc";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Cancel Before Completion Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Cancel Before Completion Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/CancelBeforeCompletionRequested.json";
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

    public CancelBeforeCompletionRequested reason(String reason) {
        this.reason = reason;
        return this;
    }

}
