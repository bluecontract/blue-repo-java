package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5b7tz2hPJ3dwwRSghTiFtwhoDJrB6oMLyV5ssbsSiZkL")
public class CdmBaseDatetimeBusinessCenterEnum {
    public static String blueId() {
        return "5b7tz2hPJ3dwwRSghTiFtwhoDJrB6oMLyV5ssbsSiZkL";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/BusinessCenterEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/BusinessCenterEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimeBusinessCenterEnum.json";
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
