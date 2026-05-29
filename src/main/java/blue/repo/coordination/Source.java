package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Qm35f9xFUH84i745uPMj5jjMX1oCCG79aeSfHViipxG")
public class Source {
    public static String blueId() {
        return "Qm35f9xFUH84i745uPMj5jjMX1oCCG79aeSfHViipxG";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Source";
    }

    public static String qualifiedName() {
        return "Coordination/Source";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/Source.json";
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
