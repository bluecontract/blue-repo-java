package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AFqCxRJfD2r6VuMtdAaQUzB1354VrRcR3KdvEnUz8US6")
public class CdmLegaldocumentationCsaCreditSupportAgreementElections {
    public static String blueId() {
        return "AFqCxRJfD2r6VuMtdAaQUzB1354VrRcR3KdvEnUz8US6";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/csa/CreditSupportAgreementElections";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/csa/CreditSupportAgreementElections";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationcsaCreditSupportAgreementElections.json";
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
