package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("74ZqfQyjiMoAp8Zf2AqBffQWhhB4atamZoVwmFKGhM2R")
public class CdmProductCollateralDomesticCurrencyIssued {
    public static String blueId() {
        return "74ZqfQyjiMoAp8Zf2AqBffQWhhB4atamZoVwmFKGhM2R";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/DomesticCurrencyIssued";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/DomesticCurrencyIssued";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralDomesticCurrencyIssued.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean domesticCurrencyIssued;

    public Boolean getDomesticCurrencyIssued() {
        return domesticCurrencyIssued;
    }

    public CdmProductCollateralDomesticCurrencyIssued domesticCurrencyIssued(Boolean domesticCurrencyIssued) {
        this.domesticCurrencyIssued = domesticCurrencyIssued;
        return this;
    }

}
