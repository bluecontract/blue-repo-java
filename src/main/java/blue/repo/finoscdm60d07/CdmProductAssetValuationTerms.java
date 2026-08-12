package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("3RV4JPXGMLbdEEtEMdNSG3rPva1V96fHc2XFGnK9o2r5")
public class CdmProductAssetValuationTerms {
    public static String blueId() {
        return "3RV4JPXGMLbdEEtEMdNSG3rPva1V96fHc2XFGnK9o2r5";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/ValuationTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/ValuationTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetValuationTerms.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean componentSecurityIndexAnnexFallback;

    private CdmBaseDatetimeAdjustableRelativeOrPeriodicDates dividendValuationDates;

    private CdmProductAssetFPVFinalPriceElectionFallbackEnum fPVFinalPriceElectionFallback;

    private Boolean futuresPriceValuation;

    private Boolean multipleExchangeIndexAnnexFallback;

    private BigInteger numberOfValuationDates;

    private Boolean optionsPriceValuation;

    public Boolean getComponentSecurityIndexAnnexFallback() {
        return componentSecurityIndexAnnexFallback;
    }

    public CdmProductAssetValuationTerms componentSecurityIndexAnnexFallback(Boolean componentSecurityIndexAnnexFallback) {
        this.componentSecurityIndexAnnexFallback = componentSecurityIndexAnnexFallback;
        return this;
    }

    public CdmBaseDatetimeAdjustableRelativeOrPeriodicDates getDividendValuationDates() {
        return dividendValuationDates;
    }

    public CdmProductAssetValuationTerms dividendValuationDates(CdmBaseDatetimeAdjustableRelativeOrPeriodicDates dividendValuationDates) {
        this.dividendValuationDates = dividendValuationDates;
        return this;
    }

    public CdmProductAssetFPVFinalPriceElectionFallbackEnum getFPVFinalPriceElectionFallback() {
        return fPVFinalPriceElectionFallback;
    }

    public CdmProductAssetValuationTerms fPVFinalPriceElectionFallback(CdmProductAssetFPVFinalPriceElectionFallbackEnum fPVFinalPriceElectionFallback) {
        this.fPVFinalPriceElectionFallback = fPVFinalPriceElectionFallback;
        return this;
    }

    public Boolean getFuturesPriceValuation() {
        return futuresPriceValuation;
    }

    public CdmProductAssetValuationTerms futuresPriceValuation(Boolean futuresPriceValuation) {
        this.futuresPriceValuation = futuresPriceValuation;
        return this;
    }

    public Boolean getMultipleExchangeIndexAnnexFallback() {
        return multipleExchangeIndexAnnexFallback;
    }

    public CdmProductAssetValuationTerms multipleExchangeIndexAnnexFallback(Boolean multipleExchangeIndexAnnexFallback) {
        this.multipleExchangeIndexAnnexFallback = multipleExchangeIndexAnnexFallback;
        return this;
    }

    public BigInteger getNumberOfValuationDates() {
        return numberOfValuationDates;
    }

    public CdmProductAssetValuationTerms numberOfValuationDates(BigInteger numberOfValuationDates) {
        this.numberOfValuationDates = numberOfValuationDates;
        return this;
    }

    public Boolean getOptionsPriceValuation() {
        return optionsPriceValuation;
    }

    public CdmProductAssetValuationTerms optionsPriceValuation(Boolean optionsPriceValuation) {
        this.optionsPriceValuation = optionsPriceValuation;
        return this;
    }

}
