package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8WGez2Pw3SaengwQ3fALoD7uYU4391o8NJSkQuumdh4m")
public class Timeline {
    public static String blueId() {
        return "8WGez2Pw3SaengwQ3fALoD7uYU4391o8NJSkQuumdh4m";
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

    private String providerId;

    private String timelineId;

    public String getProviderId() {
        return providerId;
    }

    public Timeline providerId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    public String getTimelineId() {
        return timelineId;
    }

    public Timeline timelineId(String timelineId) {
        this.timelineId = timelineId;
        return this;
    }

}
