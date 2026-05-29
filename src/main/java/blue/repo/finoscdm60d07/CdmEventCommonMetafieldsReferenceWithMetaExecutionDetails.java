package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AveBbPNcyiENsH8aGj4xhEY7GkX7xuoVApDW87Er969J")
public class CdmEventCommonMetafieldsReferenceWithMetaExecutionDetails {
    public static String blueId() {
        return "AveBbPNcyiENsH8aGj4xhEY7GkX7xuoVApDW87Er969J";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/metafields/ReferenceWithMetaExecutionDetails";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/metafields/ReferenceWithMetaExecutionDetails";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonmetafieldsReferenceWithMetaExecutionDetails.json";
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

    public CdmEventCommonMetafieldsReferenceWithMetaExecutionDetails address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmEventCommonMetafieldsReferenceWithMetaExecutionDetails externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmEventCommonMetafieldsReferenceWithMetaExecutionDetails globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
