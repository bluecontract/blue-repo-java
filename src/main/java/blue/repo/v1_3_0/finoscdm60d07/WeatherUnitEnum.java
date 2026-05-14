package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8UqSkL8PAWWbLyRMecbkbJ2X8ffU58B259Wf2579RjLL")
public class WeatherUnitEnum {
    public static String blueId() {
        return "8UqSkL8PAWWbLyRMecbkbJ2X8ffU58B259Wf2579RjLL";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "WeatherUnitEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/WeatherUnitEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/WeatherUnitEnum.json";
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

    public WeatherUnitEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
