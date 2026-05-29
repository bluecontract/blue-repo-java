package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Gy95RNhUriR4g4Z6ivBrL1Q5mBfGozWYn66Dyr11NkzN")
public class CdmProductCollateralCounterpartyOwnIssuePermitted {
    public static String blueId() {
        return "Gy95RNhUriR4g4Z6ivBrL1Q5mBfGozWYn66Dyr11NkzN";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/CounterpartyOwnIssuePermitted";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/CounterpartyOwnIssuePermitted";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralCounterpartyOwnIssuePermitted.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean counterpartyOwnIssuePermitted;

    public Boolean getCounterpartyOwnIssuePermitted() {
        return counterpartyOwnIssuePermitted;
    }

    public CdmProductCollateralCounterpartyOwnIssuePermitted counterpartyOwnIssuePermitted(Boolean counterpartyOwnIssuePermitted) {
        this.counterpartyOwnIssuePermitted = counterpartyOwnIssuePermitted;
        return this;
    }

}
