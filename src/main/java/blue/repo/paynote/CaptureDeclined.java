package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("Fco4nFxgHFP38LD59gHmiTrKyqJAG5B623gShceqRYyF")
public class CaptureDeclined extends Response {
    public static String blueId() {
        return "Fco4nFxgHFP38LD59gHmiTrKyqJAG5B623gShceqRYyF";
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
        return "blue/repo/definitions/PayNote/CaptureDeclined.json";
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
