package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("D7s7KyjUZgzoVri92g5VTAqQ7s9x2n41ujN4aN59vHpb")
public class CounterpartyPositionState {
    public static String blueId() {
        return "D7s7KyjUZgzoVri92g5VTAqQ7s9x2n41ujN4aN59vHpb";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CounterpartyPositionState";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CounterpartyPositionState";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CounterpartyPositionState.json";
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

    private CounterpartyPosition counterpartyPosition;

    private List<ObservationEvent> observationHistory;

    private State state;

    private List<Valuation> valuationHistory;

    public String getNamespace() {
        return namespace;
    }

    public CounterpartyPositionState namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CounterpartyPosition getCounterpartyPosition() {
        return counterpartyPosition;
    }

    public CounterpartyPositionState counterpartyPosition(CounterpartyPosition counterpartyPosition) {
        this.counterpartyPosition = counterpartyPosition;
        return this;
    }

    public List<ObservationEvent> getObservationHistory() {
        return observationHistory;
    }

    public CounterpartyPositionState observationHistory(List<ObservationEvent> observationHistory) {
        this.observationHistory = observationHistory;
        return this;
    }

    public State getState() {
        return state;
    }

    public CounterpartyPositionState state(State state) {
        this.state = state;
        return this;
    }

    public List<Valuation> getValuationHistory() {
        return valuationHistory;
    }

    public CounterpartyPositionState valuationHistory(List<Valuation> valuationHistory) {
        this.valuationHistory = valuationHistory;
        return this;
    }

}
