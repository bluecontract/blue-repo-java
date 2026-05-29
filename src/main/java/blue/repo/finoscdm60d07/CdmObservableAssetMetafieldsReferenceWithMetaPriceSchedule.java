package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2Uog2mdWokkHVaMVWG2ZhXCKPdQtauRk7oxemYRLn9hy")
public class CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule {
    public static String blueId() {
        return "2Uog2mdWokkHVaMVWG2ZhXCKPdQtauRk7oxemYRLn9hy";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/metafields/ReferenceWithMetaPriceSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/metafields/ReferenceWithMetaPriceSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetmetafieldsReferenceWithMetaPriceSchedule.json";
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

    public CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
