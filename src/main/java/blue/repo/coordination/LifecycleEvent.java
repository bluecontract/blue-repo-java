package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9hcgdYgUJCreSiiSnEMVAXsf7iWui13JW96gfwauA73J")
public class LifecycleEvent extends Event {
    public static String blueId() {
        return "9hcgdYgUJCreSiiSnEMVAXsf7iWui13JW96gfwauA73J";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Lifecycle Event";
    }

    public static String qualifiedName() {
        return "Coordination/Lifecycle Event";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/LifecycleEvent.json";
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
