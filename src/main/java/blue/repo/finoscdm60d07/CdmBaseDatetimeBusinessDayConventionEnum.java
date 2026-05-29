package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("74NpTvEaEEzgK6JYLfjq7ACR6d83uPFmACNmKfDZQ1hA")
public class CdmBaseDatetimeBusinessDayConventionEnum {
    public static String blueId() {
        return "74NpTvEaEEzgK6JYLfjq7ACR6d83uPFmACNmKfDZQ1hA";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/BusinessDayConventionEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/BusinessDayConventionEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimeBusinessDayConventionEnum.json";
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
