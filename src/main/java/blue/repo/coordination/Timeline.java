package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3jwaTSdUWw47M6rkN85BE6nTemo7eoyN3R6ompsrDfgn")
public class Timeline {
    public static String blueId() {
        return "3jwaTSdUWw47M6rkN85BE6nTemo7eoyN3R6ompsrDfgn";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Timeline";
    }

    public static String qualifiedName() {
        return "Coordination/Timeline";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/Timeline.json";
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
