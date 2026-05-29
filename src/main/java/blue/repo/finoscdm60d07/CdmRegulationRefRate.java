package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FZ7WxoPfFpozcg79A3iH1T6VcWY77nwvVRrc12XRhoHr")
public class CdmRegulationRefRate {
    public static String blueId() {
        return "FZ7WxoPfFpozcg79A3iH1T6VcWY77nwvVRrc12XRhoHr";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/regulation/RefRate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/regulation/RefRate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmregulationRefRate.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String indx;

    private String nm;

    public String getIndx() {
        return indx;
    }

    public CdmRegulationRefRate indx(String indx) {
        this.indx = indx;
        return this;
    }

    public String getNm() {
        return nm;
    }

    public CdmRegulationRefRate nm(String nm) {
        this.nm = nm;
        return this;
    }

}
