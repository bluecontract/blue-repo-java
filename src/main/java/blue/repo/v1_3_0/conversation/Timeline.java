package blue.repo.v1_3_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3Ge54FsGJaaeZmm8nTKJdS6HVdYhiR3g18fDwg3Ev1Sa")
public class Timeline {
    public static String blueId() {
        return "3Ge54FsGJaaeZmm8nTKJdS6HVdYhiR3g18fDwg3Ev1Sa";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Timeline";
    }

    public static String qualifiedName() {
        return "Conversation/Timeline";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/Conversation/Timeline.json";
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

    public Timeline timelineId(String timelineId) {
        this.timelineId = timelineId;
        return this;
    }

}
