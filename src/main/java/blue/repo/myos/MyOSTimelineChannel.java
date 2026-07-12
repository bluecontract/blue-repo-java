package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.TimelineChannel;

@TypeBlueId("HbecELqPUgjEnPDnu9uAVuuFj4DA2H8M9vsVmPXPaUmV")
public class MyOSTimelineChannel extends TimelineChannel {
    public static String blueId() {
        return "HbecELqPUgjEnPDnu9uAVuuFj4DA2H8M9vsVmPXPaUmV";
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
        return "blue/repo/definitions/MyOS/MyOSTimelineChannel.json";
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
