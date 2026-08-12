package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("6BEYjg3hgMPAoG6R5b4noEX1cgoYGnB5hP5TyUvAea9c")
public class CdmEventCommonBillingRecordInstruction {
    public static String blueId() {
        return "6BEYjg3hgMPAoG6R5b4noEX1cgoYGnB5hP5TyUvAea9c";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/BillingRecordInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/BillingRecordInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonBillingRecordInstruction.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmObservableEventObservation> observation;

    private String recordEndDate;

    private String recordStartDate;

    private String settlementDate;

    private CdmEventCommonMetafieldsReferenceWithMetaTradeState tradeState;

    public List<CdmObservableEventObservation> getObservation() {
        return observation;
    }

    public CdmEventCommonBillingRecordInstruction observation(List<CdmObservableEventObservation> observation) {
        this.observation = observation;
        return this;
    }

    public String getRecordEndDate() {
        return recordEndDate;
    }

    public CdmEventCommonBillingRecordInstruction recordEndDate(String recordEndDate) {
        this.recordEndDate = recordEndDate;
        return this;
    }

    public String getRecordStartDate() {
        return recordStartDate;
    }

    public CdmEventCommonBillingRecordInstruction recordStartDate(String recordStartDate) {
        this.recordStartDate = recordStartDate;
        return this;
    }

    public String getSettlementDate() {
        return settlementDate;
    }

    public CdmEventCommonBillingRecordInstruction settlementDate(String settlementDate) {
        this.settlementDate = settlementDate;
        return this;
    }

    public CdmEventCommonMetafieldsReferenceWithMetaTradeState getTradeState() {
        return tradeState;
    }

    public CdmEventCommonBillingRecordInstruction tradeState(CdmEventCommonMetafieldsReferenceWithMetaTradeState tradeState) {
        this.tradeState = tradeState;
        return this;
    }

}
