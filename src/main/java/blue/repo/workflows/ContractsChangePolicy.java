package blue.repo.workflows;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("F2z5kuhjRCwngkuZAxfWyYrZNMM9PeumHLmPqT222RKa")
public class ContractsChangePolicy extends blue.language.processor.model.MarkerContract {
    public static String blueId() {
        return "F2z5kuhjRCwngkuZAxfWyYrZNMM9PeumHLmPqT222RKa";
    }

    public static String packageName() {
        return "Workflows";
    }

    public static String typeName() {
        return "Contracts Change Policy";
    }

    public static String qualifiedName() {
        return "Workflows/Contracts Change Policy";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Workflows/ContractsChangePolicy.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean requireSectionChanges;

    public Boolean getRequireSectionChanges() {
        return requireSectionChanges;
    }

    public ContractsChangePolicy requireSectionChanges(Boolean requireSectionChanges) {
        this.requireSectionChanges = requireSectionChanges;
        return this;
    }

}
