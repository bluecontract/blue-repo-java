package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BrLmHHpwLJKiUBoAYHd7jHdfr7Q3xmZDFBQgYGiTjJhR")
public class FinInstrmGnlAttrbts {
    public static String blueId() {
        return "BrLmHHpwLJKiUBoAYHd7jHdfr7Q3xmZDFBQgYGiTjJhR";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FinInstrmGnlAttrbts";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FinInstrmGnlAttrbts";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FinInstrmGnlAttrbts.json";
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

    private String clssfctnTp;

    private String fullNm;

    private String ntnlCcy;

    public String getNamespace() {
        return namespace;
    }

    public FinInstrmGnlAttrbts namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getClssfctnTp() {
        return clssfctnTp;
    }

    public FinInstrmGnlAttrbts clssfctnTp(String clssfctnTp) {
        this.clssfctnTp = clssfctnTp;
        return this;
    }

    public String getFullNm() {
        return fullNm;
    }

    public FinInstrmGnlAttrbts fullNm(String fullNm) {
        this.fullNm = fullNm;
        return this;
    }

    public String getNtnlCcy() {
        return ntnlCcy;
    }

    public FinInstrmGnlAttrbts ntnlCcy(String ntnlCcy) {
        this.ntnlCcy = ntnlCcy;
        return this;
    }

}
