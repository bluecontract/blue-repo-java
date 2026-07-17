package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Timeline;

@TypeBlueId("2kJTAf7L1FMGBqa7tez6qXw3kPfghbjwmiWzKWVCMYw3")
public class MyOSTimeline extends Timeline {
    public static String blueId() {
        return "2kJTAf7L1FMGBqa7tez6qXw3kPfghbjwmiWzKWVCMYw3";
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
