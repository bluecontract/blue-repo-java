package blue.repository.v1_2_0.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

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
        return "blue/repository/v1_2_0/definitions/Common/Relationship.json";
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
