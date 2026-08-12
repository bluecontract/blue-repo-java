package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AzDkNPadueibCcw5Phd6BZ2rj8Zv78FyDnc4cAipUtUD#0")
public class CdmObservableAssetFieldWithMetaBasketConstituent {
    public static String blueId() {
        return "AzDkNPadueibCcw5Phd6BZ2rj8Zv78FyDnc4cAipUtUD#0";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/FieldWithMetaBasketConstituent";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/FieldWithMetaBasketConstituent";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetFieldWithMetaBasketConstituent.json";
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

    private CdmObservableAssetBasketConstituent val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmObservableAssetFieldWithMetaBasketConstituent meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmObservableAssetBasketConstituent getVal() {
        return val;
    }

    public CdmObservableAssetFieldWithMetaBasketConstituent val(CdmObservableAssetBasketConstituent val) {
        this.val = val;
        return this;
    }

}
