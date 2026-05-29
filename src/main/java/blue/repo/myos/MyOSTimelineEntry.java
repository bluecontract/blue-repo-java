package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.TimelineEntry;

@TypeBlueId("89jLhpA5iqiRuSLgvYKZirtczaxjwSXRkL9Q7GhxwPCu")
public class MyOSTimelineEntry extends TimelineEntry {
    public static String blueId() {
        return "89jLhpA5iqiRuSLgvYKZirtczaxjwSXRkL9Q7GhxwPCu";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS Timeline Entry";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS Timeline Entry";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/MyOSTimelineEntry.json";
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
