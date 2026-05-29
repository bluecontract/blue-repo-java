package blue.repo.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Bu4KzxxpJuHvET1RTBzioDXpWcqmvYzmqGRiDKmktHUo")
public class DocumentAnchor {
    public static String blueId() {
        return "Bu4KzxxpJuHvET1RTBzioDXpWcqmvYzmqGRiDKmktHUo";
    }

    public static String packageName() {
        return "Common";
    }

    public static String typeName() {
        return "Document Anchor";
    }

    public static String qualifiedName() {
        return "Common/Document Anchor";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Common/DocumentAnchor.json";
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
