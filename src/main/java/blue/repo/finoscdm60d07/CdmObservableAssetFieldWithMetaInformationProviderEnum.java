package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("F146JGqnWZ5sfLAxTTdw6wibcDWTqzmMxom6z62GKkRB")
public class CdmObservableAssetFieldWithMetaInformationProviderEnum {
    public static String blueId() {
        return "F146JGqnWZ5sfLAxTTdw6wibcDWTqzmMxom6z62GKkRB";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/FieldWithMetaInformationProviderEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/FieldWithMetaInformationProviderEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetFieldWithMetaInformationProviderEnum.json";
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

    private CdmObservableAssetInformationProviderEnum val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmObservableAssetFieldWithMetaInformationProviderEnum meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmObservableAssetInformationProviderEnum getVal() {
        return val;
    }

    public CdmObservableAssetFieldWithMetaInformationProviderEnum val(CdmObservableAssetInformationProviderEnum val) {
        this.val = val;
        return this;
    }

}
