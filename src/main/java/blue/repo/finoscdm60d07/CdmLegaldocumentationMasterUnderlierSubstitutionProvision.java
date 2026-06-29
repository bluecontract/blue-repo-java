package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("B7HxeT3Xft46tT5ze4mQnBq7hxyLkZUxSGkgRhMoPRuJ")
public class CdmLegaldocumentationMasterUnderlierSubstitutionProvision {
    public static String blueId() {
        return "B7HxeT3Xft46tT5ze4mQnBq7hxyLkZUxSGkgRhMoPRuJ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/master/UnderlierSubstitutionProvision";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/master/UnderlierSubstitutionProvision";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationmasterUnderlierSubstitutionProvision.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataPartyCounterpartyRoleEnum disputingParty;

    private List<CdmLegaldocumentationMasterClause> substitutionBeSpokeTerms;

    private List<CdmLegaldocumentationMasterExtraordinaryEvents> substitutionTriggerEvents;

    private List<CdmBaseStaticdataPartyCounterpartyRoleEnum> whoMaySubstitute;

    public CdmBaseStaticdataPartyCounterpartyRoleEnum getDisputingParty() {
        return disputingParty;
    }

    public CdmLegaldocumentationMasterUnderlierSubstitutionProvision disputingParty(CdmBaseStaticdataPartyCounterpartyRoleEnum disputingParty) {
        this.disputingParty = disputingParty;
        return this;
    }

    public List<CdmLegaldocumentationMasterClause> getSubstitutionBeSpokeTerms() {
        return substitutionBeSpokeTerms;
    }

    public CdmLegaldocumentationMasterUnderlierSubstitutionProvision substitutionBeSpokeTerms(List<CdmLegaldocumentationMasterClause> substitutionBeSpokeTerms) {
        this.substitutionBeSpokeTerms = substitutionBeSpokeTerms;
        return this;
    }

    public List<CdmLegaldocumentationMasterExtraordinaryEvents> getSubstitutionTriggerEvents() {
        return substitutionTriggerEvents;
    }

    public CdmLegaldocumentationMasterUnderlierSubstitutionProvision substitutionTriggerEvents(List<CdmLegaldocumentationMasterExtraordinaryEvents> substitutionTriggerEvents) {
        this.substitutionTriggerEvents = substitutionTriggerEvents;
        return this;
    }

    public List<CdmBaseStaticdataPartyCounterpartyRoleEnum> getWhoMaySubstitute() {
        return whoMaySubstitute;
    }

    public CdmLegaldocumentationMasterUnderlierSubstitutionProvision whoMaySubstitute(List<CdmBaseStaticdataPartyCounterpartyRoleEnum> whoMaySubstitute) {
        this.whoMaySubstitute = whoMaySubstitute;
        return this;
    }

}
