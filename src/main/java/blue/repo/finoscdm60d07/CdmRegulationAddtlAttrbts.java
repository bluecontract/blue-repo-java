package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6qmEG5FJ4nrH9k5cxhbxKt3J1QtRLfuLTNXs7oAK1cf7")
public class CdmRegulationAddtlAttrbts {
    public static String blueId() {
        return "6qmEG5FJ4nrH9k5cxhbxKt3J1QtRLfuLTNXs7oAK1cf7";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/regulation/AddtlAttrbts";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/regulation/AddtlAttrbts";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmregulationAddtlAttrbts.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String rskRdcgTx;

    private String sctiesFincgTxInd;

    public String getRskRdcgTx() {
        return rskRdcgTx;
    }

    public CdmRegulationAddtlAttrbts rskRdcgTx(String rskRdcgTx) {
        this.rskRdcgTx = rskRdcgTx;
        return this;
    }

    public String getSctiesFincgTxInd() {
        return sctiesFincgTxInd;
    }

    public CdmRegulationAddtlAttrbts sctiesFincgTxInd(String sctiesFincgTxInd) {
        this.sctiesFincgTxInd = sctiesFincgTxInd;
        return this;
    }

}
