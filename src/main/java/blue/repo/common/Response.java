package blue.repo.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8T2FPZcsJdWFvThipSCbTEGQRdUhUrg3nfvYBA4TnKzy")
public class Response extends Document {
    public static String blueId() {
        return "8T2FPZcsJdWFvThipSCbTEGQRdUhUrg3nfvYBA4TnKzy";
    }

    public static String packageName() {
        return "Common";
    }

    public static String typeName() {
        return "Response";
    }

    public static String qualifiedName() {
        return "Common/Response";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Common/Response.json";
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
