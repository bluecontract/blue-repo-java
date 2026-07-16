package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.mandate.DocumentResponderMandate;

@TypeBlueId("3uhoCUanMZ9N1pKosNrjwGHxPbCxxAYz2kBgJTnqjftk")
public class MyOSDocumentBootstrapMandate extends DocumentResponderMandate {
    public static String blueId() {
        return "3uhoCUanMZ9N1pKosNrjwGHxPbCxxAYz2kBgJTnqjftk";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS Document Bootstrap Mandate";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS Document Bootstrap Mandate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/MyOSDocumentBootstrapMandate.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

}
