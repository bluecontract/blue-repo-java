package blue.repo.v1_3_0.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_3_0.conversation.Event;

@TypeBlueId("GrD4wCAmKoK8rm8Pztmv9GkFBRwJy4zpDUzDWHtsEJCX")
public class NamedEvent extends Event {
    public static String blueId() {
        return "GrD4wCAmKoK8rm8Pztmv9GkFBRwJy4zpDUzDWHtsEJCX";
    }

    public static String packageName() {
        return "Common";
    }

    public static String typeName() {
        return "Named Event";
    }

    public static String qualifiedName() {
        return "Common/Named Event";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/Common/NamedEvent.json";
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
