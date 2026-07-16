package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2rGqiUa5Kf7yVvR5fBKieFH4YhF8Lu2qUyhQFcwJ68kE")
public class MyOSSessionSubscriptionStarted extends MyOSSessionSubscriptionUpdate {
    public static String blueId() {
        return "2rGqiUa5Kf7yVvR5fBKieFH4YhF8Lu2qUyhQFcwJ68kE";
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
