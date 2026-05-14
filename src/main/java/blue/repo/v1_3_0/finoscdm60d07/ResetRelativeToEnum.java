package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AfZYDojnCfeCihYA6wpuagrfxHsYuJjKg58dGx9adbXV")
public class ResetRelativeToEnum {
    public static String blueId() {
        return "AfZYDojnCfeCihYA6wpuagrfxHsYuJjKg58dGx9adbXV";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ResetRelativeToEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ResetRelativeToEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ResetRelativeToEnum.json";
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

    public ResetRelativeToEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
