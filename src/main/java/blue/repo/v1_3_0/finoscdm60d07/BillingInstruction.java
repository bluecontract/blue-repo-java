package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("695D3CdnDewp7gVeHu6SxFJL3SwdTSYhEeXt4kAWqr1o")
public class BillingInstruction {
    public static String blueId() {
        return "695D3CdnDewp7gVeHu6SxFJL3SwdTSYhEeXt4kAWqr1o";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "BillingInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/BillingInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/BillingInstruction.json";
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

    private String billingEndDate;

    private List<BillingRecordInstruction> billingRecordInstruction;

    private String billingStartDate;

    private List<BillingSummaryInstruction> billingSummary;

    private Party receivingParty;

    private Party sendingParty;

    public String getNamespace() {
        return namespace;
    }

    public BillingInstruction namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getBillingEndDate() {
        return billingEndDate;
    }

    public BillingInstruction billingEndDate(String billingEndDate) {
        this.billingEndDate = billingEndDate;
        return this;
    }

    public List<BillingRecordInstruction> getBillingRecordInstruction() {
        return billingRecordInstruction;
    }

    public BillingInstruction billingRecordInstruction(List<BillingRecordInstruction> billingRecordInstruction) {
        this.billingRecordInstruction = billingRecordInstruction;
        return this;
    }

    public String getBillingStartDate() {
        return billingStartDate;
    }

    public BillingInstruction billingStartDate(String billingStartDate) {
        this.billingStartDate = billingStartDate;
        return this;
    }

    public List<BillingSummaryInstruction> getBillingSummary() {
        return billingSummary;
    }

    public BillingInstruction billingSummary(List<BillingSummaryInstruction> billingSummary) {
        this.billingSummary = billingSummary;
        return this;
    }

    public Party getReceivingParty() {
        return receivingParty;
    }

    public BillingInstruction receivingParty(Party receivingParty) {
        this.receivingParty = receivingParty;
        return this;
    }

    public Party getSendingParty() {
        return sendingParty;
    }

    public BillingInstruction sendingParty(Party sendingParty) {
        this.sendingParty = sendingParty;
        return this;
    }

}
