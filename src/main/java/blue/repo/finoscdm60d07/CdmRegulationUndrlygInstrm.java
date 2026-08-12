package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("RGUPkLhQETHkMrFxMrruEoSnWtn6AdyUJivR8cJGtxF")
public class CdmRegulationUndrlygInstrm {
    public static String blueId() {
        return "RGUPkLhQETHkMrFxMrruEoSnWtn6AdyUJivR8cJGtxF";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/regulation/UndrlygInstrm";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/regulation/UndrlygInstrm";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmregulationUndrlygInstrm.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmRegulationSwp swp;

    public CdmRegulationSwp getSwp() {
        return swp;
    }

    public CdmRegulationUndrlygInstrm swp(CdmRegulationSwp swp) {
        this.swp = swp;
        return this;
    }

}
