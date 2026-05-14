package blue.repo.v1_3_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Hd5uuFjqxyw5mrFPgJf2mcatij8ddtmGAMJu9ij5K1tc")
public class ChangeOperation extends Operation {
    public static String blueId() {
        return "Hd5uuFjqxyw5mrFPgJf2mcatij8ddtmGAMJu9ij5K1tc";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Change Operation";
    }

    public static String qualifiedName() {
        return "Conversation/Change Operation";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/Conversation/ChangeOperation.json";
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
