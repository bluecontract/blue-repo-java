package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AuEqLfXGEuA8dqjpzgYg2qBWzyk5tApxNBQ2BvQpx6RF")
public class BillingRecord {
    public static String blueId() {
        return "AuEqLfXGEuA8dqjpzgYg2qBWzyk5tApxNBQ2BvQpx6RF";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "BillingRecord";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/BillingRecord";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/BillingRecord.json";
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

    private Money minimumFee;

    private String recordEndDate;

    private String recordStartDate;

    private Transfer recordTransfer;

    private ReferenceWithMetaTradeState tradeState;

    public String getNamespace() {
        return namespace;
    }

    public BillingRecord namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Money getMinimumFee() {
        return minimumFee;
    }

    public BillingRecord minimumFee(Money minimumFee) {
        this.minimumFee = minimumFee;
        return this;
    }

    public String getRecordEndDate() {
        return recordEndDate;
    }

    public BillingRecord recordEndDate(String recordEndDate) {
        this.recordEndDate = recordEndDate;
        return this;
    }

    public String getRecordStartDate() {
        return recordStartDate;
    }

    public BillingRecord recordStartDate(String recordStartDate) {
        this.recordStartDate = recordStartDate;
        return this;
    }

    public Transfer getRecordTransfer() {
        return recordTransfer;
    }

    public BillingRecord recordTransfer(Transfer recordTransfer) {
        this.recordTransfer = recordTransfer;
        return this;
    }

    public ReferenceWithMetaTradeState getTradeState() {
        return tradeState;
    }

    public BillingRecord tradeState(ReferenceWithMetaTradeState tradeState) {
        this.tradeState = tradeState;
        return this;
    }

}
