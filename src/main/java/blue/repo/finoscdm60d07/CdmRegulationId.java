package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2r6PTV1nLw5QiudaGiKjZifJS6pf1AcgcybsBB63pHB9")
public class CdmRegulationId {
    public static String blueId() {
        return "2r6PTV1nLw5QiudaGiKjZifJS6pf1AcgcybsBB63pHB9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/regulation/Id";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/regulation/Id";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmregulationId.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String lei;

    public String getLei() {
        return lei;
    }

    public CdmRegulationId lei(String lei) {
        this.lei = lei;
        return this;
    }

}
