package blue.repo.workflows;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Operation;

@TypeBlueId("Bfa8rBxGS5auYWAWQ5nGKftm1q3dGD2ge2jwmjP2Atx5")
public class ProposeChangeOperation extends Operation {
    public static String blueId() {
        return "Bfa8rBxGS5auYWAWQ5nGKftm1q3dGD2ge2jwmjP2Atx5";
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
