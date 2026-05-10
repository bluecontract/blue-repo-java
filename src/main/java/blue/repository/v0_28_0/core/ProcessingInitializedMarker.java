package blue.repository.v0_28_0.core;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

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
        return "blue/repository/v0_28_0/definitions/Core/ProcessingInitializedMarker.json";
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
