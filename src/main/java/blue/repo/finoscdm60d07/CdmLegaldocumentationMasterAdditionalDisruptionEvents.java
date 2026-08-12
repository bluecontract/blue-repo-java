package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("BM4rGBdGf3cf5jwjqFsDtmczUu4GP1JoMjZyDxQkyssX")
public class CdmLegaldocumentationMasterAdditionalDisruptionEvents {
    public static String blueId() {
        return "BM4rGBdGf3cf5jwjqFsDtmczUu4GP1JoMjZyDxQkyssX";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/master/AdditionalDisruptionEvents";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/master/AdditionalDisruptionEvents";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationmasterAdditionalDisruptionEvents.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmLegaldocumentationMasterClause> additionalBespokeTerms;

    private Boolean changeInLaw;

    private CdmBaseStaticdataPartyAncillaryRoleEnum determiningParty;

    private Boolean failureToDeliver;

    private Boolean foreignOwnershipEvent;

    private Boolean hedgingDisruption;

    private Boolean increasedCostOfHedging;

    private Boolean increasedCostOfStockBorrow;

    private Double initialStockLoanRate;

    private Boolean insolvencyFiling;

    private Boolean lossOfStockBorrow;

    private Double maximumStockLoanRate;

    public List<CdmLegaldocumentationMasterClause> getAdditionalBespokeTerms() {
        return additionalBespokeTerms;
    }

    public CdmLegaldocumentationMasterAdditionalDisruptionEvents additionalBespokeTerms(List<CdmLegaldocumentationMasterClause> additionalBespokeTerms) {
        this.additionalBespokeTerms = additionalBespokeTerms;
        return this;
    }

    public Boolean getChangeInLaw() {
        return changeInLaw;
    }

    public CdmLegaldocumentationMasterAdditionalDisruptionEvents changeInLaw(Boolean changeInLaw) {
        this.changeInLaw = changeInLaw;
        return this;
    }

    public CdmBaseStaticdataPartyAncillaryRoleEnum getDeterminingParty() {
        return determiningParty;
    }

    public CdmLegaldocumentationMasterAdditionalDisruptionEvents determiningParty(CdmBaseStaticdataPartyAncillaryRoleEnum determiningParty) {
        this.determiningParty = determiningParty;
        return this;
    }

    public Boolean getFailureToDeliver() {
        return failureToDeliver;
    }

    public CdmLegaldocumentationMasterAdditionalDisruptionEvents failureToDeliver(Boolean failureToDeliver) {
        this.failureToDeliver = failureToDeliver;
        return this;
    }

    public Boolean getForeignOwnershipEvent() {
        return foreignOwnershipEvent;
    }

    public CdmLegaldocumentationMasterAdditionalDisruptionEvents foreignOwnershipEvent(Boolean foreignOwnershipEvent) {
        this.foreignOwnershipEvent = foreignOwnershipEvent;
        return this;
    }

    public Boolean getHedgingDisruption() {
        return hedgingDisruption;
    }

    public CdmLegaldocumentationMasterAdditionalDisruptionEvents hedgingDisruption(Boolean hedgingDisruption) {
        this.hedgingDisruption = hedgingDisruption;
        return this;
    }

    public Boolean getIncreasedCostOfHedging() {
        return increasedCostOfHedging;
    }

    public CdmLegaldocumentationMasterAdditionalDisruptionEvents increasedCostOfHedging(Boolean increasedCostOfHedging) {
        this.increasedCostOfHedging = increasedCostOfHedging;
        return this;
    }

    public Boolean getIncreasedCostOfStockBorrow() {
        return increasedCostOfStockBorrow;
    }

    public CdmLegaldocumentationMasterAdditionalDisruptionEvents increasedCostOfStockBorrow(Boolean increasedCostOfStockBorrow) {
        this.increasedCostOfStockBorrow = increasedCostOfStockBorrow;
        return this;
    }

    public Double getInitialStockLoanRate() {
        return initialStockLoanRate;
    }

    public CdmLegaldocumentationMasterAdditionalDisruptionEvents initialStockLoanRate(Double initialStockLoanRate) {
        this.initialStockLoanRate = initialStockLoanRate;
        return this;
    }

    public Boolean getInsolvencyFiling() {
        return insolvencyFiling;
    }

    public CdmLegaldocumentationMasterAdditionalDisruptionEvents insolvencyFiling(Boolean insolvencyFiling) {
        this.insolvencyFiling = insolvencyFiling;
        return this;
    }

    public Boolean getLossOfStockBorrow() {
        return lossOfStockBorrow;
    }

    public CdmLegaldocumentationMasterAdditionalDisruptionEvents lossOfStockBorrow(Boolean lossOfStockBorrow) {
        this.lossOfStockBorrow = lossOfStockBorrow;
        return this;
    }

    public Double getMaximumStockLoanRate() {
        return maximumStockLoanRate;
    }

    public CdmLegaldocumentationMasterAdditionalDisruptionEvents maximumStockLoanRate(Double maximumStockLoanRate) {
        this.maximumStockLoanRate = maximumStockLoanRate;
        return this;
    }

}
