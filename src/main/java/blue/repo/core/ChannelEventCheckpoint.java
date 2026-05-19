package blue.repo.core;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("B7YQeYdQzUNuzaDQ4tNTd2iJqgd4YnVQkgz4QgymDWWU")
public class ChannelEventCheckpoint extends blue.language.processor.model.ChannelEventCheckpoint {
    public static String blueId() {
        return "B7YQeYdQzUNuzaDQ4tNTd2iJqgd4YnVQkgz4QgymDWWU";
    }

    public static String packageName() {
        return "Core";
    }

    public static String typeName() {
        return "Channel Event Checkpoint";
    }

    public static String qualifiedName() {
        return "Core/Channel Event Checkpoint";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Core/ChannelEventCheckpoint.json";
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
