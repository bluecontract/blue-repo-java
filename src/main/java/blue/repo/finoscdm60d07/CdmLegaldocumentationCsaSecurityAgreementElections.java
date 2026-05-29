package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CnYXLeD1YSPzKRkCdgumsMyS2pGwY5z3KFHu8tmbu9oc")
public class CdmLegaldocumentationCsaSecurityAgreementElections {
    public static String blueId() {
        return "CnYXLeD1YSPzKRkCdgumsMyS2pGwY5z3KFHu8tmbu9oc";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/csa/SecurityAgreementElections";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/csa/SecurityAgreementElections";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationcsaSecurityAgreementElections.json";
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
