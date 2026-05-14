package blue.repo.v1_3_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_3_0.conversation.Request;

@TypeBlueId("3kyFUyupzb49ZoxVHnUhVe4XAbEN1Hpy8zN9Dx75GNyc")
public class PayNoteAcceptanceRequested extends Request {
    public static String blueId() {
        return "3kyFUyupzb49ZoxVHnUhVe4XAbEN1Hpy8zN9Dx75GNyc";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "PayNote Acceptance Requested";
    }

    public static String qualifiedName() {
        return "PayNote/PayNote Acceptance Requested";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/PayNote/PayNoteAcceptanceRequested.json";
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
