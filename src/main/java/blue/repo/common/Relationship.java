package blue.repo.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("29BmTvgmhh9x7t2tGd38GqTH3b9v9rgqsuE21K73i86g")
public class Relationship extends Document {
    public static String blueId() {
        return "29BmTvgmhh9x7t2tGd38GqTH3b9v9rgqsuE21K73i86g";
    }

    public static String packageName() {
        return "Common";
    }

    public static String typeName() {
        return "Relationship";
    }

    public static String qualifiedName() {
        return "Common/Relationship";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Common/Relationship.json";
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
