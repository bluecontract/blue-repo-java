package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("95T825bQFLe9KC4B7yuQzPWcdNpg4muWrPiQjsK914F3")
public class CdmLegaldocumentationMasterEquityAdditionalTerms {
    public static String blueId() {
        return "95T825bQFLe9KC4B7yuQzPWcdNpg4muWrPiQjsK914F3";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/master/EquityAdditionalTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/master/EquityAdditionalTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationmasterEquityAdditionalTerms.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmLegaldocumentationMasterDeterminationRolesAndTerms> determinationTerms;

    private CdmLegaldocumentationMasterExtraordinaryEvents extraordinaryEvents;

    private CdmLegaldocumentationMasterUnderlierSubstitutionProvision substitutionProvision;

    public List<CdmLegaldocumentationMasterDeterminationRolesAndTerms> getDeterminationTerms() {
        return determinationTerms;
    }

    public CdmLegaldocumentationMasterEquityAdditionalTerms determinationTerms(List<CdmLegaldocumentationMasterDeterminationRolesAndTerms> determinationTerms) {
        this.determinationTerms = determinationTerms;
        return this;
    }

    public CdmLegaldocumentationMasterExtraordinaryEvents getExtraordinaryEvents() {
        return extraordinaryEvents;
    }

    public CdmLegaldocumentationMasterEquityAdditionalTerms extraordinaryEvents(CdmLegaldocumentationMasterExtraordinaryEvents extraordinaryEvents) {
        this.extraordinaryEvents = extraordinaryEvents;
        return this;
    }

    public CdmLegaldocumentationMasterUnderlierSubstitutionProvision getSubstitutionProvision() {
        return substitutionProvision;
    }

    public CdmLegaldocumentationMasterEquityAdditionalTerms substitutionProvision(CdmLegaldocumentationMasterUnderlierSubstitutionProvision substitutionProvision) {
        this.substitutionProvision = substitutionProvision;
        return this;
    }

}
