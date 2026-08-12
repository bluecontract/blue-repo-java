package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Fnt8FzF2E5APRTsK2Q6mZ95GFMfmF486RSAXuoCtU9Nh")
public class CdmRegulationDocument {
    public static String blueId() {
        return "Fnt8FzF2E5APRTsK2Q6mZ95GFMfmF486RSAXuoCtU9Nh";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/regulation/Document";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/regulation/Document";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmregulationDocument.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmRegulationFinInstrmRptgTxRpt finInstrmRptgTxRpt;

    public CdmRegulationFinInstrmRptgTxRpt getFinInstrmRptgTxRpt() {
        return finInstrmRptgTxRpt;
    }

    public CdmRegulationDocument finInstrmRptgTxRpt(CdmRegulationFinInstrmRptgTxRpt finInstrmRptgTxRpt) {
        this.finInstrmRptgTxRpt = finInstrmRptgTxRpt;
        return this;
    }

}
