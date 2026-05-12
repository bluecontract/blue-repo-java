package blue.repo.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6tzp2YX1rei3aAXg22SqYbeiiteGthj1LesTNCWm7wbU")
public class MyOSParticipantsOrchestration {
    public static String blueId() {
        return "6tzp2YX1rei3aAXg22SqYbeiiteGthj1LesTNCWm7wbU";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS Participants Orchestration";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS Participants Orchestration";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/MyOS/MyOSParticipantsOrchestration.json";
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
