package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("77WEPWzAsUD4nVk6xZ2W85JNLB6dpA2kRt8HCdsKpZD1")
public class CdmEventCommonSecurityLendingInvoice {
    public static String blueId() {
        return "77WEPWzAsUD4nVk6xZ2W85JNLB6dpA2kRt8HCdsKpZD1";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/SecurityLendingInvoice";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/SecurityLendingInvoice";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonSecurityLendingInvoice.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String billingEndDate;

    private List<CdmEventCommonBillingRecord> billingRecord;

    private String billingStartDate;

    private List<CdmEventCommonBillingSummary> billingSummary;

    private CdmBaseStaticdataPartyParty receivingParty;

    private CdmBaseStaticdataPartyParty sendingParty;

    public String getBillingEndDate() {
        return billingEndDate;
    }

    public CdmEventCommonSecurityLendingInvoice billingEndDate(String billingEndDate) {
        this.billingEndDate = billingEndDate;
        return this;
    }

    public List<CdmEventCommonBillingRecord> getBillingRecord() {
        return billingRecord;
    }

    public CdmEventCommonSecurityLendingInvoice billingRecord(List<CdmEventCommonBillingRecord> billingRecord) {
        this.billingRecord = billingRecord;
        return this;
    }

    public String getBillingStartDate() {
        return billingStartDate;
    }

    public CdmEventCommonSecurityLendingInvoice billingStartDate(String billingStartDate) {
        this.billingStartDate = billingStartDate;
        return this;
    }

    public List<CdmEventCommonBillingSummary> getBillingSummary() {
        return billingSummary;
    }

    public CdmEventCommonSecurityLendingInvoice billingSummary(List<CdmEventCommonBillingSummary> billingSummary) {
        this.billingSummary = billingSummary;
        return this;
    }

    public CdmBaseStaticdataPartyParty getReceivingParty() {
        return receivingParty;
    }

    public CdmEventCommonSecurityLendingInvoice receivingParty(CdmBaseStaticdataPartyParty receivingParty) {
        this.receivingParty = receivingParty;
        return this;
    }

    public CdmBaseStaticdataPartyParty getSendingParty() {
        return sendingParty;
    }

    public CdmEventCommonSecurityLendingInvoice sendingParty(CdmBaseStaticdataPartyParty sendingParty) {
        this.sendingParty = sendingParty;
        return this;
    }

}
