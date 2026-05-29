package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("ADQAeNVT7CjqRC5m2j1NAZZp9RGboVVVE6wbJKoSSeQQ")
public class CdmProductCollateralCreditSupportAgreementTypeEnum {
    public static String blueId() {
        return "ADQAeNVT7CjqRC5m2j1NAZZp9RGboVVVE6wbJKoSSeQQ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/CreditSupportAgreementTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/CreditSupportAgreementTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralCreditSupportAgreementTypeEnum.json";
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
