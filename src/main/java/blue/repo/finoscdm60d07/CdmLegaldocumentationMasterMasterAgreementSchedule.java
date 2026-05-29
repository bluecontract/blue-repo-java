package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("5iDz17uq73PCffKfJfpm38QBUmjLGChE6MFEKqVp4aPT")
public class CdmLegaldocumentationMasterMasterAgreementSchedule {
    public static String blueId() {
        return "5iDz17uq73PCffKfJfpm38QBUmjLGChE6MFEKqVp4aPT";
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
