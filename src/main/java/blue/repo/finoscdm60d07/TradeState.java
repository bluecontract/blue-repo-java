package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("7BTvuUWTK6nkSBA6NVanSCrKNjD3hXMvK12EdvuaoeXH")
public class TradeState {
    public static String blueId() {
        return "7BTvuUWTK6nkSBA6NVanSCrKNjD3hXMvK12EdvuaoeXH";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "TradeState";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/TradeState";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/TradeState.json";
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

    private List<ObservationEvent> observationHistory;

    private List<Reset> resetHistory;

    private State state;

    private Trade trade;

    private List<TransferState> transferHistory;

    private List<Valuation> valuationHistory;

    public String getNamespace() {
        return namespace;
    }

    public TradeState namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<ObservationEvent> getObservationHistory() {
        return observationHistory;
    }

    public TradeState observationHistory(List<ObservationEvent> observationHistory) {
        this.observationHistory = observationHistory;
        return this;
    }

    public List<Reset> getResetHistory() {
        return resetHistory;
    }

    public TradeState resetHistory(List<Reset> resetHistory) {
        this.resetHistory = resetHistory;
        return this;
    }

    public State getState() {
        return state;
    }

    public TradeState state(State state) {
        this.state = state;
        return this;
    }

    public Trade getTrade() {
        return trade;
    }

    public TradeState trade(Trade trade) {
        this.trade = trade;
        return this;
    }

    public List<TransferState> getTransferHistory() {
        return transferHistory;
    }

    public TradeState transferHistory(List<TransferState> transferHistory) {
        this.transferHistory = transferHistory;
        return this;
    }

    public List<Valuation> getValuationHistory() {
        return valuationHistory;
    }

    public TradeState valuationHistory(List<Valuation> valuationHistory) {
        this.valuationHistory = valuationHistory;
        return this;
    }

}
