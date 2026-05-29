package blue.repo.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("F7LgS1HLXL7CBP3D1LW8ncdfn1euZWBBbQ63pMbfFG1n")
public class Relationship extends Document {
    public static String blueId() {
        return "F7LgS1HLXL7CBP3D1LW8ncdfn1euZWBBbQ63pMbfFG1n";
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
