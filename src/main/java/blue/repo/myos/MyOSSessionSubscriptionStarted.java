package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BGhd3kZMEMd8Yv8nqnqfLngaUEAn5WkbPjPsS6o3U7mg")
public class MyOSSessionSubscriptionStarted extends MyOSSessionSubscriptionUpdate {
    public static String blueId() {
        return "BGhd3kZMEMd8Yv8nqnqfLngaUEAn5WkbPjPsS6o3U7mg";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS Session Subscription Started";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS Session Subscription Started";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/MyOSSessionSubscriptionStarted.json";
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
