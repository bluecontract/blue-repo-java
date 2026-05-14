package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("E5AAib5LtjSj6PQNK9ByhgANVVxwCrDQrxX7zu7trVYv")
public class DayOfWeekEnum {
    public static String blueId() {
        return "E5AAib5LtjSj6PQNK9ByhgANVVxwCrDQrxX7zu7trVYv";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DayOfWeekEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DayOfWeekEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/DayOfWeekEnum.json";
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

    public DayOfWeekEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
