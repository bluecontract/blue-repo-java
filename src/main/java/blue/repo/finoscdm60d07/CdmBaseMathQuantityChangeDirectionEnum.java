package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3PEKcTxZjwjadkRHkdE5cLAN5jWQkiSt4SmaU1mwZbgZ")
public class CdmBaseMathQuantityChangeDirectionEnum {
    public static String blueId() {
        return "3PEKcTxZjwjadkRHkdE5cLAN5jWQkiSt4SmaU1mwZbgZ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/math/QuantityChangeDirectionEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/math/QuantityChangeDirectionEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasemathQuantityChangeDirectionEnum.json";
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
