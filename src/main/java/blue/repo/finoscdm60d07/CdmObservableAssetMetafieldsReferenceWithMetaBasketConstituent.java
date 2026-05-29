package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9TCszX7p3useiqzNm9UPp1AMdorfkHLknXYXqEVsE2N8")
public class CdmObservableAssetMetafieldsReferenceWithMetaBasketConstituent {
    public static String blueId() {
        return "9TCszX7p3useiqzNm9UPp1AMdorfkHLknXYXqEVsE2N8";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/metafields/ReferenceWithMetaBasketConstituent";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/metafields/ReferenceWithMetaBasketConstituent";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetmetafieldsReferenceWithMetaBasketConstituent.json";
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

    public CdmObservableAssetMetafieldsReferenceWithMetaBasketConstituent address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmObservableAssetMetafieldsReferenceWithMetaBasketConstituent externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmObservableAssetMetafieldsReferenceWithMetaBasketConstituent globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
