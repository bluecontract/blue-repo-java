package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6mED6TzgHRLmqptsxAXMaehW3dHSrErTWm6HY6aeKKsu")
public class StandardizedScheduleProductClassEnum {
    public static String blueId() {
        return "6mED6TzgHRLmqptsxAXMaehW3dHSrErTWm6HY6aeKKsu";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "StandardizedScheduleProductClassEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/StandardizedScheduleProductClassEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/StandardizedScheduleProductClassEnum.json";
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

    public StandardizedScheduleProductClassEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
