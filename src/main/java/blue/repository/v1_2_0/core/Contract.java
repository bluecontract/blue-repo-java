package blue.repository.v1_2_0.core;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("AERp8BWnuUsjoPciAeNXuUWS9fmqPNMdWbxmKn3tcitx")
public class Contract extends blue.language.processor.model.Contract {
    public static String blueId() {
        return "AERp8BWnuUsjoPciAeNXuUWS9fmqPNMdWbxmKn3tcitx";
    }

    public static String packageName() {
        return "Core";
    }

    public static String typeName() {
        return "Contract";
    }

    public static String qualifiedName() {
        return "Core/Contract";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/Core/Contract.json";
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
