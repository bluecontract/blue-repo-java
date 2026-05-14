package blue.repo.v1_3_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("DEmFwGa1sWm2BKhrN98LREKiB8j8B8kFAo7KBkkaojnN")
public class DocumentSectionChanges {
    public static String blueId() {
        return "DEmFwGa1sWm2BKhrN98LREKiB8j8B8kFAo7KBkkaojnN";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Document Section Changes";
    }

    public static String qualifiedName() {
        return "Conversation/Document Section Changes";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/Conversation/DocumentSectionChanges.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<DocumentSectionChangeEntry> add;

    private List<DocumentSectionChangeEntry> modify;

    private List<String> remove;

    public List<DocumentSectionChangeEntry> getAdd() {
        return add;
    }

    public DocumentSectionChanges add(List<DocumentSectionChangeEntry> add) {
        this.add = add;
        return this;
    }

    public List<DocumentSectionChangeEntry> getModify() {
        return modify;
    }

    public DocumentSectionChanges modify(List<DocumentSectionChangeEntry> modify) {
        this.modify = modify;
        return this;
    }

    public List<String> getRemove() {
        return remove;
    }

    public DocumentSectionChanges remove(List<String> remove) {
        this.remove = remove;
        return this;
    }

}
