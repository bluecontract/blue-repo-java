package blue.repo.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5w8XTussoHoaLUy6gwou9Rz5Zxuh9yums9YDNjGdLCKV")
public class StatusFailed extends DocumentStatus {
    public static String blueId() {
        return "5w8XTussoHoaLUy6gwou9Rz5Zxuh9yums9YDNjGdLCKV";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Status Failed";
    }

    public static String qualifiedName() {
        return "Conversation/Status Failed";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Conversation/StatusFailed.json";
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
