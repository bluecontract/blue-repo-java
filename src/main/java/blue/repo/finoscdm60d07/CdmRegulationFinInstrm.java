package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("JCRd3L6QAeLwgrfv7kRuGENGPRuufeLKZyiMQuazeMvu")
public class CdmRegulationFinInstrm {
    public static String blueId() {
        return "JCRd3L6QAeLwgrfv7kRuGENGPRuufeLKZyiMQuazeMvu";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/regulation/FinInstrm";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/regulation/FinInstrm";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmregulationFinInstrm.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmRegulationOthr othr;

    public CdmRegulationOthr getOthr() {
        return othr;
    }

    public CdmRegulationFinInstrm othr(CdmRegulationOthr othr) {
        this.othr = othr;
        return this;
    }

}
