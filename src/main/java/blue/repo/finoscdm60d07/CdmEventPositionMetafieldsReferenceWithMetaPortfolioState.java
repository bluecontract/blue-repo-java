package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FiGnX5GAARt1cJzgo4BT3oAxDUqkYktySnbp28d47HxS")
public class CdmEventPositionMetafieldsReferenceWithMetaPortfolioState {
    public static String blueId() {
        return "FiGnX5GAARt1cJzgo4BT3oAxDUqkYktySnbp28d47HxS";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/position/metafields/ReferenceWithMetaPortfolioState";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/position/metafields/ReferenceWithMetaPortfolioState";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventpositionmetafieldsReferenceWithMetaPortfolioState.json";
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

    public CdmEventPositionMetafieldsReferenceWithMetaPortfolioState address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmEventPositionMetafieldsReferenceWithMetaPortfolioState externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmEventPositionMetafieldsReferenceWithMetaPortfolioState globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
