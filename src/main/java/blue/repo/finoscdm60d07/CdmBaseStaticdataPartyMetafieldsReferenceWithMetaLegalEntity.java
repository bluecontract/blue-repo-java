package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2y5oTswWqzzAdz3YW657fXdmY8ENhbHAEWBxJwfmi5f3")
public class CdmBaseStaticdataPartyMetafieldsReferenceWithMetaLegalEntity {
    public static String blueId() {
        return "2y5oTswWqzzAdz3YW657fXdmY8ENhbHAEWBxJwfmi5f3";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/metafields/ReferenceWithMetaLegalEntity";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/metafields/ReferenceWithMetaLegalEntity";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartymetafieldsReferenceWithMetaLegalEntity.json";
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

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaLegalEntity address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaLegalEntity externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaLegalEntity globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
