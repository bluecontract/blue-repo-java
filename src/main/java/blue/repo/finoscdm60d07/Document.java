package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HoyrJudpk6EYpV6R7JuYGNcisJNXVxwNb679aHvjCHFR")
public class Document {
    public static String blueId() {
        return "HoyrJudpk6EYpV6R7JuYGNcisJNXVxwNb679aHvjCHFR";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Document";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Document";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Document.json";
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

    private FinInstrmRptgTxRpt finInstrmRptgTxRpt;

    public String getNamespace() {
        return namespace;
    }

    public Document namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FinInstrmRptgTxRpt getFinInstrmRptgTxRpt() {
        return finInstrmRptgTxRpt;
    }

    public Document finInstrmRptgTxRpt(FinInstrmRptgTxRpt finInstrmRptgTxRpt) {
        this.finInstrmRptgTxRpt = finInstrmRptgTxRpt;
        return this;
    }

}
