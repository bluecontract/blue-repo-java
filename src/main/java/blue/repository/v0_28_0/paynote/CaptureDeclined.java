package blue.repository.v0_28_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.conversation.Response;

@TypeBlueId("FzJqLm7Ek58LsVstJV2c37JfiMhRiWtjZNsiMz2ZfCYG")
public class CaptureDeclined extends Response {
    public static String blueId() {
        return "FzJqLm7Ek58LsVstJV2c37JfiMhRiWtjZNsiMz2ZfCYG";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Capture Declined";
    }

    public static String qualifiedName() {
        return "PayNote/Capture Declined";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/PayNote/CaptureDeclined.json";
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

    public CaptureDeclined reason(String reason) {
        this.reason = reason;
        return this;
    }

}
