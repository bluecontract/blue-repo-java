package blue.repo.v1_2_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.core.Marker;
import java.util.List;

@TypeBlueId("JBfupL6eyZsqj7CYbReFaS5ga784SLT8aP8r9W64vbLm")
public class DocumentSection extends Marker {
    public static String blueId() {
        return "JBfupL6eyZsqj7CYbReFaS5ga784SLT8aP8r9W64vbLm";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Document Section";
    }

    public static String qualifiedName() {
        return "Conversation/Document Section";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/Conversation/DocumentSection.json";
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
