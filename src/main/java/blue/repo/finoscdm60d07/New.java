package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("ACHiMELtpZ82sQd7tmuHAJhAVf4dMonnebRdoZYjeKRe#0")
public class New {
    public static String blueId() {
        return "ACHiMELtpZ82sQd7tmuHAJhAVf4dMonnebRdoZYjeKRe#0";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "New";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/New";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/New.json";
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

    private AddtlAttrbts addtlAttrbts;

    private Buyr buyr;

    private ExctgPrsn exctgPrsn;

    private String exctgPty;

    private FinInstrm finInstrm;

    private InvstmtDcsnPrsn invstmtDcsnPrsn;

    private String invstmtPtyInd;

    private OrdrTrnsmssn ordrTrnsmssn;

    private Sellr sellr;

    private String submitgPty;

    private Tx tx;

    private String txId;

    public String getNamespace() {
        return namespace;
    }

    public New namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AddtlAttrbts getAddtlAttrbts() {
        return addtlAttrbts;
    }

    public New addtlAttrbts(AddtlAttrbts addtlAttrbts) {
        this.addtlAttrbts = addtlAttrbts;
        return this;
    }

    public Buyr getBuyr() {
        return buyr;
    }

    public New buyr(Buyr buyr) {
        this.buyr = buyr;
        return this;
    }

    public ExctgPrsn getExctgPrsn() {
        return exctgPrsn;
    }

    public New exctgPrsn(ExctgPrsn exctgPrsn) {
        this.exctgPrsn = exctgPrsn;
        return this;
    }

    public String getExctgPty() {
        return exctgPty;
    }

    public New exctgPty(String exctgPty) {
        this.exctgPty = exctgPty;
        return this;
    }

    public FinInstrm getFinInstrm() {
        return finInstrm;
    }

    public New finInstrm(FinInstrm finInstrm) {
        this.finInstrm = finInstrm;
        return this;
    }

    public InvstmtDcsnPrsn getInvstmtDcsnPrsn() {
        return invstmtDcsnPrsn;
    }

    public New invstmtDcsnPrsn(InvstmtDcsnPrsn invstmtDcsnPrsn) {
        this.invstmtDcsnPrsn = invstmtDcsnPrsn;
        return this;
    }

    public String getInvstmtPtyInd() {
        return invstmtPtyInd;
    }

    public New invstmtPtyInd(String invstmtPtyInd) {
        this.invstmtPtyInd = invstmtPtyInd;
        return this;
    }

    public OrdrTrnsmssn getOrdrTrnsmssn() {
        return ordrTrnsmssn;
    }

    public New ordrTrnsmssn(OrdrTrnsmssn ordrTrnsmssn) {
        this.ordrTrnsmssn = ordrTrnsmssn;
        return this;
    }

    public Sellr getSellr() {
        return sellr;
    }

    public New sellr(Sellr sellr) {
        this.sellr = sellr;
        return this;
    }

    public String getSubmitgPty() {
        return submitgPty;
    }

    public New submitgPty(String submitgPty) {
        this.submitgPty = submitgPty;
        return this;
    }

    public Tx getTx() {
        return tx;
    }

    public New tx(Tx tx) {
        this.tx = tx;
        return this;
    }

    public String getTxId() {
        return txId;
    }

    public New txId(String txId) {
        this.txId = txId;
        return this;
    }

}
