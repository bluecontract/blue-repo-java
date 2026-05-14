package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("2eUu6niQhW8zWS6evCsP24YaWYzanhLYEv6cFzkp5FMc")
public class CollateralInterestCalculationParameters {
    public static String blueId() {
        return "2eUu6niQhW8zWS6evCsP24YaWYzanhLYEv6cFzkp5FMc";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CollateralInterestCalculationParameters";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CollateralInterestCalculationParameters";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CollateralInterestCalculationParameters.json";
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

    private List<BusinessCenterEnum> compoundingBusinessCenter;

    private CompoundingTypeEnum compoundingType;

    private DayCountFractionEnum dayCountFraction;

    private Double fixedRate;

    private CollateralAgreementFloatingRate floatingRate;

    private Boolean inBaseCurrency;

    private Rounding rounding;

    private RoundingFrequencyEnum roundingFrequency;

    private Double withholdingTaxRate;

    public String getNamespace() {
        return namespace;
    }

    public CollateralInterestCalculationParameters namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<BusinessCenterEnum> getCompoundingBusinessCenter() {
        return compoundingBusinessCenter;
    }

    public CollateralInterestCalculationParameters compoundingBusinessCenter(List<BusinessCenterEnum> compoundingBusinessCenter) {
        this.compoundingBusinessCenter = compoundingBusinessCenter;
        return this;
    }

    public CompoundingTypeEnum getCompoundingType() {
        return compoundingType;
    }

    public CollateralInterestCalculationParameters compoundingType(CompoundingTypeEnum compoundingType) {
        this.compoundingType = compoundingType;
        return this;
    }

    public DayCountFractionEnum getDayCountFraction() {
        return dayCountFraction;
    }

    public CollateralInterestCalculationParameters dayCountFraction(DayCountFractionEnum dayCountFraction) {
        this.dayCountFraction = dayCountFraction;
        return this;
    }

    public Double getFixedRate() {
        return fixedRate;
    }

    public CollateralInterestCalculationParameters fixedRate(Double fixedRate) {
        this.fixedRate = fixedRate;
        return this;
    }

    public CollateralAgreementFloatingRate getFloatingRate() {
        return floatingRate;
    }

    public CollateralInterestCalculationParameters floatingRate(CollateralAgreementFloatingRate floatingRate) {
        this.floatingRate = floatingRate;
        return this;
    }

    public Boolean getInBaseCurrency() {
        return inBaseCurrency;
    }

    public CollateralInterestCalculationParameters inBaseCurrency(Boolean inBaseCurrency) {
        this.inBaseCurrency = inBaseCurrency;
        return this;
    }

    public Rounding getRounding() {
        return rounding;
    }

    public CollateralInterestCalculationParameters rounding(Rounding rounding) {
        this.rounding = rounding;
        return this;
    }

    public RoundingFrequencyEnum getRoundingFrequency() {
        return roundingFrequency;
    }

    public CollateralInterestCalculationParameters roundingFrequency(RoundingFrequencyEnum roundingFrequency) {
        this.roundingFrequency = roundingFrequency;
        return this;
    }

    public Double getWithholdingTaxRate() {
        return withholdingTaxRate;
    }

    public CollateralInterestCalculationParameters withholdingTaxRate(Double withholdingTaxRate) {
        this.withholdingTaxRate = withholdingTaxRate;
        return this;
    }

}
