package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EP1r4ouVVbfJhEazX6iBArCJYk3u6aP7hwxJSGLBFbet")
public class CdmObservableAssetMetafieldsReferenceWithMetaMoney {
    public static String blueId() {
        return "EP1r4ouVVbfJhEazX6iBArCJYk3u6aP7hwxJSGLBFbet";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/metafields/ReferenceWithMetaMoney";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/metafields/ReferenceWithMetaMoney";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetmetafieldsReferenceWithMetaMoney.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private ComRosettaModelLibMetaReference address;

    private String externalReference;

    private String globalReference;

    public ComRosettaModelLibMetaReference getAddress() {
        return address;
    }

    public CdmObservableAssetMetafieldsReferenceWithMetaMoney address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmObservableAssetMetafieldsReferenceWithMetaMoney externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmObservableAssetMetafieldsReferenceWithMetaMoney globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
