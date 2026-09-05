package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("6tnvzEAQg1Tqkc1572JPVJu34evEHtavK8LcqJT1z8xF")
public class CdmProductCollateralCollateralInterestCalculationParameters {
    public static String blueId() {
        return "6tnvzEAQg1Tqkc1572JPVJu34evEHtavK8LcqJT1z8xF";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/CollateralInterestCalculationParameters";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/CollateralInterestCalculationParameters";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralCollateralInterestCalculationParameters.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmBaseDatetimeBusinessCenterEnum> compoundingBusinessCenter;

    private CdmBaseDatetimeCompoundingTypeEnum compoundingType;

    private CdmBaseDatetimeDaycountDayCountFractionEnum dayCountFraction;

    private Double fixedRate;

    private CdmProductCollateralCollateralAgreementFloatingRate floatingRate;

    private Boolean inBaseCurrency;

    private CdmBaseMathRounding rounding;

    private CdmBaseDatetimeRoundingFrequencyEnum roundingFrequency;

    private Double withholdingTaxRate;

    public List<CdmBaseDatetimeBusinessCenterEnum> getCompoundingBusinessCenter() {
        return compoundingBusinessCenter;
    }

    public CdmProductCollateralCollateralInterestCalculationParameters compoundingBusinessCenter(List<CdmBaseDatetimeBusinessCenterEnum> compoundingBusinessCenter) {
        this.compoundingBusinessCenter = compoundingBusinessCenter;
        return this;
    }

    public CdmBaseDatetimeCompoundingTypeEnum getCompoundingType() {
        return compoundingType;
    }

    public CdmProductCollateralCollateralInterestCalculationParameters compoundingType(CdmBaseDatetimeCompoundingTypeEnum compoundingType) {
        this.compoundingType = compoundingType;
        return this;
    }

    public CdmBaseDatetimeDaycountDayCountFractionEnum getDayCountFraction() {
        return dayCountFraction;
    }

    public CdmProductCollateralCollateralInterestCalculationParameters dayCountFraction(CdmBaseDatetimeDaycountDayCountFractionEnum dayCountFraction) {
        this.dayCountFraction = dayCountFraction;
        return this;
    }

    public Double getFixedRate() {
        return fixedRate;
    }

    public CdmProductCollateralCollateralInterestCalculationParameters fixedRate(Double fixedRate) {
        this.fixedRate = fixedRate;
        return this;
    }

    public CdmProductCollateralCollateralAgreementFloatingRate getFloatingRate() {
        return floatingRate;
    }

    public CdmProductCollateralCollateralInterestCalculationParameters floatingRate(CdmProductCollateralCollateralAgreementFloatingRate floatingRate) {
        this.floatingRate = floatingRate;
        return this;
    }

    public Boolean getInBaseCurrency() {
        return inBaseCurrency;
    }

    public CdmProductCollateralCollateralInterestCalculationParameters inBaseCurrency(Boolean inBaseCurrency) {
        this.inBaseCurrency = inBaseCurrency;
        return this;
    }

    public CdmBaseMathRounding getRounding() {
        return rounding;
    }

    public CdmProductCollateralCollateralInterestCalculationParameters rounding(CdmBaseMathRounding rounding) {
        this.rounding = rounding;
        return this;
    }

    public CdmBaseDatetimeRoundingFrequencyEnum getRoundingFrequency() {
        return roundingFrequency;
    }

    public CdmProductCollateralCollateralInterestCalculationParameters roundingFrequency(CdmBaseDatetimeRoundingFrequencyEnum roundingFrequency) {
        this.roundingFrequency = roundingFrequency;
        return this;
    }

    public Double getWithholdingTaxRate() {
        return withholdingTaxRate;
    }

    public CdmProductCollateralCollateralInterestCalculationParameters withholdingTaxRate(Double withholdingTaxRate) {
        this.withholdingTaxRate = withholdingTaxRate;
        return this;
    }

}
