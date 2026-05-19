package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("H4AnpupsEFrFyjuH5qbuoF338v3PJBbL6uYjiQAmX12K")
public class AddtlAttrbts {
    public static String blueId() {
        return "H4AnpupsEFrFyjuH5qbuoF338v3PJBbL6uYjiQAmX12K";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AddtlAttrbts";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AddtlAttrbts";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/AddtlAttrbts.json";
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

    private String rskRdcgTx;

    private String sctiesFincgTxInd;

    public String getNamespace() {
        return namespace;
    }

    public AddtlAttrbts namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getRskRdcgTx() {
        return rskRdcgTx;
    }

    public AddtlAttrbts rskRdcgTx(String rskRdcgTx) {
        this.rskRdcgTx = rskRdcgTx;
        return this;
    }

    public String getSctiesFincgTxInd() {
        return sctiesFincgTxInd;
    }

    public AddtlAttrbts sctiesFincgTxInd(String sctiesFincgTxInd) {
        this.sctiesFincgTxInd = sctiesFincgTxInd;
        return this;
    }

}
