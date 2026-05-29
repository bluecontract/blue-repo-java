package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9fqWoh2dqVPSGfjicGpGg5JQoJ1aN9iwy8pcEf5dKwt2")
public class CdmBaseMathWeatherUnitEnum {
    public static String blueId() {
        return "9fqWoh2dqVPSGfjicGpGg5JQoJ1aN9iwy8pcEf5dKwt2";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/math/WeatherUnitEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/math/WeatherUnitEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasemathWeatherUnitEnum.json";
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
