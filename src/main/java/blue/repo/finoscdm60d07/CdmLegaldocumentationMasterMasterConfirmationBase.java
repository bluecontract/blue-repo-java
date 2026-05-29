package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6DgaHaSzK3ETUNrcEqTZUXkvS2nrBSrCTCJBLAqDEPsy")
public class CdmLegaldocumentationMasterMasterConfirmationBase {
    public static String blueId() {
        return "6DgaHaSzK3ETUNrcEqTZUXkvS2nrBSrCTCJBLAqDEPsy";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/master/MasterConfirmationBase";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/master/MasterConfirmationBase";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationmasterMasterConfirmationBase.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

}
