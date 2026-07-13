package blue.repo.mandate;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Message;

@TypeBlueId("3HtuEaYgkn8rV9xZf1x5uY2v7S9WXbVkcV3rj3Sy6arJ")
public class MandateActivated extends Message {
    public static String blueId() {
        return "3HtuEaYgkn8rV9xZf1x5uY2v7S9WXbVkcV3rj3Sy6arJ";
    }

    public static String packageName() {
        return "Mandate";
    }

    public static String typeName() {
        return "Mandate Activated";
    }

    public static String qualifiedName() {
        return "Mandate/Mandate Activated";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Mandate/MandateActivated.json";
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
