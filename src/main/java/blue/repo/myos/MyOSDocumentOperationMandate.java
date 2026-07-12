package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.mandate.OperationMandate;

@TypeBlueId("FL7Caksowk6AvTQbLW3cTECTCyhbWKeb3iFbZLPRg5UV")
public class MyOSDocumentOperationMandate extends OperationMandate {
    public static String blueId() {
        return "FL7Caksowk6AvTQbLW3cTECTCyhbWKeb3iFbZLPRg5UV";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS Document Operation Mandate";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS Document Operation Mandate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/MyOSDocumentOperationMandate.json";
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

    public MyOSDocumentOperationMandate authorizedInitialDocument(Node authorizedInitialDocument) {
        this.authorizedInitialDocument = authorizedInitialDocument;
        return this;
    }

}
