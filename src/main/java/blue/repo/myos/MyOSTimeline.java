package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Timeline;

@TypeBlueId("5VAQp5thYLkzp3FbvYGmVvmdLqqu6pV5vhNgD14XJwpX")
public class MyOSTimeline extends Timeline {
    public static String blueId() {
        return "5VAQp5thYLkzp3FbvYGmVvmdLqqu6pV5vhNgD14XJwpX";
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
