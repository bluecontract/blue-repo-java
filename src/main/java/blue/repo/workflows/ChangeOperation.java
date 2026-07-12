package blue.repo.workflows;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Operation;

@TypeBlueId("AKkQ1Sq3MRCEoDNv4FjEpx3Dn72DuM4DTVJNCJsSs1Ai")
public class ChangeOperation extends Operation {
    public static String blueId() {
        return "AKkQ1Sq3MRCEoDNv4FjEpx3Dn72DuM4DTVJNCJsSs1Ai";
    }

    public static String packageName() {
        return "Workflows";
    }

    public static String typeName() {
        return "Change Operation";
    }

    public static String qualifiedName() {
        return "Workflows/Change Operation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Workflows/ChangeOperation.json";
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
