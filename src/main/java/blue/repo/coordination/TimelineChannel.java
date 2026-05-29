package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AKRPLotcnGLq7gQRj3jHcfAkxkwaJpmxNXpC3G22GQQz")
public class TimelineChannel extends blue.language.processor.model.ChannelContract {
    public static String blueId() {
        return "AKRPLotcnGLq7gQRj3jHcfAkxkwaJpmxNXpC3G22GQQz";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Timeline Channel";
    }

    public static String qualifiedName() {
        return "Coordination/Timeline Channel";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/TimelineChannel.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String timelineId;

    public String getTimelineId() {
        return timelineId;
    }

    public TimelineChannel timelineId(String timelineId) {
        this.timelineId = timelineId;
        return this;
    }

}
