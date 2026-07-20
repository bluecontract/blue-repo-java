package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Event;

@TypeBlueId("BiV8zZSESjpgVqjsEXNYuzk54PUZYp69UtQhxrxK3vYC")
public class AllParticipantsReady extends Event {
    public static String blueId() {
        return "BiV8zZSESjpgVqjsEXNYuzk54PUZYp69UtQhxrxK3vYC";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "All Participants Ready";
    }

    public static String qualifiedName() {
        return "MyOS/All Participants Ready";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/AllParticipantsReady.json";
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
