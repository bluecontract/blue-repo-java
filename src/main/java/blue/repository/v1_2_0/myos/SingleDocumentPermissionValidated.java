package blue.repository.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.conversation.Response;

@TypeBlueId("AG6fiGy88gX5eKoUcHS2BV17EfMssiYZj99kx9RcpKEX")
public class SingleDocumentPermissionValidated extends Response {
    public static String blueId() {
        return "AG6fiGy88gX5eKoUcHS2BV17EfMssiYZj99kx9RcpKEX";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Single Document Permission Validated";
    }

    public static String qualifiedName() {
        return "MyOS/Single Document Permission Validated";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/MyOS/SingleDocumentPermissionValidated.json";
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
