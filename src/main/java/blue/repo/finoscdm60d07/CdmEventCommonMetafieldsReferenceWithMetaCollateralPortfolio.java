package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4BrXNc4oFsUfnFzm3uWTqNmgivGhZJRmaoxvb8kK9xiw")
public class CdmEventCommonMetafieldsReferenceWithMetaCollateralPortfolio {
    public static String blueId() {
        return "4BrXNc4oFsUfnFzm3uWTqNmgivGhZJRmaoxvb8kK9xiw";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/metafields/ReferenceWithMetaCollateralPortfolio";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/metafields/ReferenceWithMetaCollateralPortfolio";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonmetafieldsReferenceWithMetaCollateralPortfolio.json";
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

    public CdmEventCommonMetafieldsReferenceWithMetaCollateralPortfolio address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmEventCommonMetafieldsReferenceWithMetaCollateralPortfolio externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmEventCommonMetafieldsReferenceWithMetaCollateralPortfolio globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
