package blue.repo.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Event;

@TypeBlueId("AJXU1CbY6HmjCknkWm1ng2pGvStRPzhs3jq4WWLVwWLK")
public class NamedEvent extends Event {
    public static String blueId() {
        return "AJXU1CbY6HmjCknkWm1ng2pGvStRPzhs3jq4WWLVwWLK";
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
        return "blue/repo/definitions/Common/NamedEvent.json";
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
