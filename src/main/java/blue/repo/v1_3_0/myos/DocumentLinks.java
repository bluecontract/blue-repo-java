package blue.repo.v1_3_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4cmrbevB6K23ZenjqwmNxpnaw6RF4VB3wkP7XB59V7W5")
public class DocumentLinks {
    public static String blueId() {
        return "4cmrbevB6K23ZenjqwmNxpnaw6RF4VB3wkP7XB59V7W5";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Document Links";
    }

    public static String qualifiedName() {
        return "MyOS/Document Links";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/MyOS/DocumentLinks.json";
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
