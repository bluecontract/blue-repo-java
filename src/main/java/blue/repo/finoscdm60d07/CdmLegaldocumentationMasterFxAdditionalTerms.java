package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BLcaRJ2SjxR7oB14E6Suf1722kgvEQ8vdXcTuTM6SxNg")
public class CdmLegaldocumentationMasterFxAdditionalTerms {
    public static String blueId() {
        return "BLcaRJ2SjxR7oB14E6Suf1722kgvEQ8vdXcTuTM6SxNg";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/master/FxAdditionalTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/master/FxAdditionalTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationmasterFxAdditionalTerms.json";
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
