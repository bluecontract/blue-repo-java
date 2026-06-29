package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2qVsAJiDNKtcYeoPmttQzFLH44MsczpvMvQ9ZQvwUW6Z")
public class CdmBaseStaticdataAssetRatesFieldWithMetaFloatingRateIndexEnum {
    public static String blueId() {
        return "2qVsAJiDNKtcYeoPmttQzFLH44MsczpvMvQ9ZQvwUW6Z";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/rates/FieldWithMetaFloatingRateIndexEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/rates/FieldWithMetaFloatingRateIndexEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetratesFieldWithMetaFloatingRateIndexEnum.json";
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

    private CdmBaseStaticdataAssetRatesFloatingRateIndexEnum val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmBaseStaticdataAssetRatesFieldWithMetaFloatingRateIndexEnum meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmBaseStaticdataAssetRatesFloatingRateIndexEnum getVal() {
        return val;
    }

    public CdmBaseStaticdataAssetRatesFieldWithMetaFloatingRateIndexEnum val(CdmBaseStaticdataAssetRatesFloatingRateIndexEnum val) {
        this.val = val;
        return this;
    }

}
