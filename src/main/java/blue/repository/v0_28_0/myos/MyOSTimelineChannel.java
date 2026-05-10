package blue.repository.v0_28_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.conversation.TimelineChannel;

@TypeBlueId("HCF8mXnX3dFjQ8osjxb4Wzm2Nm1DoXnTYuA5sPnV7NTs")
public class MyOSTimelineChannel extends TimelineChannel {
    public static String blueId() {
        return "HCF8mXnX3dFjQ8osjxb4Wzm2Nm1DoXnTYuA5sPnV7NTs";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS Timeline Channel";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS Timeline Channel";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/MyOS/MyOSTimelineChannel.json";
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

    private String email;

    public String getAccountId() {
        return accountId;
    }

    public MyOSTimelineChannel accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public MyOSTimelineChannel email(String email) {
        this.email = email;
        return this;
    }

}
