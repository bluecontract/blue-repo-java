package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("75c1yTeep3izcexCwE39ggRt7NHoUHLkxKh5UBnGhWAC")
public class CsaTypeEnum {
    public static String blueId() {
        return "75c1yTeep3izcexCwE39ggRt7NHoUHLkxKh5UBnGhWAC";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CsaTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CsaTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CsaTypeEnum.json";
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

    public CsaTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
