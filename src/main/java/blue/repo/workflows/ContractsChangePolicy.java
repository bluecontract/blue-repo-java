package blue.repo.workflows;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CECcZ2xesYWUD4qZNFzDWYjWoMU6W55jEEoJHK8MWZct")
public class ContractsChangePolicy {
    public static String blueId() {
        return "CECcZ2xesYWUD4qZNFzDWYjWoMU6W55jEEoJHK8MWZct";
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
