package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("42HafMc5JejtsH6Y8Hrf6zeX7ZV2pvhCEvcQyv2zvCLu")
public class SecurityLendingInvoice {
    public static String blueId() {
        return "42HafMc5JejtsH6Y8Hrf6zeX7ZV2pvhCEvcQyv2zvCLu";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SecurityLendingInvoice";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SecurityLendingInvoice";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/SecurityLendingInvoice.json";
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

    private List<BillingRecord> billingRecord;

    private String billingStartDate;

    private List<BillingSummary> billingSummary;

    private Party receivingParty;

    private Party sendingParty;

    public String getNamespace() {
        return namespace;
    }

    public SecurityLendingInvoice namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getBillingEndDate() {
        return billingEndDate;
    }

    public SecurityLendingInvoice billingEndDate(String billingEndDate) {
        this.billingEndDate = billingEndDate;
        return this;
    }

    public List<BillingRecord> getBillingRecord() {
        return billingRecord;
    }

    public SecurityLendingInvoice billingRecord(List<BillingRecord> billingRecord) {
        this.billingRecord = billingRecord;
        return this;
    }

    public String getBillingStartDate() {
        return billingStartDate;
    }

    public SecurityLendingInvoice billingStartDate(String billingStartDate) {
        this.billingStartDate = billingStartDate;
        return this;
    }

    public List<BillingSummary> getBillingSummary() {
        return billingSummary;
    }

    public SecurityLendingInvoice billingSummary(List<BillingSummary> billingSummary) {
        this.billingSummary = billingSummary;
        return this;
    }

    public Party getReceivingParty() {
        return receivingParty;
    }

    public SecurityLendingInvoice receivingParty(Party receivingParty) {
        this.receivingParty = receivingParty;
        return this;
    }

    public Party getSendingParty() {
        return sendingParty;
    }

    public SecurityLendingInvoice sendingParty(Party sendingParty) {
        this.sendingParty = sendingParty;
        return this;
    }

}
