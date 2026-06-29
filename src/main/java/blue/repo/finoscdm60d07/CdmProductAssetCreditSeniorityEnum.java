package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Hu5VnYpz7ZCRzsMjDtVxSVoN2RK42N3T3a1rvcvnMAyV")
public class CdmProductAssetCreditSeniorityEnum {
    public static String blueId() {
        return "Hu5VnYpz7ZCRzsMjDtVxSVoN2RK42N3T3a1rvcvnMAyV";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/CreditSeniorityEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/CreditSeniorityEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetCreditSeniorityEnum.json";
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
