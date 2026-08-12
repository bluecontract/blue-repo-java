package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("8FyswTq5moAS2hexCNqdEVSfPbuwesexqrck7Up5gtxp")
public class UpdateDocument extends SequentialWorkflowStep {
    public static String blueId() {
        return "8FyswTq5moAS2hexCNqdEVSfPbuwesexqrck7Up5gtxp";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Update Document";
    }

    public static String qualifiedName() {
        return "Coordination/Update Document";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/UpdateDocument.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<Node> changeset;

    public List<Node> getChangeset() {
        return changeset;
    }

    public UpdateDocument changeset(List<Node> changeset) {
        this.changeset = changeset;
        return this;
    }

}
