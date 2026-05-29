package blue.repo.workflows;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("6R6asWqr9V6DAow5X6EjRRaABhM7xeT13UzcTegmhcjy")
public class DocumentSection {
    public static String blueId() {
        return "6R6asWqr9V6DAow5X6EjRRaABhM7xeT13UzcTegmhcjy";
    }

    public static String packageName() {
        return "Workflows";
    }

    public static String typeName() {
        return "Document Section";
    }

    public static String qualifiedName() {
        return "Workflows/Document Section";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Workflows/DocumentSection.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String title;

    private String summary;

    private List<String> relatedFields;

    private List<String> relatedContracts;

    public String getTitle() {
        return title;
    }

    public DocumentSection title(String title) {
        this.title = title;
        return this;
    }

    public String getSummary() {
        return summary;
    }

    public DocumentSection summary(String summary) {
        this.summary = summary;
        return this;
    }

    public List<String> getRelatedFields() {
        return relatedFields;
    }

    public DocumentSection relatedFields(List<String> relatedFields) {
        this.relatedFields = relatedFields;
        return this;
    }

    public List<String> getRelatedContracts() {
        return relatedContracts;
    }

    public DocumentSection relatedContracts(List<String> relatedContracts) {
        this.relatedContracts = relatedContracts;
        return this;
    }

}
