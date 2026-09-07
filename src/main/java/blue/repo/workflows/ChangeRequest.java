package blue.repo.workflows;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("7BDhanFWv8mBYw69xtmmvs28X4rF6846AuKuhaas1dqF")
public class ChangeRequest {
    public static String blueId() {
        return "7BDhanFWv8mBYw69xtmmvs28X4rF6846AuKuhaas1dqF";
    }

    public static String packageName() {
        return "Workflows";
    }

    public static String typeName() {
        return "Change Request";
    }

    public static String qualifiedName() {
        return "Workflows/Change Request";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Workflows/ChangeRequest.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String summary;

    private List<Node> changeset;

    private DocumentSectionChanges sectionChanges;

    public String getSummary() {
        return summary;
    }

    public ChangeRequest summary(String summary) {
        this.summary = summary;
        return this;
    }

    public List<Node> getChangeset() {
        return changeset;
    }

    public ChangeRequest changeset(List<Node> changeset) {
        this.changeset = changeset;
        return this;
    }

    public DocumentSectionChanges getSectionChanges() {
        return sectionChanges;
    }

    public ChangeRequest sectionChanges(DocumentSectionChanges sectionChanges) {
        this.sectionChanges = sectionChanges;
        return this;
    }

}
