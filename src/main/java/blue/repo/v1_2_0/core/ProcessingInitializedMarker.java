package blue.repo.v1_2_0.core;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EVguxFmq5iFtMZaBQgHfjWDojaoesQ1vEXCQFZ59yL28")
public class ProcessingInitializedMarker extends Marker {
    public static String blueId() {
        return "EVguxFmq5iFtMZaBQgHfjWDojaoesQ1vEXCQFZ59yL28";
    }

    public static String packageName() {
        return "Core";
    }

    public static String typeName() {
        return "Processing Initialized Marker";
    }

    public static String qualifiedName() {
        return "Core/Processing Initialized Marker";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/Core/ProcessingInitializedMarker.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String documentId;

    public String getDocumentId() {
        return documentId;
    }

    public ProcessingInitializedMarker documentId(String documentId) {
        this.documentId = documentId;
        return this;
    }

}
