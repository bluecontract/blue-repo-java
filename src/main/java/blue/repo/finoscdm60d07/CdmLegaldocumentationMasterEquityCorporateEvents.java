package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8eyJdEjEPGbFnR2mLmiXtvsj5zsq51J2BKrRERr4rfQH")
public class CdmLegaldocumentationMasterEquityCorporateEvents {
    public static String blueId() {
        return "8eyJdEjEPGbFnR2mLmiXtvsj5zsq51J2BKrRERr4rfQH";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/master/EquityCorporateEvents";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/master/EquityCorporateEvents";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationmasterEquityCorporateEvents.json";
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
