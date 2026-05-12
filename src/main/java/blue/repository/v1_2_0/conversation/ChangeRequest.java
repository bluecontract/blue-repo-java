package blue.repository.v1_2_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.core.JsonPatchEntry;
import java.util.List;

@TypeBlueId("FW7iYkzig4fepCdwfCdgNJw4DQ1fKwnAUf3YpjgfTPmG")
public class ChangeRequest {
    public static String blueId() {
        return "FW7iYkzig4fepCdwfCdgNJw4DQ1fKwnAUf3YpjgfTPmG";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Change Request";
    }

    public static String qualifiedName() {
        return "Conversation/Change Request";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/Conversation/ChangeRequest.json";
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

    private List<JsonPatchEntry> changeset;

    private DocumentSectionChanges sectionChanges;

    public String getSummary() {
        return summary;
    }

    public ChangeRequest summary(String summary) {
        this.summary = summary;
        return this;
    }

    public List<JsonPatchEntry> getChangeset() {
        return changeset;
    }

    public ChangeRequest changeset(List<JsonPatchEntry> changeset) {
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
