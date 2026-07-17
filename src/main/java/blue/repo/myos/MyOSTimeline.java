package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Timeline;

@TypeBlueId("81daJe9Ns5yUCEi1aX1gyjoaL3P94CU1wut9zJ4MuXy9")
public class MyOSTimeline extends Timeline {
    public static String blueId() {
        return "81daJe9Ns5yUCEi1aX1gyjoaL3P94CU1wut9zJ4MuXy9";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS Timeline";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS Timeline";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/MyOSTimeline.json";
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
