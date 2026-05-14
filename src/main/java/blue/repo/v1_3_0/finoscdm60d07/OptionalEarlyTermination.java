package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("9df9vtexhCVnu5sLCMBUP17L6Rqt24z8xitx1MCUq4Gw")
public class OptionalEarlyTermination {
    public static String blueId() {
        return "9df9vtexhCVnu5sLCMBUP17L6Rqt24z8xitx1MCUq4Gw";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "OptionalEarlyTermination";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/OptionalEarlyTermination";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/OptionalEarlyTermination.json";
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

    private SettlementTerms cashSettlement;

    private List<ExerciseNotice> exerciseNotice;

    private ExerciseTerms exerciseTerms;

    private Boolean followUpConfirmation;

    private Boolean mutualEarlyTermination;

    private OptionalEarlyTerminationAdjustedDates optionalEarlyTerminationAdjustedDates;

    private BuyerSeller singlePartyOption;

    public String getNamespace() {
        return namespace;
    }

    public OptionalEarlyTermination namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CalculationAgent getCalculationAgent() {
        return calculationAgent;
    }

    public OptionalEarlyTermination calculationAgent(CalculationAgent calculationAgent) {
        this.calculationAgent = calculationAgent;
        return this;
    }

    public SettlementTerms getCashSettlement() {
        return cashSettlement;
    }

    public OptionalEarlyTermination cashSettlement(SettlementTerms cashSettlement) {
        this.cashSettlement = cashSettlement;
        return this;
    }

    public List<ExerciseNotice> getExerciseNotice() {
        return exerciseNotice;
    }

    public OptionalEarlyTermination exerciseNotice(List<ExerciseNotice> exerciseNotice) {
        this.exerciseNotice = exerciseNotice;
        return this;
    }

    public ExerciseTerms getExerciseTerms() {
        return exerciseTerms;
    }

    public OptionalEarlyTermination exerciseTerms(ExerciseTerms exerciseTerms) {
        this.exerciseTerms = exerciseTerms;
        return this;
    }

    public Boolean getFollowUpConfirmation() {
        return followUpConfirmation;
    }

    public OptionalEarlyTermination followUpConfirmation(Boolean followUpConfirmation) {
        this.followUpConfirmation = followUpConfirmation;
        return this;
    }

    public Boolean getMutualEarlyTermination() {
        return mutualEarlyTermination;
    }

    public OptionalEarlyTermination mutualEarlyTermination(Boolean mutualEarlyTermination) {
        this.mutualEarlyTermination = mutualEarlyTermination;
        return this;
    }

    public OptionalEarlyTerminationAdjustedDates getOptionalEarlyTerminationAdjustedDates() {
        return optionalEarlyTerminationAdjustedDates;
    }

    public OptionalEarlyTermination optionalEarlyTerminationAdjustedDates(OptionalEarlyTerminationAdjustedDates optionalEarlyTerminationAdjustedDates) {
        this.optionalEarlyTerminationAdjustedDates = optionalEarlyTerminationAdjustedDates;
        return this;
    }

    public BuyerSeller getSinglePartyOption() {
        return singlePartyOption;
    }

    public OptionalEarlyTermination singlePartyOption(BuyerSeller singlePartyOption) {
        this.singlePartyOption = singlePartyOption;
        return this;
    }

}
