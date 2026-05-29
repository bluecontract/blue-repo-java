package blue.repo.workflows;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("8FdfJApa4H55iYGnn2BVZcAq7tKYB6GrtkcftMgo6fjc")
public class DocumentSectionChanges {
    public static String blueId() {
        return "8FdfJApa4H55iYGnn2BVZcAq7tKYB6GrtkcftMgo6fjc";
    }

    public static String packageName() {
        return "Workflows";
    }

    public static String typeName() {
        return "Document Section Changes";
    }

    public static String qualifiedName() {
        return "Workflows/Document Section Changes";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Workflows/DocumentSectionChanges.json";
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
