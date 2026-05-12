package blue.repo.v1_2_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EbGQYtYR9UNAxcn7auCCujXmnz6DWxMpqVcgYSsKE85M")
public class ProposedChangeInvalid extends Event {
    public static String blueId() {
        return "EbGQYtYR9UNAxcn7auCCujXmnz6DWxMpqVcgYSsKE85M";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Proposed Change Invalid";
    }

    public static String qualifiedName() {
        return "Conversation/Proposed Change Invalid";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/Conversation/ProposedChangeInvalid.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String reason;

    public String getReason() {
        return reason;
    }

    public ProposedChangeInvalid reason(String reason) {
        this.reason = reason;
        return this;
    }

}
