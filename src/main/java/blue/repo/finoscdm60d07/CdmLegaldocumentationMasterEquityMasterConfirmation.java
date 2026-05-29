package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("G7QNTAF4CHNyrEV1HRJJHQXd5KMBRK1ddd4XLSJSKVWe")
public class CdmLegaldocumentationMasterEquityMasterConfirmation {
    public static String blueId() {
        return "G7QNTAF4CHNyrEV1HRJJHQXd5KMBRK1ddd4XLSJSKVWe";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/master/EquityMasterConfirmation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/master/EquityMasterConfirmation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationmasterEquityMasterConfirmation.json";
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
