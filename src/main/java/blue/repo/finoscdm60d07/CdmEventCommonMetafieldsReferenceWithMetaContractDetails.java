package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9QvPaXwgMX4bfTdirhDyje4sXJhxGdfrXikFFGpngwAb")
public class CdmEventCommonMetafieldsReferenceWithMetaContractDetails {
    public static String blueId() {
        return "9QvPaXwgMX4bfTdirhDyje4sXJhxGdfrXikFFGpngwAb";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/metafields/ReferenceWithMetaContractDetails";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/metafields/ReferenceWithMetaContractDetails";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonmetafieldsReferenceWithMetaContractDetails.json";
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

    public CdmEventCommonMetafieldsReferenceWithMetaContractDetails address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmEventCommonMetafieldsReferenceWithMetaContractDetails externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmEventCommonMetafieldsReferenceWithMetaContractDetails globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
