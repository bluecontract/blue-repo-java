package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5mHWTg8BUjckPLnY8D7mJC6mKKkWoF2yTnzgbVckPK3Q")
public class CdmObservableAssetFieldWithMetaPriceSchedule {
    public static String blueId() {
        return "5mHWTg8BUjckPLnY8D7mJC6mKKkWoF2yTnzgbVckPK3Q";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/FieldWithMetaPriceSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/FieldWithMetaPriceSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetFieldWithMetaPriceSchedule.json";
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

    private CdmObservableAssetPriceSchedule val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmObservableAssetFieldWithMetaPriceSchedule meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmObservableAssetPriceSchedule getVal() {
        return val;
    }

    public CdmObservableAssetFieldWithMetaPriceSchedule val(CdmObservableAssetPriceSchedule val) {
        this.val = val;
        return this;
    }

}
