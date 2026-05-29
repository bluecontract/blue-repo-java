package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("J9Pxr5r3aXac8695zdk4ZHX7ZTpzYtpJRUFtEa5paeA1")
public class CdmObservableAssetFieldWithMetaCreditNotation {
    public static String blueId() {
        return "J9Pxr5r3aXac8695zdk4ZHX7ZTpzYtpJRUFtEa5paeA1";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/FieldWithMetaCreditNotation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/FieldWithMetaCreditNotation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetFieldWithMetaCreditNotation.json";
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

    private CdmObservableAssetCreditNotation val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmObservableAssetFieldWithMetaCreditNotation meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmObservableAssetCreditNotation getVal() {
        return val;
    }

    public CdmObservableAssetFieldWithMetaCreditNotation val(CdmObservableAssetCreditNotation val) {
        this.val = val;
        return this;
    }

}
