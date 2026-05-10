package blue.repository.v0_28_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("75CyJPe82hSjV9T2tsir5R3343vhqvG41w2EzFhCp5Y9")
public class LinkedDocumentsPermissionSet {
    public static String blueId() {
        return "75CyJPe82hSjV9T2tsir5R3343vhqvG41w2EzFhCp5Y9";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Linked Documents Permission Set";
    }

    public static String qualifiedName() {
        return "MyOS/Linked Documents Permission Set";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/MyOS/LinkedDocumentsPermissionSet.json";
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
