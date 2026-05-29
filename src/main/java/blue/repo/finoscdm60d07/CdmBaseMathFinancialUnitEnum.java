package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9WZ98d8ou6kcEKR3m6kC1QVEDKhvDcusTiqz1Qy1LafT")
public class CdmBaseMathFinancialUnitEnum {
    public static String blueId() {
        return "9WZ98d8ou6kcEKR3m6kC1QVEDKhvDcusTiqz1Qy1LafT";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/math/FinancialUnitEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/math/FinancialUnitEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasemathFinancialUnitEnum.json";
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
