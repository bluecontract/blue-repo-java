package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3FcyLzeWjTqmYYg1Tmqu2en4SKfYbCFn8Shf3gDxo9xK")
public class MyOSDocumentSessionReference {
    public static String blueId() {
        return "3FcyLzeWjTqmYYg1Tmqu2en4SKfYbCFn8Shf3gDxo9xK";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS Document Session Reference";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS Document Session Reference";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/MyOSDocumentSessionReference.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String documentId;

    private String sessionId;

    public String getDocumentId() {
        return documentId;
    }

    public MyOSDocumentSessionReference documentId(String documentId) {
        this.documentId = documentId;
        return this;
    }

    public String getSessionId() {
        return sessionId;
    }

    public MyOSDocumentSessionReference sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

}
