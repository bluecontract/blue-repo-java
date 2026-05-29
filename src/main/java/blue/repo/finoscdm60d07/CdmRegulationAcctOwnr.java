package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CXTPKZ5YReXQj11xMFirCdoxj9AYZWA5r8uNPxE15Shm")
public class CdmRegulationAcctOwnr {
    public static String blueId() {
        return "CXTPKZ5YReXQj11xMFirCdoxj9AYZWA5r8uNPxE15Shm";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/regulation/AcctOwnr";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/regulation/AcctOwnr";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmregulationAcctOwnr.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmRegulationId id;

    public CdmRegulationId getId() {
        return id;
    }

    public CdmRegulationAcctOwnr id(CdmRegulationId id) {
        this.id = id;
        return this;
    }

}
