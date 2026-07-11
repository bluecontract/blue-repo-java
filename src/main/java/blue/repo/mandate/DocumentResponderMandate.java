package blue.repo.mandate;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9HtAHoZqLJ1EPBi8nPs8Vda89HCsZ85sgwSFdpKbdx22")
public class DocumentResponderMandate extends Mandate {
    public static String blueId() {
        return "9HtAHoZqLJ1EPBi8nPs8Vda89HCsZ85sgwSFdpKbdx22";
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
