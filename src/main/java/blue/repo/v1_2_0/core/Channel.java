package blue.repo.v1_2_0.core;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DcoJyCh7XXxy1nR5xjy7qfkUgQ1GiZnKKSxh8DJusBSr")
public class Channel extends blue.language.processor.model.ChannelContract {
    public static String blueId() {
        return "DcoJyCh7XXxy1nR5xjy7qfkUgQ1GiZnKKSxh8DJusBSr";
    }

    public static String packageName() {
        return "Core";
    }

    public static String typeName() {
        return "Channel";
    }

    public static String qualifiedName() {
        return "Core/Channel";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/Core/Channel.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node event;

    public Node getEvent() {
        return event;
    }

    public Channel event(Node event) {
        this.event = event;
        return this;
    }

}
