package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AqvTXzu4fNQRsq2NdhA3ZV267phPZhx46TcmJs6zZAtx")
public class CdmObservableAssetFieldWithMetaQuotedCurrencyPair {
    public static String blueId() {
        return "AqvTXzu4fNQRsq2NdhA3ZV267phPZhx46TcmJs6zZAtx";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/FieldWithMetaQuotedCurrencyPair";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/FieldWithMetaQuotedCurrencyPair";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetFieldWithMetaQuotedCurrencyPair.json";
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

    private CdmObservableAssetQuotedCurrencyPair val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmObservableAssetFieldWithMetaQuotedCurrencyPair meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmObservableAssetQuotedCurrencyPair getVal() {
        return val;
    }

    public CdmObservableAssetFieldWithMetaQuotedCurrencyPair val(CdmObservableAssetQuotedCurrencyPair val) {
        this.val = val;
        return this;
    }

}
