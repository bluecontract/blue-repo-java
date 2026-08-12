package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("99pdBM1fnVJLa2mfpj5KYGRAJzC1KXhBkbDnVsRWsZyb")
public class CdmBaseMathQuantityChangeDirectionEnum {
    public static String blueId() {
        return "99pdBM1fnVJLa2mfpj5KYGRAJzC1KXhBkbDnVsRWsZyb";
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
