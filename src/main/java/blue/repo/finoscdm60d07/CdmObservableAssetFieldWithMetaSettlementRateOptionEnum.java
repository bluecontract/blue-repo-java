package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5zMhYAXcxtwbFXQeEYr3vWu78daHfMbFUrFgair7M7sf")
public class CdmObservableAssetFieldWithMetaSettlementRateOptionEnum {
    public static String blueId() {
        return "5zMhYAXcxtwbFXQeEYr3vWu78daHfMbFUrFgair7M7sf";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/FieldWithMetaSettlementRateOptionEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/FieldWithMetaSettlementRateOptionEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetFieldWithMetaSettlementRateOptionEnum.json";
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

    private CdmObservableAssetSettlementRateOptionEnum val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmObservableAssetFieldWithMetaSettlementRateOptionEnum meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmObservableAssetSettlementRateOptionEnum getVal() {
        return val;
    }

    public CdmObservableAssetFieldWithMetaSettlementRateOptionEnum val(CdmObservableAssetSettlementRateOptionEnum val) {
        this.val = val;
        return this;
    }

}
