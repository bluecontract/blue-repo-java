package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3CXCcYihBkBDi9xYFpidZMYXBwaYSVnC84wn37cNPVZm")
public class FinInstrmRptgTxRpt {
    public static String blueId() {
        return "3CXCcYihBkBDi9xYFpidZMYXBwaYSVnC84wn37cNPVZm";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FinInstrmRptgTxRpt";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FinInstrmRptgTxRpt";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FinInstrmRptgTxRpt.json";
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

    private Tx tx;

    public String getNamespace() {
        return namespace;
    }

    public FinInstrmRptgTxRpt namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Tx getTx() {
        return tx;
    }

    public FinInstrmRptgTxRpt tx(Tx tx) {
        this.tx = tx;
        return this;
    }

}
