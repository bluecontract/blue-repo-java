package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("9qZESRoTw3JVrvChnNta2oj5TcTb7RV9ijcSRtnuCQvs")
public class CdmProductTemplateOptionalEarlyTermination {
    public static String blueId() {
        return "9qZESRoTw3JVrvChnNta2oj5TcTb7RV9ijcSRtnuCQvs";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/OptionalEarlyTermination";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/OptionalEarlyTermination";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateOptionalEarlyTermination.json";
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

    private CdmProductCommonSettlementSettlementTerms cashSettlement;

    private List<CdmProductTemplateExerciseNotice> exerciseNotice;

    private CdmProductTemplateExerciseTerms exerciseTerms;

    private Boolean followUpConfirmation;

    private Boolean mutualEarlyTermination;

    private CdmProductTemplateOptionalEarlyTerminationAdjustedDates optionalEarlyTerminationAdjustedDates;

    private CdmBaseStaticdataPartyBuyerSeller singlePartyOption;

    public CdmObservableAssetCalculationAgent getCalculationAgent() {
        return calculationAgent;
    }

    public CdmProductTemplateOptionalEarlyTermination calculationAgent(CdmObservableAssetCalculationAgent calculationAgent) {
        this.calculationAgent = calculationAgent;
        return this;
    }

    public CdmProductCommonSettlementSettlementTerms getCashSettlement() {
        return cashSettlement;
    }

    public CdmProductTemplateOptionalEarlyTermination cashSettlement(CdmProductCommonSettlementSettlementTerms cashSettlement) {
        this.cashSettlement = cashSettlement;
        return this;
    }

    public List<CdmProductTemplateExerciseNotice> getExerciseNotice() {
        return exerciseNotice;
    }

    public CdmProductTemplateOptionalEarlyTermination exerciseNotice(List<CdmProductTemplateExerciseNotice> exerciseNotice) {
        this.exerciseNotice = exerciseNotice;
        return this;
    }

    public CdmProductTemplateExerciseTerms getExerciseTerms() {
        return exerciseTerms;
    }

    public CdmProductTemplateOptionalEarlyTermination exerciseTerms(CdmProductTemplateExerciseTerms exerciseTerms) {
        this.exerciseTerms = exerciseTerms;
        return this;
    }

    public Boolean getFollowUpConfirmation() {
        return followUpConfirmation;
    }

    public CdmProductTemplateOptionalEarlyTermination followUpConfirmation(Boolean followUpConfirmation) {
        this.followUpConfirmation = followUpConfirmation;
        return this;
    }

    public Boolean getMutualEarlyTermination() {
        return mutualEarlyTermination;
    }

    public CdmProductTemplateOptionalEarlyTermination mutualEarlyTermination(Boolean mutualEarlyTermination) {
        this.mutualEarlyTermination = mutualEarlyTermination;
        return this;
    }

    public CdmProductTemplateOptionalEarlyTerminationAdjustedDates getOptionalEarlyTerminationAdjustedDates() {
        return optionalEarlyTerminationAdjustedDates;
    }

    public CdmProductTemplateOptionalEarlyTermination optionalEarlyTerminationAdjustedDates(CdmProductTemplateOptionalEarlyTerminationAdjustedDates optionalEarlyTerminationAdjustedDates) {
        this.optionalEarlyTerminationAdjustedDates = optionalEarlyTerminationAdjustedDates;
        return this;
    }

    public CdmBaseStaticdataPartyBuyerSeller getSinglePartyOption() {
        return singlePartyOption;
    }

    public CdmProductTemplateOptionalEarlyTermination singlePartyOption(CdmBaseStaticdataPartyBuyerSeller singlePartyOption) {
        this.singlePartyOption = singlePartyOption;
        return this;
    }

}
