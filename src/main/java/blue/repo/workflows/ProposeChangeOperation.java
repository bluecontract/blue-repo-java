package blue.repo.workflows;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Operation;

@TypeBlueId("6KfyYR3LoTKJLsgPkmYkXacY7JMPvTjJUeqtJXXfVHMr")
public class ProposeChangeOperation extends Operation {
    public static String blueId() {
        return "6KfyYR3LoTKJLsgPkmYkXacY7JMPvTjJUeqtJXXfVHMr";
    }

    public static String packageName() {
        return "Workflows";
    }

    public static String typeName() {
        return "Propose Change Operation";
    }

    public static String qualifiedName() {
        return "Workflows/Propose Change Operation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Workflows/ProposeChangeOperation.json";
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
