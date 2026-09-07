package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("4XUTjiqFSi4fNEQ5tZLdXgz4DM3WPHS1evKaJyqWZ7q3")
public class CdmLegaldocumentationMasterExtraordinaryEvents {
    public static String blueId() {
        return "4XUTjiqFSi4fNEQ5tZLdXgz4DM3WPHS1evKaJyqWZ7q3";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/master/ExtraordinaryEvents";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/master/ExtraordinaryEvents";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationmasterExtraordinaryEvents.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmLegaldocumentationMasterClause> additionalBespokeTerms;

    private CdmLegaldocumentationMasterAdditionalDisruptionEvents additionalDisruptionEvents;

    private Boolean compositionOfCombinedConsideration;

    private CdmLegaldocumentationMasterNationalizationOrInsolvencyOrDelistingEventEnum delisting;

    private Boolean failureToDeliver;

    private CdmLegaldocumentationMasterIndexAdjustmentEvents indexAdjustmentEvents;

    private CdmLegaldocumentationMasterEquityCorporateEvents mergerEvents;

    private CdmLegaldocumentationMasterNationalizationOrInsolvencyOrDelistingEventEnum nationalizationOrInsolvency;

    private CdmLegaldocumentationMasterRepresentations representations;

    private CdmLegaldocumentationMasterEquityCorporateEvents tenderOfferEvents;

    public List<CdmLegaldocumentationMasterClause> getAdditionalBespokeTerms() {
        return additionalBespokeTerms;
    }

    public CdmLegaldocumentationMasterExtraordinaryEvents additionalBespokeTerms(List<CdmLegaldocumentationMasterClause> additionalBespokeTerms) {
        this.additionalBespokeTerms = additionalBespokeTerms;
        return this;
    }

    public CdmLegaldocumentationMasterAdditionalDisruptionEvents getAdditionalDisruptionEvents() {
        return additionalDisruptionEvents;
    }

    public CdmLegaldocumentationMasterExtraordinaryEvents additionalDisruptionEvents(CdmLegaldocumentationMasterAdditionalDisruptionEvents additionalDisruptionEvents) {
        this.additionalDisruptionEvents = additionalDisruptionEvents;
        return this;
    }

    public Boolean getCompositionOfCombinedConsideration() {
        return compositionOfCombinedConsideration;
    }

    public CdmLegaldocumentationMasterExtraordinaryEvents compositionOfCombinedConsideration(Boolean compositionOfCombinedConsideration) {
        this.compositionOfCombinedConsideration = compositionOfCombinedConsideration;
        return this;
    }

    public CdmLegaldocumentationMasterNationalizationOrInsolvencyOrDelistingEventEnum getDelisting() {
        return delisting;
    }

    public CdmLegaldocumentationMasterExtraordinaryEvents delisting(CdmLegaldocumentationMasterNationalizationOrInsolvencyOrDelistingEventEnum delisting) {
        this.delisting = delisting;
        return this;
    }

    public Boolean getFailureToDeliver() {
        return failureToDeliver;
    }

    public CdmLegaldocumentationMasterExtraordinaryEvents failureToDeliver(Boolean failureToDeliver) {
        this.failureToDeliver = failureToDeliver;
        return this;
    }

    public CdmLegaldocumentationMasterIndexAdjustmentEvents getIndexAdjustmentEvents() {
        return indexAdjustmentEvents;
    }

    public CdmLegaldocumentationMasterExtraordinaryEvents indexAdjustmentEvents(CdmLegaldocumentationMasterIndexAdjustmentEvents indexAdjustmentEvents) {
        this.indexAdjustmentEvents = indexAdjustmentEvents;
        return this;
    }

    public CdmLegaldocumentationMasterEquityCorporateEvents getMergerEvents() {
        return mergerEvents;
    }

    public CdmLegaldocumentationMasterExtraordinaryEvents mergerEvents(CdmLegaldocumentationMasterEquityCorporateEvents mergerEvents) {
        this.mergerEvents = mergerEvents;
        return this;
    }

    public CdmLegaldocumentationMasterNationalizationOrInsolvencyOrDelistingEventEnum getNationalizationOrInsolvency() {
        return nationalizationOrInsolvency;
    }

    public CdmLegaldocumentationMasterExtraordinaryEvents nationalizationOrInsolvency(CdmLegaldocumentationMasterNationalizationOrInsolvencyOrDelistingEventEnum nationalizationOrInsolvency) {
        this.nationalizationOrInsolvency = nationalizationOrInsolvency;
        return this;
    }

    public CdmLegaldocumentationMasterRepresentations getRepresentations() {
        return representations;
    }

    public CdmLegaldocumentationMasterExtraordinaryEvents representations(CdmLegaldocumentationMasterRepresentations representations) {
        this.representations = representations;
        return this;
    }

    public CdmLegaldocumentationMasterEquityCorporateEvents getTenderOfferEvents() {
        return tenderOfferEvents;
    }

    public CdmLegaldocumentationMasterExtraordinaryEvents tenderOfferEvents(CdmLegaldocumentationMasterEquityCorporateEvents tenderOfferEvents) {
        this.tenderOfferEvents = tenderOfferEvents;
        return this;
    }

}
