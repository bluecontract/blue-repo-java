package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.mandate.DocumentResponderMandate;

@TypeBlueId("251Co4qm4qk7XDPRDvqKMGEbAjrdnrE2V1U6UHriXssB")
public class MyOSDocumentBootstrapMandate extends DocumentResponderMandate {
    public static String blueId() {
        return "251Co4qm4qk7XDPRDvqKMGEbAjrdnrE2V1U6UHriXssB";
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
