package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("E3reCKoiXLZ3cqjcoDSsyF74f9GjKk2rcw541v9upWpy")
public class RoundingDirectionEnum {
    public static String blueId() {
        return "E3reCKoiXLZ3cqjcoDSsyF74f9GjKk2rcw541v9upWpy";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "RoundingDirectionEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/RoundingDirectionEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/RoundingDirectionEnum.json";
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

    public RoundingDirectionEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
