package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("BCbPVsdBp2zQYjWjFyti4R9rC7Q5cweqG9Pkio1fBMNj")
public class CdmEventCommonBillingInstruction {
    public static String blueId() {
        return "BCbPVsdBp2zQYjWjFyti4R9rC7Q5cweqG9Pkio1fBMNj";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/BillingInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/BillingInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonBillingInstruction.json";
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

    private List<CdmEventCommonBillingRecordInstruction> billingRecordInstruction;

    private String billingStartDate;

    private List<CdmEventCommonBillingSummaryInstruction> billingSummary;

    private CdmBaseStaticdataPartyParty receivingParty;

    private CdmBaseStaticdataPartyParty sendingParty;

    public String getBillingEndDate() {
        return billingEndDate;
    }

    public CdmEventCommonBillingInstruction billingEndDate(String billingEndDate) {
        this.billingEndDate = billingEndDate;
        return this;
    }

    public List<CdmEventCommonBillingRecordInstruction> getBillingRecordInstruction() {
        return billingRecordInstruction;
    }

    public CdmEventCommonBillingInstruction billingRecordInstruction(List<CdmEventCommonBillingRecordInstruction> billingRecordInstruction) {
        this.billingRecordInstruction = billingRecordInstruction;
        return this;
    }

    public String getBillingStartDate() {
        return billingStartDate;
    }

    public CdmEventCommonBillingInstruction billingStartDate(String billingStartDate) {
        this.billingStartDate = billingStartDate;
        return this;
    }

    public List<CdmEventCommonBillingSummaryInstruction> getBillingSummary() {
        return billingSummary;
    }

    public CdmEventCommonBillingInstruction billingSummary(List<CdmEventCommonBillingSummaryInstruction> billingSummary) {
        this.billingSummary = billingSummary;
        return this;
    }

    public CdmBaseStaticdataPartyParty getReceivingParty() {
        return receivingParty;
    }

    public CdmEventCommonBillingInstruction receivingParty(CdmBaseStaticdataPartyParty receivingParty) {
        this.receivingParty = receivingParty;
        return this;
    }

    public CdmBaseStaticdataPartyParty getSendingParty() {
        return sendingParty;
    }

    public CdmEventCommonBillingInstruction sendingParty(CdmBaseStaticdataPartyParty sendingParty) {
        this.sendingParty = sendingParty;
        return this;
    }

}
