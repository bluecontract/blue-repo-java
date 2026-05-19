package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("7GYrZXEaCFtu1Q3H25w7JU2M3TguaGAJUBnGceYZjwvb")
public class BillingRecordInstruction {
    public static String blueId() {
        return "7GYrZXEaCFtu1Q3H25w7JU2M3TguaGAJUBnGceYZjwvb";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "BillingRecordInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/BillingRecordInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/BillingRecordInstruction.json";
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

    private List<Observation> observation;

    private String recordEndDate;

    private String recordStartDate;

    private String settlementDate;

    private ReferenceWithMetaTradeState tradeState;

    public String getNamespace() {
        return namespace;
    }

    public BillingRecordInstruction namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<Observation> getObservation() {
        return observation;
    }

    public BillingRecordInstruction observation(List<Observation> observation) {
        this.observation = observation;
        return this;
    }

    public String getRecordEndDate() {
        return recordEndDate;
    }

    public BillingRecordInstruction recordEndDate(String recordEndDate) {
        this.recordEndDate = recordEndDate;
        return this;
    }

    public String getRecordStartDate() {
        return recordStartDate;
    }

    public BillingRecordInstruction recordStartDate(String recordStartDate) {
        this.recordStartDate = recordStartDate;
        return this;
    }

    public String getSettlementDate() {
        return settlementDate;
    }

    public BillingRecordInstruction settlementDate(String settlementDate) {
        this.settlementDate = settlementDate;
        return this;
    }

    public ReferenceWithMetaTradeState getTradeState() {
        return tradeState;
    }

    public BillingRecordInstruction tradeState(ReferenceWithMetaTradeState tradeState) {
        this.tradeState = tradeState;
        return this;
    }

}
