package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FKErpaxxVBEdf3jg3BrvA5hNMsJQsJ3S4sB9QM8EHMkN")
public class DocumentLinks extends blue.language.processor.model.MarkerContract {
    public static String blueId() {
        return "FKErpaxxVBEdf3jg3BrvA5hNMsJQsJ3S4sB9QM8EHMkN";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Document Links";
    }

    public static String qualifiedName() {
        return "Coordination/Document Links";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/DocumentLinks.json";
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
