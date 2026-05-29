package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("B883YDTRXBoX2WCD3XdedD3pr4Y39JHy84t3N9GAej7p")
public class CdmObservableAssetFieldWithMetaCommodityReferencePriceEnum {
    public static String blueId() {
        return "B883YDTRXBoX2WCD3XdedD3pr4Y39JHy84t3N9GAej7p";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/FieldWithMetaCommodityReferencePriceEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/FieldWithMetaCommodityReferencePriceEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetFieldWithMetaCommodityReferencePriceEnum.json";
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

    private CdmObservableAssetCommodityReferencePriceEnum val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmObservableAssetFieldWithMetaCommodityReferencePriceEnum meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmObservableAssetCommodityReferencePriceEnum getVal() {
        return val;
    }

    public CdmObservableAssetFieldWithMetaCommodityReferencePriceEnum val(CdmObservableAssetCommodityReferencePriceEnum val) {
        this.val = val;
        return this;
    }

}
