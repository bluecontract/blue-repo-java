package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("9qWGsXauVnxS5oNKRAwfaMctCyeviwAypHKtHdS4HXZd#6")
public class CdmProductTemplateEconomicTerms {
    public static String blueId() {
        return "9qWGsXauVnxS5oNKRAwfaMctCyeviwAypHKtHdS4HXZd#6";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/EconomicTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/EconomicTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateEconomicTerms.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetCalculationAgent calculationAgent;

    private CdmProductCollateralCollateral collateral;

    private CdmBaseDatetimeBusinessDayAdjustments dateAdjustments;

    private CdmBaseDatetimeAdjustableOrRelativeDate effectiveDate;

    private Boolean nonStandardisedTerms;

    private List<CdmProductTemplatePayout> payout;

    private CdmBaseDatetimeAdjustableOrRelativeDate terminationDate;

    private CdmProductTemplateTerminationProvision terminationProvision;

    public CdmObservableAssetCalculationAgent getCalculationAgent() {
        return calculationAgent;
    }

    public CdmProductTemplateEconomicTerms calculationAgent(CdmObservableAssetCalculationAgent calculationAgent) {
        this.calculationAgent = calculationAgent;
        return this;
    }

    public CdmProductCollateralCollateral getCollateral() {
        return collateral;
    }

    public CdmProductTemplateEconomicTerms collateral(CdmProductCollateralCollateral collateral) {
        this.collateral = collateral;
        return this;
    }

    public CdmBaseDatetimeBusinessDayAdjustments getDateAdjustments() {
        return dateAdjustments;
    }

    public CdmProductTemplateEconomicTerms dateAdjustments(CdmBaseDatetimeBusinessDayAdjustments dateAdjustments) {
        this.dateAdjustments = dateAdjustments;
        return this;
    }

    public CdmBaseDatetimeAdjustableOrRelativeDate getEffectiveDate() {
        return effectiveDate;
    }

    public CdmProductTemplateEconomicTerms effectiveDate(CdmBaseDatetimeAdjustableOrRelativeDate effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public Boolean getNonStandardisedTerms() {
        return nonStandardisedTerms;
    }

    public CdmProductTemplateEconomicTerms nonStandardisedTerms(Boolean nonStandardisedTerms) {
        this.nonStandardisedTerms = nonStandardisedTerms;
        return this;
    }

    public List<CdmProductTemplatePayout> getPayout() {
        return payout;
    }

    public CdmProductTemplateEconomicTerms payout(List<CdmProductTemplatePayout> payout) {
        this.payout = payout;
        return this;
    }

    public CdmBaseDatetimeAdjustableOrRelativeDate getTerminationDate() {
        return terminationDate;
    }

    public CdmProductTemplateEconomicTerms terminationDate(CdmBaseDatetimeAdjustableOrRelativeDate terminationDate) {
        this.terminationDate = terminationDate;
        return this;
    }

    public CdmProductTemplateTerminationProvision getTerminationProvision() {
        return terminationProvision;
    }

    public CdmProductTemplateEconomicTerms terminationProvision(CdmProductTemplateTerminationProvision terminationProvision) {
        this.terminationProvision = terminationProvision;
        return this;
    }

}
