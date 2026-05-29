package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FWcQmx5gu2ihsKm9K2BYniLmbetQeMxPF6ZpzM3uVXXD")
public class CdmObservableEventMetafieldsReferenceWithMetaCreditEvents {
    public static String blueId() {
        return "FWcQmx5gu2ihsKm9K2BYniLmbetQeMxPF6ZpzM3uVXXD";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/event/metafields/ReferenceWithMetaCreditEvents";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/event/metafields/ReferenceWithMetaCreditEvents";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableeventmetafieldsReferenceWithMetaCreditEvents.json";
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

    public CdmObservableEventMetafieldsReferenceWithMetaCreditEvents address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmObservableEventMetafieldsReferenceWithMetaCreditEvents externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmObservableEventMetafieldsReferenceWithMetaCreditEvents globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
