package blue.repo.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Ff61TKzxLStjvfMksRNUBif2PRJGJM6XvmTqSf3M76wC")
public class AllParticipantsReady {
    public static String blueId() {
        return "Ff61TKzxLStjvfMksRNUBif2PRJGJM6XvmTqSf3M76wC";
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
        return "blue/repo/v1_2_0/definitions/MyOS/AllParticipantsReady.json";
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
