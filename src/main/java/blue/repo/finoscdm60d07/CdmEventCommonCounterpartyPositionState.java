package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("EEF9WbKw9D9wtisDhW8324FJ2E947ssWHTCgh83EtSwA")
public class CdmEventCommonCounterpartyPositionState {
    public static String blueId() {
        return "EEF9WbKw9D9wtisDhW8324FJ2E947ssWHTCgh83EtSwA";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/CounterpartyPositionState";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/CounterpartyPositionState";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonCounterpartyPositionState.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmEventPositionCounterpartyPosition counterpartyPosition;

    private List<CdmEventCommonObservationEvent> observationHistory;

    private CdmEventCommonState state;

    private List<CdmEventCommonValuation> valuationHistory;

    public CdmEventPositionCounterpartyPosition getCounterpartyPosition() {
        return counterpartyPosition;
    }

    public CdmEventCommonCounterpartyPositionState counterpartyPosition(CdmEventPositionCounterpartyPosition counterpartyPosition) {
        this.counterpartyPosition = counterpartyPosition;
        return this;
    }

    public List<CdmEventCommonObservationEvent> getObservationHistory() {
        return observationHistory;
    }

    public CdmEventCommonCounterpartyPositionState observationHistory(List<CdmEventCommonObservationEvent> observationHistory) {
        this.observationHistory = observationHistory;
        return this;
    }

    public CdmEventCommonState getState() {
        return state;
    }

    public CdmEventCommonCounterpartyPositionState state(CdmEventCommonState state) {
        this.state = state;
        return this;
    }

    public List<CdmEventCommonValuation> getValuationHistory() {
        return valuationHistory;
    }

    public CdmEventCommonCounterpartyPositionState valuationHistory(List<CdmEventCommonValuation> valuationHistory) {
        this.valuationHistory = valuationHistory;
        return this;
    }

}
