package blue.repo.bootstrap;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HqeiZDQNRH4YUcB6ZLXUc4jdjEcVURhBAc3CsX5HGB7m")
public class ParticipantMapping {
    public static String blueId() {
        return "HqeiZDQNRH4YUcB6ZLXUc4jdjEcVURhBAc3CsX5HGB7m";
    }

    public static String packageName() {
        return "Bootstrap";
    }

    public static String typeName() {
        return "Participant Mapping";
    }

    public static String qualifiedName() {
        return "Bootstrap/Participant Mapping";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Bootstrap/ParticipantMapping.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String channelName;

    private String accountId;

    private String email;

    public String getChannelName() {
        return channelName;
    }

    public ParticipantMapping channelName(String channelName) {
        this.channelName = channelName;
        return this;
    }

    public String getAccountId() {
        return accountId;
    }

    public ParticipantMapping accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public ParticipantMapping email(String email) {
        this.email = email;
        return this;
    }

}
