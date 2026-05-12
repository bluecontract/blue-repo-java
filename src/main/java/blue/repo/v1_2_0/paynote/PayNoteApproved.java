package blue.repo.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.conversation.Response;

@TypeBlueId("HQTUxErobqhSuhWo9DAC1WwaG9oYdjfmdKprGtV4TeEK")
public class PayNoteApproved extends Response {
    public static String blueId() {
        return "HQTUxErobqhSuhWo9DAC1WwaG9oYdjfmdKprGtV4TeEK";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "PayNote Approved";
    }

    public static String qualifiedName() {
        return "PayNote/PayNote Approved";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/PayNote/PayNoteApproved.json";
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
