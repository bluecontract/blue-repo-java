package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("3Q53ttkVniDP3jYGstwhmX7Yu12qMqNaG1bfCYzcmg2Q")
public class CompositeTimelineChannel extends blue.language.processor.model.ChannelContract {
    public static String blueId() {
        return "3Q53ttkVniDP3jYGstwhmX7Yu12qMqNaG1bfCYzcmg2Q";
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
