package blue.repo.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.conversation.TimelineEntry;

@TypeBlueId("F3mQaGQ1B48yMedKZojFTxeKxtee4xU66QBbiyEMvGeZ")
public class MyOSTimelineEntry extends TimelineEntry {
    public static String blueId() {
        return "F3mQaGQ1B48yMedKZojFTxeKxtee4xU66QBbiyEMvGeZ";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS Timeline Entry";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS Timeline Entry";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/MyOS/MyOSTimelineEntry.json";
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
