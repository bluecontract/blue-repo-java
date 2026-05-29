package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3Ji7cJv31ymeE3LhMK2Are2K8W53uN54A645uAc3B1Bg")
public class CdmProductCollateralFieldWithMetaCreditSupportAgreementTypeEnum {
    public static String blueId() {
        return "3Ji7cJv31ymeE3LhMK2Are2K8W53uN54A645uAc3B1Bg";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/FieldWithMetaCreditSupportAgreementTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/FieldWithMetaCreditSupportAgreementTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralFieldWithMetaCreditSupportAgreementTypeEnum.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private ComRosettaModelMetafieldsMetaFields meta;

    private CdmProductCollateralCreditSupportAgreementTypeEnum val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmProductCollateralFieldWithMetaCreditSupportAgreementTypeEnum meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmProductCollateralCreditSupportAgreementTypeEnum getVal() {
        return val;
    }

    public CdmProductCollateralFieldWithMetaCreditSupportAgreementTypeEnum val(CdmProductCollateralCreditSupportAgreementTypeEnum val) {
        this.val = val;
        return this;
    }

}
