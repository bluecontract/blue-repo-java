package blue.repo.workflows;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.Map;

@TypeBlueId("DN9VhzcZvGNtMz2K3qVBQrVeYssBUqbewt2Cxi6CXS3R")
public class DocumentSectionChangeEntry {
    public static String blueId() {
        return "DN9VhzcZvGNtMz2K3qVBQrVeYssBUqbewt2Cxi6CXS3R";
    }

    public static String packageName() {
        return "Workflows";
    }

    public static String typeName() {
        return "Document Section Change Entry";
    }

    public static String qualifiedName() {
        return "Workflows/Document Section Change Entry";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Workflows/DocumentSectionChangeEntry.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Map<String, Node> contracts;

    private String sectionKey;

    private DocumentSection section;

    public Map<String, Node> getContracts() {
        return contracts;
    }

    public DocumentSectionChangeEntry contracts(Map<String, Node> contracts) {
        this.contracts = contracts;
        return this;
    }

    public String getSectionKey() {
        return sectionKey;
    }

    public DocumentSectionChangeEntry sectionKey(String sectionKey) {
        this.sectionKey = sectionKey;
        return this;
    }

    public DocumentSection getSection() {
        return section;
    }

    public DocumentSectionChangeEntry section(DocumentSection section) {
        this.section = section;
        return this;
    }

}
