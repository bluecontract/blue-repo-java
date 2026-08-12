package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6zfsssMXw4XRMC7TGyBpZY1DAwmAtJ1wrvviano3dUQb#0")
public class CdmRegulationPric {
    public static String blueId() {
        return "6zfsssMXw4XRMC7TGyBpZY1DAwmAtJ1wrvviano3dUQb#0";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/regulation/Pric";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/regulation/Pric";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmregulationPric.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String bsisPts;

    private CdmRegulationPric pric;

    public String getBsisPts() {
        return bsisPts;
    }

    public CdmRegulationPric bsisPts(String bsisPts) {
        this.bsisPts = bsisPts;
        return this;
    }

    public CdmRegulationPric getPric() {
        return pric;
    }

    public CdmRegulationPric pric(CdmRegulationPric pric) {
        this.pric = pric;
        return this;
    }

}
