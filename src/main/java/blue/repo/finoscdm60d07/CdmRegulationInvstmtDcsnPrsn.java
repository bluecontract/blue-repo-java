package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BazXu8fcC4SMrJz3j6VVr8B7Pj1RHtvuaFFJEGd3VMvv")
public class CdmRegulationInvstmtDcsnPrsn {
    public static String blueId() {
        return "BazXu8fcC4SMrJz3j6VVr8B7Pj1RHtvuaFFJEGd3VMvv";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/regulation/InvstmtDcsnPrsn";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/regulation/InvstmtDcsnPrsn";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmregulationInvstmtDcsnPrsn.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmRegulationPrsn prsn;

    public CdmRegulationPrsn getPrsn() {
        return prsn;
    }

    public CdmRegulationInvstmtDcsnPrsn prsn(CdmRegulationPrsn prsn) {
        this.prsn = prsn;
        return this;
    }

}
