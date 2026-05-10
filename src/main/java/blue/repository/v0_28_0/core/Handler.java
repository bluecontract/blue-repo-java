package blue.repository.v0_28_0.core;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("9ZE5pGjtSGJgWJG7iAVz4iPEz5CatceX3yb3qp5MpAKJ")
public class Handler extends blue.language.processor.model.HandlerContract {
    public static String blueId() {
        return "9ZE5pGjtSGJgWJG7iAVz4iPEz5CatceX3yb3qp5MpAKJ";
    }

    public static String packageName() {
        return "Core";
    }

    public static String typeName() {
        return "Handler";
    }

    public static String qualifiedName() {
        return "Core/Handler";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/Core/Handler.json";
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
