package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Fo6yaK4x5yuUydaNDEEZbDP6oD21uDWb6peFjJjsF5pk")
public class ContractBase {
    public static String blueId() {
        return "Fo6yaK4x5yuUydaNDEEZbDP6oD21uDWb6peFjJjsF5pk";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ContractBase";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ContractBase";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ContractBase.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    private ReferenceWithMetaCollateral collateral;

    private ReferenceWithMetaContractDetails contractDetails;

    private ReferenceWithMetaExecutionDetails executionDetails;

    public String getNamespace() {
        return namespace;
    }

    public ContractBase namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ReferenceWithMetaCollateral getCollateral() {
        return collateral;
    }

    public ContractBase collateral(ReferenceWithMetaCollateral collateral) {
        this.collateral = collateral;
        return this;
    }

    public ReferenceWithMetaContractDetails getContractDetails() {
        return contractDetails;
    }

    public ContractBase contractDetails(ReferenceWithMetaContractDetails contractDetails) {
        this.contractDetails = contractDetails;
        return this;
    }

    public ReferenceWithMetaExecutionDetails getExecutionDetails() {
        return executionDetails;
    }

    public ContractBase executionDetails(ReferenceWithMetaExecutionDetails executionDetails) {
        this.executionDetails = executionDetails;
        return this;
    }

}
