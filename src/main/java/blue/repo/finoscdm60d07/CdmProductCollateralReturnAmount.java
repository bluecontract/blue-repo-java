package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HpBh6DxVn5k45kpY9oDbqGhBWE3eEphzgwottdc68x3B")
public class CdmProductCollateralReturnAmount {
    public static String blueId() {
        return "HpBh6DxVn5k45kpY9oDbqGhBWE3eEphzgwottdc68x3B";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/ReturnAmount";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/ReturnAmount";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralReturnAmount.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String customElection;

    private Boolean includesDefaultLanguage;

    public String getCustomElection() {
        return customElection;
    }

    public CdmProductCollateralReturnAmount customElection(String customElection) {
        this.customElection = customElection;
        return this;
    }

    public Boolean getIncludesDefaultLanguage() {
        return includesDefaultLanguage;
    }

    public CdmProductCollateralReturnAmount includesDefaultLanguage(Boolean includesDefaultLanguage) {
        this.includesDefaultLanguage = includesDefaultLanguage;
        return this;
    }

}
