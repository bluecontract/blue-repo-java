package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7PxEJAVDRqGFU2t6TFeqimEKfddFVGN1mAWTAsWmXix")
public class DocumentAnchor {
    public static String blueId() {
        return "7PxEJAVDRqGFU2t6TFeqimEKfddFVGN1mAWTAsWmXix";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Document Anchor";
    }

    public static String qualifiedName() {
        return "Coordination/Document Anchor";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/DocumentAnchor.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node template;

    public Node getTemplate() {
        return template;
    }

    public DocumentAnchor template(Node template) {
        this.template = template;
        return this;
    }

}
