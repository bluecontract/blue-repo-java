package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("JByVeRQuwGo1r31f79PCJ4eGzRKDqQhXVhKm9t5FXtS6")
public class CdmRegulationSellr {
    public static String blueId() {
        return "JByVeRQuwGo1r31f79PCJ4eGzRKDqQhXVhKm9t5FXtS6";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/regulation/Sellr";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/regulation/Sellr";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmregulationSellr.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmRegulationAcctOwnr acctOwnr;

    public CdmRegulationAcctOwnr getAcctOwnr() {
        return acctOwnr;
    }

    public CdmRegulationSellr acctOwnr(CdmRegulationAcctOwnr acctOwnr) {
        this.acctOwnr = acctOwnr;
        return this;
    }

}
