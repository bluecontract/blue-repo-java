package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GL2jEpSn2AstZ8wCoa3cELMiaaxUvFJRkmmDvbokXP8e")
public class PositionStatusEnum {
    public static String blueId() {
        return "GL2jEpSn2AstZ8wCoa3cELMiaaxUvFJRkmmDvbokXP8e";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PositionStatusEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PositionStatusEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PositionStatusEnum.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    public String getNamespace() {
        return namespace;
    }

    public PositionStatusEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
