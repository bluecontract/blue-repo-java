package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6C5cWr4to9ATnkFbP7DRXtMUZfGVzou2g22vC7vYgdLG")
public class CdmBaseStaticdataAssetRatesFieldWithMetaInflationRateIndexEnum {
    public static String blueId() {
        return "6C5cWr4to9ATnkFbP7DRXtMUZfGVzou2g22vC7vYgdLG";
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
