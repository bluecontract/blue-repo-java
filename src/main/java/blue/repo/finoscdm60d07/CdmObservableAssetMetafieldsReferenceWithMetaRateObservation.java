package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5ELPXXGetNc7L1KzToiwonniwtgkJ3BHxxLYZiFDy22x")
public class CdmObservableAssetMetafieldsReferenceWithMetaRateObservation {
    public static String blueId() {
        return "5ELPXXGetNc7L1KzToiwonniwtgkJ3BHxxLYZiFDy22x";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/metafields/ReferenceWithMetaRateObservation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/metafields/ReferenceWithMetaRateObservation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetmetafieldsReferenceWithMetaRateObservation.json";
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

    public CdmObservableAssetMetafieldsReferenceWithMetaRateObservation address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmObservableAssetMetafieldsReferenceWithMetaRateObservation externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmObservableAssetMetafieldsReferenceWithMetaRateObservation globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
