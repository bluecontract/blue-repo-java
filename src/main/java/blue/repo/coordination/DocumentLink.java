package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4QgVHSQv1pyJAmEQBpuXFSVN7qdavdMDmdZXpkboNsc5")
public class DocumentLink {
    public static String blueId() {
        return "4QgVHSQv1pyJAmEQBpuXFSVN7qdavdMDmdZXpkboNsc5";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Document Link";
    }

    public static String qualifiedName() {
        return "Coordination/Document Link";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/DocumentLink.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node initialDocument;

    private String anchor;

    public Node getInitialDocument() {
        return initialDocument;
    }

    public DocumentLink initialDocument(Node initialDocument) {
        this.initialDocument = initialDocument;
        return this;
    }

    public String getAnchor() {
        return anchor;
    }

    public DocumentLink anchor(String anchor) {
        this.anchor = anchor;
        return this;
    }

}
