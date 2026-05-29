package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("C5nADRBcWM2dKjXzJRRmahbypM7x2DUsv7Mxpuc9uPRu")
public class CdmEventCommonMetafieldsReferenceWithMetaTrade {
    public static String blueId() {
        return "C5nADRBcWM2dKjXzJRRmahbypM7x2DUsv7Mxpuc9uPRu";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/metafields/ReferenceWithMetaTrade";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/metafields/ReferenceWithMetaTrade";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonmetafieldsReferenceWithMetaTrade.json";
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

    public CdmEventCommonMetafieldsReferenceWithMetaTrade address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmEventCommonMetafieldsReferenceWithMetaTrade externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmEventCommonMetafieldsReferenceWithMetaTrade globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
