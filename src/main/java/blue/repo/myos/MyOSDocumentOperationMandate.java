package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.mandate.OperationMandate;

@TypeBlueId("C7dtw8ZHpD93BBpL528WPq8W4xWvjnUisH9Ew8SQQ6fW")
public class MyOSDocumentOperationMandate extends OperationMandate {
    public static String blueId() {
        return "C7dtw8ZHpD93BBpL528WPq8W4xWvjnUisH9Ew8SQQ6fW";
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
