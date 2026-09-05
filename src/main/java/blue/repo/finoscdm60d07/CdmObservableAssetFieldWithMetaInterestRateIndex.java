package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Ds9FZiLoVYx9U4whc4WsSqMud8rDYd5ghRwM8nmgNhu2")
public class CdmObservableAssetFieldWithMetaInterestRateIndex {
    public static String blueId() {
        return "Ds9FZiLoVYx9U4whc4WsSqMud8rDYd5ghRwM8nmgNhu2";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/FieldWithMetaInterestRateIndex";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/FieldWithMetaInterestRateIndex";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetFieldWithMetaInterestRateIndex.json";
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

    private CdmObservableAssetInterestRateIndex val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmObservableAssetFieldWithMetaInterestRateIndex meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmObservableAssetInterestRateIndex getVal() {
        return val;
    }

    public CdmObservableAssetFieldWithMetaInterestRateIndex val(CdmObservableAssetInterestRateIndex val) {
        this.val = val;
        return this;
    }

}
