package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("B5XUcBNe5FkFmU33VGqjgsLyReeFsmprVWp1tZ4aeeNE#2")
public class PrimitiveInstruction {
    public static String blueId() {
        return "B5XUcBNe5FkFmU33VGqjgsLyReeFsmprVWp1tZ4aeeNE#2";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PrimitiveInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PrimitiveInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PrimitiveInstruction.json";
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

    private ContractFormationInstruction contractFormation;

    private ExecutionInstruction execution;

    private ExerciseInstruction exercise;

    private IndexTransitionInstruction indexTransition;

    private ObservationInstruction observation;

    private PartyChangeInstruction partyChange;

    private QuantityChangeInstruction quantityChange;

    private ResetInstruction reset;

    private SplitInstruction split;

    private StockSplitInstruction stockSplit;

    private TermsChangeInstruction termsChange;

    private TransferInstruction transfer;

    private ValuationInstruction valuation;

    public String getNamespace() {
        return namespace;
    }

    public PrimitiveInstruction namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ContractFormationInstruction getContractFormation() {
        return contractFormation;
    }

    public PrimitiveInstruction contractFormation(ContractFormationInstruction contractFormation) {
        this.contractFormation = contractFormation;
        return this;
    }

    public ExecutionInstruction getExecution() {
        return execution;
    }

    public PrimitiveInstruction execution(ExecutionInstruction execution) {
        this.execution = execution;
        return this;
    }

    public ExerciseInstruction getExercise() {
        return exercise;
    }

    public PrimitiveInstruction exercise(ExerciseInstruction exercise) {
        this.exercise = exercise;
        return this;
    }

    public IndexTransitionInstruction getIndexTransition() {
        return indexTransition;
    }

    public PrimitiveInstruction indexTransition(IndexTransitionInstruction indexTransition) {
        this.indexTransition = indexTransition;
        return this;
    }

    public ObservationInstruction getObservation() {
        return observation;
    }

    public PrimitiveInstruction observation(ObservationInstruction observation) {
        this.observation = observation;
        return this;
    }

    public PartyChangeInstruction getPartyChange() {
        return partyChange;
    }

    public PrimitiveInstruction partyChange(PartyChangeInstruction partyChange) {
        this.partyChange = partyChange;
        return this;
    }

    public QuantityChangeInstruction getQuantityChange() {
        return quantityChange;
    }

    public PrimitiveInstruction quantityChange(QuantityChangeInstruction quantityChange) {
        this.quantityChange = quantityChange;
        return this;
    }

    public ResetInstruction getReset() {
        return reset;
    }

    public PrimitiveInstruction reset(ResetInstruction reset) {
        this.reset = reset;
        return this;
    }

    public SplitInstruction getSplit() {
        return split;
    }

    public PrimitiveInstruction split(SplitInstruction split) {
        this.split = split;
        return this;
    }

    public StockSplitInstruction getStockSplit() {
        return stockSplit;
    }

    public PrimitiveInstruction stockSplit(StockSplitInstruction stockSplit) {
        this.stockSplit = stockSplit;
        return this;
    }

    public TermsChangeInstruction getTermsChange() {
        return termsChange;
    }

    public PrimitiveInstruction termsChange(TermsChangeInstruction termsChange) {
        this.termsChange = termsChange;
        return this;
    }

    public TransferInstruction getTransfer() {
        return transfer;
    }

    public PrimitiveInstruction transfer(TransferInstruction transfer) {
        this.transfer = transfer;
        return this;
    }

    public ValuationInstruction getValuation() {
        return valuation;
    }

    public PrimitiveInstruction valuation(ValuationInstruction valuation) {
        this.valuation = valuation;
        return this;
    }

}
