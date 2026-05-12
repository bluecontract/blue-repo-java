package blue.repo.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.conversation.Timeline;

@TypeBlueId("2gyToM86KgFJpB8inz8TBVEMZk8UVGYdRozF4mfvxtuk")
public class MyOSTimeline extends Timeline {
    public static String blueId() {
        return "2gyToM86KgFJpB8inz8TBVEMZk8UVGYdRozF4mfvxtuk";
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
        return "blue/repo/v1_2_0/definitions/MyOS/MyOSTimeline.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String accountId;

    public String getAccountId() {
        return accountId;
    }

    public MyOSTimeline accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

}
