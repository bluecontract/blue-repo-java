package blue.repository.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.conversation.Response;

@TypeBlueId("DFKVw43E36kimqj64FyiiVxE9yNuB22SETFx5M4WAi9m")
public class ChildPayNoteIssuanceDeclined extends Response {
    public static String blueId() {
        return "DFKVw43E36kimqj64FyiiVxE9yNuB22SETFx5M4WAi9m";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Child PayNote Issuance Declined";
    }

    public static String qualifiedName() {
        return "PayNote/Child PayNote Issuance Declined";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/PayNote/ChildPayNoteIssuanceDeclined.json";
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

    public ChildPayNoteIssuanceDeclined reason(String reason) {
        this.reason = reason;
        return this;
    }

}
