package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BMrf1bMHcSkUPWbbD1bnJLxbmvZz2D2X5zY9oGZJ2cns")
public class CdmObservableAssetFieldWithMetaInterpolationMethodEnum {
    public static String blueId() {
        return "BMrf1bMHcSkUPWbbD1bnJLxbmvZz2D2X5zY9oGZJ2cns";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/FieldWithMetaInterpolationMethodEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/FieldWithMetaInterpolationMethodEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetFieldWithMetaInterpolationMethodEnum.json";
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

    private CdmObservableAssetInterpolationMethodEnum val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmObservableAssetFieldWithMetaInterpolationMethodEnum meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmObservableAssetInterpolationMethodEnum getVal() {
        return val;
    }

    public CdmObservableAssetFieldWithMetaInterpolationMethodEnum val(CdmObservableAssetInterpolationMethodEnum val) {
        this.val = val;
        return this;
    }

}
