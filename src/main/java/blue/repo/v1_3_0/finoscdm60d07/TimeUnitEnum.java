package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Ehzp4KAcnAhGUXPFJUmrLhedcjzTzYZacMX5qPLbeWRo")
public class TimeUnitEnum {
    public static String blueId() {
        return "Ehzp4KAcnAhGUXPFJUmrLhedcjzTzYZacMX5qPLbeWRo";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "TimeUnitEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/TimeUnitEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/TimeUnitEnum.json";
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

    public TimeUnitEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
