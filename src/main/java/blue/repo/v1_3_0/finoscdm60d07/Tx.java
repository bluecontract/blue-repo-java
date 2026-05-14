package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("ACHiMELtpZ82sQd7tmuHAJhAVf4dMonnebRdoZYjeKRe#1")
public class Tx {
    public static String blueId() {
        return "ACHiMELtpZ82sQd7tmuHAJhAVf4dMonnebRdoZYjeKRe#1";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Tx";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Tx";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Tx.json";
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

    private String ctryOfBrnch;

    private New newTx;

    private Pric pric;

    private Qty qty;

    private String tradDt;

    private String tradgCpcty;

    private String tradVn;

    public String getNamespace() {
        return namespace;
    }

    public Tx namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getCtryOfBrnch() {
        return ctryOfBrnch;
    }

    public Tx ctryOfBrnch(String ctryOfBrnch) {
        this.ctryOfBrnch = ctryOfBrnch;
        return this;
    }

    public New getNewTx() {
        return newTx;
    }

    public Tx newTx(New newTx) {
        this.newTx = newTx;
        return this;
    }

    public Pric getPric() {
        return pric;
    }

    public Tx pric(Pric pric) {
        this.pric = pric;
        return this;
    }

    public Qty getQty() {
        return qty;
    }

    public Tx qty(Qty qty) {
        this.qty = qty;
        return this;
    }

    public String getTradDt() {
        return tradDt;
    }

    public Tx tradDt(String tradDt) {
        this.tradDt = tradDt;
        return this;
    }

    public String getTradgCpcty() {
        return tradgCpcty;
    }

    public Tx tradgCpcty(String tradgCpcty) {
        this.tradgCpcty = tradgCpcty;
        return this;
    }

    public String getTradVn() {
        return tradVn;
    }

    public Tx tradVn(String tradVn) {
        this.tradVn = tradVn;
        return this;
    }

}
