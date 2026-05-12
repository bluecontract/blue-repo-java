package blue.repo.v1_2_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FqipbF4UATjCRTqovGdREPAoaxj59NECb9xtnWRW1SWi")
public class PrincipalActor extends Actor {
    public static String blueId() {
        return "FqipbF4UATjCRTqovGdREPAoaxj59NECb9xtnWRW1SWi";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Principal Actor";
    }

    public static String qualifiedName() {
        return "Conversation/Principal Actor";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/Conversation/PrincipalActor.json";
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
