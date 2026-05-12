package blue.repo.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CeWyRmXAMZqvWBvby2KbRUZWcS7Pdxs42vnMXgn9gg6H")
public class MyOSSessionInteraction {
    public static String blueId() {
        return "CeWyRmXAMZqvWBvby2KbRUZWcS7Pdxs42vnMXgn9gg6H";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS Session Interaction";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS Session Interaction";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/MyOS/MyOSSessionInteraction.json";
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
