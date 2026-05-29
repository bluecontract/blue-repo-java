package blue.repo.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3jiCk56nE5ULAqAWz6ANyVexCtr8PR54TEogRNECT61z")
public class Record extends Document {
    public static String blueId() {
        return "3jiCk56nE5ULAqAWz6ANyVexCtr8PR54TEogRNECT61z";
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
