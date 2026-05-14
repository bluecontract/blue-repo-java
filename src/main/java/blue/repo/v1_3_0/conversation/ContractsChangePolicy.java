package blue.repo.v1_3_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_3_0.core.Marker;

@TypeBlueId("6FDVZRQwuhXdXtnXq8kRg3f3DM8SUdbN3TT8rSGJcS2U")
public class ContractsChangePolicy extends Marker {
    public static String blueId() {
        return "6FDVZRQwuhXdXtnXq8kRg3f3DM8SUdbN3TT8rSGJcS2U";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Contracts Change Policy";
    }

    public static String qualifiedName() {
        return "Conversation/Contracts Change Policy";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/Conversation/ContractsChangePolicy.json";
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
