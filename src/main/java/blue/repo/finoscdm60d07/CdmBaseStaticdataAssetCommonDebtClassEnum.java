package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7j5qD4JU5gUCa5ieYio2Cw2ex4ceqo17c2rx7TPN4WKJ")
public class CdmBaseStaticdataAssetCommonDebtClassEnum {
    public static String blueId() {
        return "7j5qD4JU5gUCa5ieYio2Cw2ex4ceqo17c2rx7TPN4WKJ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/DebtClassEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/DebtClassEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonDebtClassEnum.json";
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
