package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("4FE7wU8cnFsb7gEcgQk8vTGYZHLqvJH6Yjsv2TXovgr2")
public class CompositeTimelineChannel {
    public static String blueId() {
        return "4FE7wU8cnFsb7gEcgQk8vTGYZHLqvJH6Yjsv2TXovgr2";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Composite Timeline Channel";
    }

    public static String qualifiedName() {
        return "Coordination/Composite Timeline Channel";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/CompositeTimelineChannel.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<String> channels;

    public List<String> getChannels() {
        return channels;
    }

    public CompositeTimelineChannel channels(List<String> channels) {
        this.channels = channels;
        return this;
    }

}
