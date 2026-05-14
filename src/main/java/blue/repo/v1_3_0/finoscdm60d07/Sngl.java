package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HbCTfoe2oDdLuhS49TU49VETcRqZxcss6gUcMMVy1Cck")
public class Sngl {
    public static String blueId() {
        return "HbCTfoe2oDdLuhS49TU49VETcRqZxcss6gUcMMVy1Cck";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Sngl";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Sngl";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Sngl.json";
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

    private Indx indx;

    private String isin;

    public String getNamespace() {
        return namespace;
    }

    public Sngl namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Indx getIndx() {
        return indx;
    }

    public Sngl indx(Indx indx) {
        this.indx = indx;
        return this;
    }

    public String getIsin() {
        return isin;
    }

    public Sngl isin(String isin) {
        this.isin = isin;
        return this;
    }

}
