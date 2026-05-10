package blue.repository.v0_28_0.core;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("6H1iGrDAcqtFE1qv3iyMTj79jCZsMUMxsNUzqYSJNbyR")
public class DocumentUpdateChannel extends Channel {
    public static String blueId() {
        return "6H1iGrDAcqtFE1qv3iyMTj79jCZsMUMxsNUzqYSJNbyR";
    }

    public static String packageName() {
        return "Core";
    }

    public static String typeName() {
        return "Document Update Channel";
    }

    public static String qualifiedName() {
        return "Core/Document Update Channel";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/Core/DocumentUpdateChannel.json";
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
