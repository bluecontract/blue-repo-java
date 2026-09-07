package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FV3F4L4mXd4SDFt4K6HSoXsYRi4sEYbSYTdM9wvppN8x")
public class CdmProductAssetForeignExchange {
    public static String blueId() {
        return "FV3F4L4mXd4SDFt4K6HSoXsYRi4sEYbSYTdM9wvppN8x";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/ForeignExchange";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/ForeignExchange";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetForeignExchange.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCommonSettlementCashflow exchangedCurrency1;

    private CdmProductCommonSettlementCashflow exchangedCurrency2;

    private CdmBaseDatetimePeriod tenorPeriod;

    public CdmProductCommonSettlementCashflow getExchangedCurrency1() {
        return exchangedCurrency1;
    }

    public CdmProductAssetForeignExchange exchangedCurrency1(CdmProductCommonSettlementCashflow exchangedCurrency1) {
        this.exchangedCurrency1 = exchangedCurrency1;
        return this;
    }

    public CdmProductCommonSettlementCashflow getExchangedCurrency2() {
        return exchangedCurrency2;
    }

    public CdmProductAssetForeignExchange exchangedCurrency2(CdmProductCommonSettlementCashflow exchangedCurrency2) {
        this.exchangedCurrency2 = exchangedCurrency2;
        return this;
    }

    public CdmBaseDatetimePeriod getTenorPeriod() {
        return tenorPeriod;
    }

    public CdmProductAssetForeignExchange tenorPeriod(CdmBaseDatetimePeriod tenorPeriod) {
        this.tenorPeriod = tenorPeriod;
        return this;
    }

}
