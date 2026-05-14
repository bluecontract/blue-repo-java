package blue.repo.v1_3_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_3_0.core.Channel;

@TypeBlueId("EvuCWsG1E6WJQg8QXmk6rwMANYTZjoLWVZ1vYQWUwdTH")
public class TimelineChannel extends Channel {
    public static String blueId() {
        return "EvuCWsG1E6WJQg8QXmk6rwMANYTZjoLWVZ1vYQWUwdTH";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Timeline Channel";
    }

    public static String qualifiedName() {
        return "Conversation/Timeline Channel";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/Conversation/TimelineChannel.json";
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
