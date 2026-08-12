package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GCmS7M1BiCMbhWc3uBALbXAaaTnvFYyrjHWM8vVR3Y8K#0")
public class CdmRegulationNew {
    public static String blueId() {
        return "GCmS7M1BiCMbhWc3uBALbXAaaTnvFYyrjHWM8vVR3Y8K#0";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/regulation/New";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/regulation/New";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmregulationNew.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmRegulationAddtlAttrbts addtlAttrbts;

    private CdmRegulationBuyr buyr;

    private CdmRegulationExctgPrsn exctgPrsn;

    private String exctgPty;

    private CdmRegulationFinInstrm finInstrm;

    private CdmRegulationInvstmtDcsnPrsn invstmtDcsnPrsn;

    private String invstmtPtyInd;

    private CdmRegulationOrdrTrnsmssn ordrTrnsmssn;

    private CdmRegulationSellr sellr;

    private String submitgPty;

    private CdmRegulationTx tx;

    private String txId;

    public CdmRegulationAddtlAttrbts getAddtlAttrbts() {
        return addtlAttrbts;
    }

    public CdmRegulationNew addtlAttrbts(CdmRegulationAddtlAttrbts addtlAttrbts) {
        this.addtlAttrbts = addtlAttrbts;
        return this;
    }

    public CdmRegulationBuyr getBuyr() {
        return buyr;
    }

    public CdmRegulationNew buyr(CdmRegulationBuyr buyr) {
        this.buyr = buyr;
        return this;
    }

    public CdmRegulationExctgPrsn getExctgPrsn() {
        return exctgPrsn;
    }

    public CdmRegulationNew exctgPrsn(CdmRegulationExctgPrsn exctgPrsn) {
        this.exctgPrsn = exctgPrsn;
        return this;
    }

    public String getExctgPty() {
        return exctgPty;
    }

    public CdmRegulationNew exctgPty(String exctgPty) {
        this.exctgPty = exctgPty;
        return this;
    }

    public CdmRegulationFinInstrm getFinInstrm() {
        return finInstrm;
    }

    public CdmRegulationNew finInstrm(CdmRegulationFinInstrm finInstrm) {
        this.finInstrm = finInstrm;
        return this;
    }

    public CdmRegulationInvstmtDcsnPrsn getInvstmtDcsnPrsn() {
        return invstmtDcsnPrsn;
    }

    public CdmRegulationNew invstmtDcsnPrsn(CdmRegulationInvstmtDcsnPrsn invstmtDcsnPrsn) {
        this.invstmtDcsnPrsn = invstmtDcsnPrsn;
        return this;
    }

    public String getInvstmtPtyInd() {
        return invstmtPtyInd;
    }

    public CdmRegulationNew invstmtPtyInd(String invstmtPtyInd) {
        this.invstmtPtyInd = invstmtPtyInd;
        return this;
    }

    public CdmRegulationOrdrTrnsmssn getOrdrTrnsmssn() {
        return ordrTrnsmssn;
    }

    public CdmRegulationNew ordrTrnsmssn(CdmRegulationOrdrTrnsmssn ordrTrnsmssn) {
        this.ordrTrnsmssn = ordrTrnsmssn;
        return this;
    }

    public CdmRegulationSellr getSellr() {
        return sellr;
    }

    public CdmRegulationNew sellr(CdmRegulationSellr sellr) {
        this.sellr = sellr;
        return this;
    }

    public String getSubmitgPty() {
        return submitgPty;
    }

    public CdmRegulationNew submitgPty(String submitgPty) {
        this.submitgPty = submitgPty;
        return this;
    }

    public CdmRegulationTx getTx() {
        return tx;
    }

    public CdmRegulationNew tx(CdmRegulationTx tx) {
        this.tx = tx;
        return this;
    }

    public String getTxId() {
        return txId;
    }

    public CdmRegulationNew txId(String txId) {
        this.txId = txId;
        return this;
    }

}
