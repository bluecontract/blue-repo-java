package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8mSjnRHr78AivwxBB2cQJDm7okhUDSWhBw4Cc8daTEc4#0")
public class CdmEventCommonPrimitiveInstruction {
    public static String blueId() {
        return "8mSjnRHr78AivwxBB2cQJDm7okhUDSWhBw4Cc8daTEc4#0";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/PrimitiveInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/PrimitiveInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonPrimitiveInstruction.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmEventCommonContractFormationInstruction contractFormation;

    private CdmEventCommonExecutionInstruction execution;

    private CdmEventCommonExerciseInstruction exercise;

    private CdmEventCommonIndexTransitionInstruction indexTransition;

    private CdmEventCommonObservationInstruction observation;

    private CdmEventCommonPartyChangeInstruction partyChange;

    private CdmEventCommonQuantityChangeInstruction quantityChange;

    private CdmEventCommonResetInstruction reset;

    private CdmEventCommonSplitInstruction split;

    private CdmEventCommonStockSplitInstruction stockSplit;

    private CdmEventCommonTermsChangeInstruction termsChange;

    private CdmEventCommonTransferInstruction transfer;

    private CdmEventCommonValuationInstruction valuation;

    public CdmEventCommonContractFormationInstruction getContractFormation() {
        return contractFormation;
    }

    public CdmEventCommonPrimitiveInstruction contractFormation(CdmEventCommonContractFormationInstruction contractFormation) {
        this.contractFormation = contractFormation;
        return this;
    }

    public CdmEventCommonExecutionInstruction getExecution() {
        return execution;
    }

    public CdmEventCommonPrimitiveInstruction execution(CdmEventCommonExecutionInstruction execution) {
        this.execution = execution;
        return this;
    }

    public CdmEventCommonExerciseInstruction getExercise() {
        return exercise;
    }

    public CdmEventCommonPrimitiveInstruction exercise(CdmEventCommonExerciseInstruction exercise) {
        this.exercise = exercise;
        return this;
    }

    public CdmEventCommonIndexTransitionInstruction getIndexTransition() {
        return indexTransition;
    }

    public CdmEventCommonPrimitiveInstruction indexTransition(CdmEventCommonIndexTransitionInstruction indexTransition) {
        this.indexTransition = indexTransition;
        return this;
    }

    public CdmEventCommonObservationInstruction getObservation() {
        return observation;
    }

    public CdmEventCommonPrimitiveInstruction observation(CdmEventCommonObservationInstruction observation) {
        this.observation = observation;
        return this;
    }

    public CdmEventCommonPartyChangeInstruction getPartyChange() {
        return partyChange;
    }

    public CdmEventCommonPrimitiveInstruction partyChange(CdmEventCommonPartyChangeInstruction partyChange) {
        this.partyChange = partyChange;
        return this;
    }

    public CdmEventCommonQuantityChangeInstruction getQuantityChange() {
        return quantityChange;
    }

    public CdmEventCommonPrimitiveInstruction quantityChange(CdmEventCommonQuantityChangeInstruction quantityChange) {
        this.quantityChange = quantityChange;
        return this;
    }

    public CdmEventCommonResetInstruction getReset() {
        return reset;
    }

    public CdmEventCommonPrimitiveInstruction reset(CdmEventCommonResetInstruction reset) {
        this.reset = reset;
        return this;
    }

    public CdmEventCommonSplitInstruction getSplit() {
        return split;
    }

    public CdmEventCommonPrimitiveInstruction split(CdmEventCommonSplitInstruction split) {
        this.split = split;
        return this;
    }

    public CdmEventCommonStockSplitInstruction getStockSplit() {
        return stockSplit;
    }

    public CdmEventCommonPrimitiveInstruction stockSplit(CdmEventCommonStockSplitInstruction stockSplit) {
        this.stockSplit = stockSplit;
        return this;
    }

    public CdmEventCommonTermsChangeInstruction getTermsChange() {
        return termsChange;
    }

    public CdmEventCommonPrimitiveInstruction termsChange(CdmEventCommonTermsChangeInstruction termsChange) {
        this.termsChange = termsChange;
        return this;
    }

    public CdmEventCommonTransferInstruction getTransfer() {
        return transfer;
    }

    public CdmEventCommonPrimitiveInstruction transfer(CdmEventCommonTransferInstruction transfer) {
        this.transfer = transfer;
        return this;
    }

    public CdmEventCommonValuationInstruction getValuation() {
        return valuation;
    }

    public CdmEventCommonPrimitiveInstruction valuation(CdmEventCommonValuationInstruction valuation) {
        this.valuation = valuation;
        return this;
    }

}
