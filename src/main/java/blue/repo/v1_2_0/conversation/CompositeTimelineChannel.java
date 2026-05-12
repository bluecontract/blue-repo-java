package blue.repo.v1_2_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.core.Channel;
import java.util.List;

@TypeBlueId("HsNatiPt2YvmkWQoqtfrFCbdp75ZUBLBUkWeq84WTfnr")
public class CompositeTimelineChannel extends Channel {
    public static String blueId() {
        return "HsNatiPt2YvmkWQoqtfrFCbdp75ZUBLBUkWeq84WTfnr";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Composite Timeline Channel";
    }

    public static String qualifiedName() {
        return "Conversation/Composite Timeline Channel";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/Conversation/CompositeTimelineChannel.json";
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
