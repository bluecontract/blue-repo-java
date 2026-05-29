package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("A2eu6mCquL2q8sKhpvBAfkp3b6uAG8GdE22hHTvvQEMi")
public class CdmObservableEventMetafieldsReferenceWithMetaObservation {
    public static String blueId() {
        return "A2eu6mCquL2q8sKhpvBAfkp3b6uAG8GdE22hHTvvQEMi";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/event/metafields/ReferenceWithMetaObservation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/event/metafields/ReferenceWithMetaObservation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableeventmetafieldsReferenceWithMetaObservation.json";
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

    public CdmObservableEventMetafieldsReferenceWithMetaObservation address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmObservableEventMetafieldsReferenceWithMetaObservation externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmObservableEventMetafieldsReferenceWithMetaObservation globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
