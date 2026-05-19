package blue.repo.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("J18rFf6VX3ADe5gTnqmL4wXtivLkzrRXLPPhnoghnjzB")
public class Record extends Document {
    public static String blueId() {
        return "J18rFf6VX3ADe5gTnqmL4wXtivLkzrRXLPPhnoghnjzB";
    }

    public static String packageName() {
        return "Common";
    }

    public static String typeName() {
        return "Record";
    }

    public static String qualifiedName() {
        return "Common/Record";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Common/Record.json";
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
