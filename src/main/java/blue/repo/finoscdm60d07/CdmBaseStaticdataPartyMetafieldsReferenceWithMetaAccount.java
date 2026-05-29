package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HtZnJJw9C1Sg3ZZnEs8UKM65tyQLQcsMEQcVGZJx34Hi")
public class CdmBaseStaticdataPartyMetafieldsReferenceWithMetaAccount {
    public static String blueId() {
        return "HtZnJJw9C1Sg3ZZnEs8UKM65tyQLQcsMEQcVGZJx34Hi";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/metafields/ReferenceWithMetaAccount";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/metafields/ReferenceWithMetaAccount";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartymetafieldsReferenceWithMetaAccount.json";
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

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaAccount address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaAccount externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaAccount globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
