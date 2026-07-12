package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("61Hu6aLPnN7bAbiMTUxzP9rXEt8JW7XrkqyrEwDWWnJS")
public class AllTimelinesChannel extends blue.language.processor.model.ChannelContract {
    public static String blueId() {
        return "61Hu6aLPnN7bAbiMTUxzP9rXEt8JW7XrkqyrEwDWWnJS";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "All Timelines Channel";
    }

    public static String qualifiedName() {
        return "Coordination/All Timelines Channel";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/AllTimelinesChannel.json";
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
