package blue.repo.v1_3_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_3_0.core.Contract;
import java.util.Map;

@TypeBlueId("9xv7YjqsSn7W7P8rnUhSpdWGfSrgL4Jt3cmiACJT5VQs")
public class DocumentSectionChangeEntry {
    public static String blueId() {
        return "9xv7YjqsSn7W7P8rnUhSpdWGfSrgL4Jt3cmiACJT5VQs";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Document Section Change Entry";
    }

    public static String qualifiedName() {
        return "Conversation/Document Section Change Entry";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/Conversation/DocumentSectionChangeEntry.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String sectionKey;

    private DocumentSection section;

    private Map<String, Contract> contracts;

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

    public Map<String, Contract> getContracts() {
        return contracts;
    }

    public DocumentSectionChangeEntry contracts(Map<String, Contract> contracts) {
        this.contracts = contracts;
        return this;
    }

}
