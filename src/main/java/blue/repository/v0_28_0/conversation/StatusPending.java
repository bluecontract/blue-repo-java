package blue.repository.v0_28_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("HTTYTqakRbb53umfjRvryunCRm5QQm3mMArTrgUF5DxL")
public class StatusPending extends DocumentStatus {
    public static String blueId() {
        return "HTTYTqakRbb53umfjRvryunCRm5QQm3mMArTrgUF5DxL";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Status Pending";
    }

    public static String qualifiedName() {
        return "Conversation/Status Pending";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/Conversation/StatusPending.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

}
