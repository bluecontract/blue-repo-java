package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.TimelineEntry;

@TypeBlueId("DuBKxPY5v6UURT1pkyACFhmCM966fF1ytEv9x3k15Sm8")
public class MyOSTimelineEntry extends TimelineEntry {
    public static String blueId() {
        return "DuBKxPY5v6UURT1pkyACFhmCM966fF1ytEv9x3k15Sm8";
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
