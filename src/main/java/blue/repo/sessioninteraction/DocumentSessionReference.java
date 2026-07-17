package blue.repo.sessioninteraction;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FxcZycT49wFfrNAZpzquWVRw43epYQx5SkYXpdwx3c2Z")
public class DocumentSessionReference {
    public static String blueId() {
        return "FxcZycT49wFfrNAZpzquWVRw43epYQx5SkYXpdwx3c2Z";
    }

    public static String packageName() {
        return "SessionInteraction";
    }

    public static String typeName() {
        return "Document Session Reference";
    }

    public static String qualifiedName() {
        return "SessionInteraction/Document Session Reference";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/SessionInteraction/DocumentSessionReference.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String providerId;

    private String sessionId;

    private Node initialDocument;

    public String getProviderId() {
        return providerId;
    }

    public DocumentSessionReference providerId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    public String getSessionId() {
        return sessionId;
    }

    public DocumentSessionReference sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public Node getInitialDocument() {
        return initialDocument;
    }

    public DocumentSessionReference initialDocument(Node initialDocument) {
        this.initialDocument = initialDocument;
        return this;
    }

}
