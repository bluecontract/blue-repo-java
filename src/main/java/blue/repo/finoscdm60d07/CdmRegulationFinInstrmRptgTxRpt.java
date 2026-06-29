package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FGw3uzcfaLXE48TDaEuANFJZ3XL3kJ8QvApSUhqzHsXo")
public class CdmRegulationFinInstrmRptgTxRpt {
    public static String blueId() {
        return "FGw3uzcfaLXE48TDaEuANFJZ3XL3kJ8QvApSUhqzHsXo";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/regulation/FinInstrmRptgTxRpt";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/regulation/FinInstrmRptgTxRpt";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmregulationFinInstrmRptgTxRpt.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmRegulationTx tx;

    public CdmRegulationTx getTx() {
        return tx;
    }

    public CdmRegulationFinInstrmRptgTxRpt tx(CdmRegulationTx tx) {
        this.tx = tx;
        return this;
    }

}
