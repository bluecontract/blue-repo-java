package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BkMb8vLvnJKd2uBNbPk8QJCpmMbYGV8HNkhUbEsM5p81")
public class CdmEventPositionContractBase {
    public static String blueId() {
        return "BkMb8vLvnJKd2uBNbPk8QJCpmMbYGV8HNkhUbEsM5p81";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/position/ContractBase";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/position/ContractBase";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventpositionContractBase.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCollateralMetafieldsReferenceWithMetaCollateral collateral;

    private CdmEventCommonMetafieldsReferenceWithMetaContractDetails contractDetails;

    private CdmEventCommonMetafieldsReferenceWithMetaExecutionDetails executionDetails;

    public CdmProductCollateralMetafieldsReferenceWithMetaCollateral getCollateral() {
        return collateral;
    }

    public CdmEventPositionContractBase collateral(CdmProductCollateralMetafieldsReferenceWithMetaCollateral collateral) {
        this.collateral = collateral;
        return this;
    }

    public CdmEventCommonMetafieldsReferenceWithMetaContractDetails getContractDetails() {
        return contractDetails;
    }

    public CdmEventPositionContractBase contractDetails(CdmEventCommonMetafieldsReferenceWithMetaContractDetails contractDetails) {
        this.contractDetails = contractDetails;
        return this;
    }

    public CdmEventCommonMetafieldsReferenceWithMetaExecutionDetails getExecutionDetails() {
        return executionDetails;
    }

    public CdmEventPositionContractBase executionDetails(CdmEventCommonMetafieldsReferenceWithMetaExecutionDetails executionDetails) {
        this.executionDetails = executionDetails;
        return this;
    }

}
