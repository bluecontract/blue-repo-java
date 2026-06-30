package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7nPHq44WkgzcmatogSGoahnTBmfbTfRpaG1YBa7e8RcQ#1")
public class CdmRegulationTx {
    public static String blueId() {
        return "7nPHq44WkgzcmatogSGoahnTBmfbTfRpaG1YBa7e8RcQ#1";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/regulation/Tx";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/regulation/Tx";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmregulationTx.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String ctryOfBrnch;

    private CdmRegulationNew newTx;

    private CdmRegulationPric pric;

    private CdmRegulationQty qty;

    private String tradDt;

    private String tradgCpcty;

    private String tradVn;

    public String getCtryOfBrnch() {
        return ctryOfBrnch;
    }

    public CdmRegulationTx ctryOfBrnch(String ctryOfBrnch) {
        this.ctryOfBrnch = ctryOfBrnch;
        return this;
    }

    public CdmRegulationNew getNewTx() {
        return newTx;
    }

    public CdmRegulationTx newTx(CdmRegulationNew newTx) {
        this.newTx = newTx;
        return this;
    }

    public CdmRegulationPric getPric() {
        return pric;
    }

    public CdmRegulationTx pric(CdmRegulationPric pric) {
        this.pric = pric;
        return this;
    }

    public CdmRegulationQty getQty() {
        return qty;
    }

    public CdmRegulationTx qty(CdmRegulationQty qty) {
        this.qty = qty;
        return this;
    }

    public String getTradDt() {
        return tradDt;
    }

    public CdmRegulationTx tradDt(String tradDt) {
        this.tradDt = tradDt;
        return this;
    }

    public String getTradgCpcty() {
        return tradgCpcty;
    }

    public CdmRegulationTx tradgCpcty(String tradgCpcty) {
        this.tradgCpcty = tradgCpcty;
        return this;
    }

    public String getTradVn() {
        return tradVn;
    }

    public CdmRegulationTx tradVn(String tradVn) {
        this.tradVn = tradVn;
        return this;
    }

}
