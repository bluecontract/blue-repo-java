package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HS9yo34TGEAM2LGcNbLh7XPN4goPRhqdGZQkiyh473Wb")
public class DocumentAnchor {
    public static String blueId() {
        return "HS9yo34TGEAM2LGcNbLh7XPN4goPRhqdGZQkiyh473Wb";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Document Anchor";
    }

    public static String qualifiedName() {
        return "MyOS/Document Anchor";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/DocumentAnchor.json";
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
