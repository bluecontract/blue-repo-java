package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("EoSx3rbaYgSkhc8hUQZMKv8YUyEbwhURwSeaTqWqdMUj")
public class CdmEventCommonTradeState {
    public static String blueId() {
        return "EoSx3rbaYgSkhc8hUQZMKv8YUyEbwhURwSeaTqWqdMUj";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/TradeState";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/TradeState";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonTradeState.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmEventCommonObservationEvent> observationHistory;

    private List<CdmEventCommonReset> resetHistory;

    private CdmEventCommonState state;

    private CdmEventCommonTrade trade;

    private List<CdmEventCommonTransferState> transferHistory;

    private List<CdmEventCommonValuation> valuationHistory;

    public List<CdmEventCommonObservationEvent> getObservationHistory() {
        return observationHistory;
    }

    public CdmEventCommonTradeState observationHistory(List<CdmEventCommonObservationEvent> observationHistory) {
        this.observationHistory = observationHistory;
        return this;
    }

    public List<CdmEventCommonReset> getResetHistory() {
        return resetHistory;
    }

    public CdmEventCommonTradeState resetHistory(List<CdmEventCommonReset> resetHistory) {
        this.resetHistory = resetHistory;
        return this;
    }

    public CdmEventCommonState getState() {
        return state;
    }

    public CdmEventCommonTradeState state(CdmEventCommonState state) {
        this.state = state;
        return this;
    }

    public CdmEventCommonTrade getTrade() {
        return trade;
    }

    public CdmEventCommonTradeState trade(CdmEventCommonTrade trade) {
        this.trade = trade;
        return this;
    }

    public List<CdmEventCommonTransferState> getTransferHistory() {
        return transferHistory;
    }

    public CdmEventCommonTradeState transferHistory(List<CdmEventCommonTransferState> transferHistory) {
        this.transferHistory = transferHistory;
        return this;
    }

    public List<CdmEventCommonValuation> getValuationHistory() {
        return valuationHistory;
    }

    public CdmEventCommonTradeState valuationHistory(List<CdmEventCommonValuation> valuationHistory) {
        this.valuationHistory = valuationHistory;
        return this;
    }

}
