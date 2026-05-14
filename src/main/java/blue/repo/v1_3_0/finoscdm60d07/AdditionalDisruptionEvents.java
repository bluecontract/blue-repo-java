package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("9dUGrNsv7ZaPQb3MQXhaaixopR8M8bEt239dF1jv1gxv")
public class AdditionalDisruptionEvents {
    public static String blueId() {
        return "9dUGrNsv7ZaPQb3MQXhaaixopR8M8bEt239dF1jv1gxv";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AdditionalDisruptionEvents";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AdditionalDisruptionEvents";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/AdditionalDisruptionEvents.json";
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

    private List<Clause> additionalBespokeTerms;

    private Boolean changeInLaw;

    private AncillaryRoleEnum determiningParty;

    private Boolean failureToDeliver;

    private Boolean foreignOwnershipEvent;

    private Boolean hedgingDisruption;

    private Boolean increasedCostOfHedging;

    private Boolean increasedCostOfStockBorrow;

    private Double initialStockLoanRate;

    private Boolean insolvencyFiling;

    private Boolean lossOfStockBorrow;

    private Double maximumStockLoanRate;

    public String getNamespace() {
        return namespace;
    }

    public AdditionalDisruptionEvents namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<Clause> getAdditionalBespokeTerms() {
        return additionalBespokeTerms;
    }

    public AdditionalDisruptionEvents additionalBespokeTerms(List<Clause> additionalBespokeTerms) {
        this.additionalBespokeTerms = additionalBespokeTerms;
        return this;
    }

    public Boolean getChangeInLaw() {
        return changeInLaw;
    }

    public AdditionalDisruptionEvents changeInLaw(Boolean changeInLaw) {
        this.changeInLaw = changeInLaw;
        return this;
    }

    public AncillaryRoleEnum getDeterminingParty() {
        return determiningParty;
    }

    public AdditionalDisruptionEvents determiningParty(AncillaryRoleEnum determiningParty) {
        this.determiningParty = determiningParty;
        return this;
    }

    public Boolean getFailureToDeliver() {
        return failureToDeliver;
    }

    public AdditionalDisruptionEvents failureToDeliver(Boolean failureToDeliver) {
        this.failureToDeliver = failureToDeliver;
        return this;
    }

    public Boolean getForeignOwnershipEvent() {
        return foreignOwnershipEvent;
    }

    public AdditionalDisruptionEvents foreignOwnershipEvent(Boolean foreignOwnershipEvent) {
        this.foreignOwnershipEvent = foreignOwnershipEvent;
        return this;
    }

    public Boolean getHedgingDisruption() {
        return hedgingDisruption;
    }

    public AdditionalDisruptionEvents hedgingDisruption(Boolean hedgingDisruption) {
        this.hedgingDisruption = hedgingDisruption;
        return this;
    }

    public Boolean getIncreasedCostOfHedging() {
        return increasedCostOfHedging;
    }

    public AdditionalDisruptionEvents increasedCostOfHedging(Boolean increasedCostOfHedging) {
        this.increasedCostOfHedging = increasedCostOfHedging;
        return this;
    }

    public Boolean getIncreasedCostOfStockBorrow() {
        return increasedCostOfStockBorrow;
    }

    public AdditionalDisruptionEvents increasedCostOfStockBorrow(Boolean increasedCostOfStockBorrow) {
        this.increasedCostOfStockBorrow = increasedCostOfStockBorrow;
        return this;
    }

    public Double getInitialStockLoanRate() {
        return initialStockLoanRate;
    }

    public AdditionalDisruptionEvents initialStockLoanRate(Double initialStockLoanRate) {
        this.initialStockLoanRate = initialStockLoanRate;
        return this;
    }

    public Boolean getInsolvencyFiling() {
        return insolvencyFiling;
    }

    public AdditionalDisruptionEvents insolvencyFiling(Boolean insolvencyFiling) {
        this.insolvencyFiling = insolvencyFiling;
        return this;
    }

    public Boolean getLossOfStockBorrow() {
        return lossOfStockBorrow;
    }

    public AdditionalDisruptionEvents lossOfStockBorrow(Boolean lossOfStockBorrow) {
        this.lossOfStockBorrow = lossOfStockBorrow;
        return this;
    }

    public Double getMaximumStockLoanRate() {
        return maximumStockLoanRate;
    }

    public AdditionalDisruptionEvents maximumStockLoanRate(Double maximumStockLoanRate) {
        this.maximumStockLoanRate = maximumStockLoanRate;
        return this;
    }

}
