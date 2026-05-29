package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Aj9meS4QsbqRsCEnjHm6eJtvgmCipqQJfPFzGhJo8ujj")
public class CdmRegulationDerivInstrmAttrbts {
    public static String blueId() {
        return "Aj9meS4QsbqRsCEnjHm6eJtvgmCipqQJfPFzGhJo8ujj";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/regulation/DerivInstrmAttrbts";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/regulation/DerivInstrmAttrbts";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmregulationDerivInstrmAttrbts.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String dlvryTp;

    private String pricMltplr;

    private CdmRegulationUndrlygInstrm undrlygInstrm;

    private String xpryDt;

    public String getDlvryTp() {
        return dlvryTp;
    }

    public CdmRegulationDerivInstrmAttrbts dlvryTp(String dlvryTp) {
        this.dlvryTp = dlvryTp;
        return this;
    }

    public String getPricMltplr() {
        return pricMltplr;
    }

    public CdmRegulationDerivInstrmAttrbts pricMltplr(String pricMltplr) {
        this.pricMltplr = pricMltplr;
        return this;
    }

    public CdmRegulationUndrlygInstrm getUndrlygInstrm() {
        return undrlygInstrm;
    }

    public CdmRegulationDerivInstrmAttrbts undrlygInstrm(CdmRegulationUndrlygInstrm undrlygInstrm) {
        this.undrlygInstrm = undrlygInstrm;
        return this;
    }

    public String getXpryDt() {
        return xpryDt;
    }

    public CdmRegulationDerivInstrmAttrbts xpryDt(String xpryDt) {
        this.xpryDt = xpryDt;
        return this;
    }

}
