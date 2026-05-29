package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7smTzk4htwPGEPqE4U8AJvTK2FW7ZyeBSCh4Gvh7kX6K")
public class CdmBaseDatetimePeriodExtendedEnum {
    public static String blueId() {
        return "7smTzk4htwPGEPqE4U8AJvTK2FW7ZyeBSCh4Gvh7kX6K";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/PeriodExtendedEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/PeriodExtendedEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimePeriodExtendedEnum.json";
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
