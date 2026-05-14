package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4rATPcsaQf2dBua6becmuUTRiSDoUK7poxAdLorSpZXw")
public class DerivInstrmAttrbts {
    public static String blueId() {
        return "4rATPcsaQf2dBua6becmuUTRiSDoUK7poxAdLorSpZXw";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DerivInstrmAttrbts";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DerivInstrmAttrbts";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/DerivInstrmAttrbts.json";
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

    private String dlvryTp;

    private String pricMltplr;

    private UndrlygInstrm undrlygInstrm;

    private String xpryDt;

    public String getNamespace() {
        return namespace;
    }

    public DerivInstrmAttrbts namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getDlvryTp() {
        return dlvryTp;
    }

    public DerivInstrmAttrbts dlvryTp(String dlvryTp) {
        this.dlvryTp = dlvryTp;
        return this;
    }

    public String getPricMltplr() {
        return pricMltplr;
    }

    public DerivInstrmAttrbts pricMltplr(String pricMltplr) {
        this.pricMltplr = pricMltplr;
        return this;
    }

    public UndrlygInstrm getUndrlygInstrm() {
        return undrlygInstrm;
    }

    public DerivInstrmAttrbts undrlygInstrm(UndrlygInstrm undrlygInstrm) {
        this.undrlygInstrm = undrlygInstrm;
        return this;
    }

    public String getXpryDt() {
        return xpryDt;
    }

    public DerivInstrmAttrbts xpryDt(String xpryDt) {
        this.xpryDt = xpryDt;
        return this;
    }

}
