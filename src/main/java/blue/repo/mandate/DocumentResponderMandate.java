package blue.repo.mandate;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8bvcYdfc7JGf48zWivkhhS2y4NaMKievgDfaGP78Yq8N")
public class DocumentResponderMandate extends Mandate {
    public static String blueId() {
        return "8bvcYdfc7JGf48zWivkhhS2y4NaMKievgDfaGP78Yq8N";
    }

    public static String packageName() {
        return "Mandate";
    }

    public static String typeName() {
        return "Document Responder Mandate";
    }

    public static String qualifiedName() {
        return "Mandate/Document Responder Mandate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Mandate/DocumentResponderMandate.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node authorizedInitialDocument;

    public Node getAuthorizedInitialDocument() {
        return authorizedInitialDocument;
    }

    public DocumentResponderMandate authorizedInitialDocument(Node authorizedInitialDocument) {
        this.authorizedInitialDocument = authorizedInitialDocument;
        return this;
    }

}
