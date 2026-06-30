package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6sHTanKcHB14wiXCFtoehJEB7HWsy21ExqHEvQYtw7NP")
public class CdmRegulationSchmeNm {
    public static String blueId() {
        return "6sHTanKcHB14wiXCFtoehJEB7HWsy21ExqHEvQYtw7NP";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/regulation/SchmeNm";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/regulation/SchmeNm";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmregulationSchmeNm.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String prtry;

    public String getPrtry() {
        return prtry;
    }

    public CdmRegulationSchmeNm prtry(String prtry) {
        this.prtry = prtry;
        return this;
    }

}
