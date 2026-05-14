package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("5kXk9Uzw8zdnt3rnmXD4h4i6DVxmrWtL7ZKyDsPx9nMf#6")
public class EconomicTerms {
    public static String blueId() {
        return "5kXk9Uzw8zdnt3rnmXD4h4i6DVxmrWtL7ZKyDsPx9nMf#6";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "EconomicTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/EconomicTerms";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/EconomicTerms.json";
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

    private CalculationAgent calculationAgent;

    private Collateral collateral;

    private BusinessDayAdjustments dateAdjustments;

    private AdjustableOrRelativeDate effectiveDate;

    private Boolean nonStandardisedTerms;

    private List<Payout> payout;

    private AdjustableOrRelativeDate terminationDate;

    private TerminationProvision terminationProvision;

    public String getNamespace() {
        return namespace;
    }

    public EconomicTerms namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CalculationAgent getCalculationAgent() {
        return calculationAgent;
    }

    public EconomicTerms calculationAgent(CalculationAgent calculationAgent) {
        this.calculationAgent = calculationAgent;
        return this;
    }

    public Collateral getCollateral() {
        return collateral;
    }

    public EconomicTerms collateral(Collateral collateral) {
        this.collateral = collateral;
        return this;
    }

    public BusinessDayAdjustments getDateAdjustments() {
        return dateAdjustments;
    }

    public EconomicTerms dateAdjustments(BusinessDayAdjustments dateAdjustments) {
        this.dateAdjustments = dateAdjustments;
        return this;
    }

    public AdjustableOrRelativeDate getEffectiveDate() {
        return effectiveDate;
    }

    public EconomicTerms effectiveDate(AdjustableOrRelativeDate effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public Boolean getNonStandardisedTerms() {
        return nonStandardisedTerms;
    }

    public EconomicTerms nonStandardisedTerms(Boolean nonStandardisedTerms) {
        this.nonStandardisedTerms = nonStandardisedTerms;
        return this;
    }

    public List<Payout> getPayout() {
        return payout;
    }

    public EconomicTerms payout(List<Payout> payout) {
        this.payout = payout;
        return this;
    }

    public AdjustableOrRelativeDate getTerminationDate() {
        return terminationDate;
    }

    public EconomicTerms terminationDate(AdjustableOrRelativeDate terminationDate) {
        this.terminationDate = terminationDate;
        return this;
    }

    public TerminationProvision getTerminationProvision() {
        return terminationProvision;
    }

    public EconomicTerms terminationProvision(TerminationProvision terminationProvision) {
        this.terminationProvision = terminationProvision;
        return this;
    }

}
