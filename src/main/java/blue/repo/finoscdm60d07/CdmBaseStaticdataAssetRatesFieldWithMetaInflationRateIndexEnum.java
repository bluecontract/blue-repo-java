package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4DbqHPTBAGLWcXCBx1e6T8F8paJFUA12hyKhAnBV6f7m")
public class CdmBaseStaticdataAssetRatesFieldWithMetaInflationRateIndexEnum {
    public static String blueId() {
        return "4DbqHPTBAGLWcXCBx1e6T8F8paJFUA12hyKhAnBV6f7m";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/rates/FieldWithMetaInflationRateIndexEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/rates/FieldWithMetaInflationRateIndexEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetratesFieldWithMetaInflationRateIndexEnum.json";
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

    private CdmBaseStaticdataAssetRatesInflationRateIndexEnum val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmBaseStaticdataAssetRatesFieldWithMetaInflationRateIndexEnum meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmBaseStaticdataAssetRatesInflationRateIndexEnum getVal() {
        return val;
    }

    public CdmBaseStaticdataAssetRatesFieldWithMetaInflationRateIndexEnum val(CdmBaseStaticdataAssetRatesInflationRateIndexEnum val) {
        this.val = val;
        return this;
    }

}
