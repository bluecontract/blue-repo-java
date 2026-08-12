package blue.repo.workflows;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Operation;

@TypeBlueId("7Dv66Ymipyi4znKm3ek5wc1xVA4Qy5agxb3LjbMxKv6p")
public class AcceptChangeOperation extends Operation {
    public static String blueId() {
        return "7Dv66Ymipyi4znKm3ek5wc1xVA4Qy5agxb3LjbMxKv6p";
    }

    public static String packageName() {
        return "Workflows";
    }

    public static String typeName() {
        return "Accept Change Operation";
    }

    public static String qualifiedName() {
        return "Workflows/Accept Change Operation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Workflows/AcceptChangeOperation.json";
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
