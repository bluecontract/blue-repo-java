package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("ENFLSMRkvE9AvBTnEuLaUNaY2pqTgTWvtBVujNMBwwhs")
public class CdmLegaldocumentationMasterMasterAgreementSchedule {
    public static String blueId() {
        return "ENFLSMRkvE9AvBTnEuLaUNaY2pqTgTWvtBVujNMBwwhs";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/master/MasterAgreementSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/master/MasterAgreementSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationmasterMasterAgreementSchedule.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmLegaldocumentationMasterMasterAgreementClause> clause;

    public List<CdmLegaldocumentationMasterMasterAgreementClause> getClause() {
        return clause;
    }

    public CdmLegaldocumentationMasterMasterAgreementSchedule clause(List<CdmLegaldocumentationMasterMasterAgreementClause> clause) {
        this.clause = clause;
        return this;
    }

}
