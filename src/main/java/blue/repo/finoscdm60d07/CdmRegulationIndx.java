package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3cxXB1W8Tthon8HA1Z9R5ra12AfuQQPN6GfbdVTTjhvc")
public class CdmRegulationIndx {
    public static String blueId() {
        return "3cxXB1W8Tthon8HA1Z9R5ra12AfuQQPN6GfbdVTTjhvc";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/regulation/Indx";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/regulation/Indx";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmregulationIndx.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmRegulationNm nm;

    public CdmRegulationNm getNm() {
        return nm;
    }

    public CdmRegulationIndx nm(CdmRegulationNm nm) {
        this.nm = nm;
        return this;
    }

}
