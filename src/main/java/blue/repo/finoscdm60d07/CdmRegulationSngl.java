package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FnJcPZE1JzSf6GHctG62W7j7zgxGdrXiSzK4Q712xsqw")
public class CdmRegulationSngl {
    public static String blueId() {
        return "FnJcPZE1JzSf6GHctG62W7j7zgxGdrXiSzK4Q712xsqw";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/regulation/Sngl";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/regulation/Sngl";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmregulationSngl.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmRegulationIndx indx;

    private String isin;

    public CdmRegulationIndx getIndx() {
        return indx;
    }

    public CdmRegulationSngl indx(CdmRegulationIndx indx) {
        this.indx = indx;
        return this;
    }

    public String getIsin() {
        return isin;
    }

    public CdmRegulationSngl isin(String isin) {
        this.isin = isin;
        return this;
    }

}
