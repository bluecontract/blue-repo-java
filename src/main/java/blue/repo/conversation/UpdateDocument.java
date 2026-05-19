package blue.repo.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.core.JsonPatchEntry;
import java.util.List;

@TypeBlueId("FtHZJzH4hqAoGxFBjsmy1svfT4BwEBB4aHpFSZycZLLa")
public class UpdateDocument extends SequentialWorkflowStep {
    public static String blueId() {
        return "FtHZJzH4hqAoGxFBjsmy1svfT4BwEBB4aHpFSZycZLLa";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Update Document";
    }

    public static String qualifiedName() {
        return "Conversation/Update Document";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Conversation/UpdateDocument.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<JsonPatchEntry> changeset;

    public List<JsonPatchEntry> getChangeset() {
        return changeset;
    }

    public UpdateDocument changeset(List<JsonPatchEntry> changeset) {
        this.changeset = changeset;
        return this;
    }

}
