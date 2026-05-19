package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("7F3sx4RFBLq8DjUov16KvW5d1aGsRiq7L2w94Y2aLdww")
public class ExtraordinaryEvents {
    public static String blueId() {
        return "7F3sx4RFBLq8DjUov16KvW5d1aGsRiq7L2w94Y2aLdww";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ExtraordinaryEvents";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ExtraordinaryEvents";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ExtraordinaryEvents.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    private List<Clause> additionalBespokeTerms;

    private AdditionalDisruptionEvents additionalDisruptionEvents;

    private Boolean compositionOfCombinedConsideration;

    private NationalizationOrInsolvencyOrDelistingEventEnum delisting;

    private Boolean failureToDeliver;

    private IndexAdjustmentEvents indexAdjustmentEvents;

    private EquityCorporateEvents mergerEvents;

    private NationalizationOrInsolvencyOrDelistingEventEnum nationalizationOrInsolvency;

    private Representations representations;

    private EquityCorporateEvents tenderOfferEvents;

    public String getNamespace() {
        return namespace;
    }

    public ExtraordinaryEvents namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<Clause> getAdditionalBespokeTerms() {
        return additionalBespokeTerms;
    }

    public ExtraordinaryEvents additionalBespokeTerms(List<Clause> additionalBespokeTerms) {
        this.additionalBespokeTerms = additionalBespokeTerms;
        return this;
    }

    public AdditionalDisruptionEvents getAdditionalDisruptionEvents() {
        return additionalDisruptionEvents;
    }

    public ExtraordinaryEvents additionalDisruptionEvents(AdditionalDisruptionEvents additionalDisruptionEvents) {
        this.additionalDisruptionEvents = additionalDisruptionEvents;
        return this;
    }

    public Boolean getCompositionOfCombinedConsideration() {
        return compositionOfCombinedConsideration;
    }

    public ExtraordinaryEvents compositionOfCombinedConsideration(Boolean compositionOfCombinedConsideration) {
        this.compositionOfCombinedConsideration = compositionOfCombinedConsideration;
        return this;
    }

    public NationalizationOrInsolvencyOrDelistingEventEnum getDelisting() {
        return delisting;
    }

    public ExtraordinaryEvents delisting(NationalizationOrInsolvencyOrDelistingEventEnum delisting) {
        this.delisting = delisting;
        return this;
    }

    public Boolean getFailureToDeliver() {
        return failureToDeliver;
    }

    public ExtraordinaryEvents failureToDeliver(Boolean failureToDeliver) {
        this.failureToDeliver = failureToDeliver;
        return this;
    }

    public IndexAdjustmentEvents getIndexAdjustmentEvents() {
        return indexAdjustmentEvents;
    }

    public ExtraordinaryEvents indexAdjustmentEvents(IndexAdjustmentEvents indexAdjustmentEvents) {
        this.indexAdjustmentEvents = indexAdjustmentEvents;
        return this;
    }

    public EquityCorporateEvents getMergerEvents() {
        return mergerEvents;
    }

    public ExtraordinaryEvents mergerEvents(EquityCorporateEvents mergerEvents) {
        this.mergerEvents = mergerEvents;
        return this;
    }

    public NationalizationOrInsolvencyOrDelistingEventEnum getNationalizationOrInsolvency() {
        return nationalizationOrInsolvency;
    }

    public ExtraordinaryEvents nationalizationOrInsolvency(NationalizationOrInsolvencyOrDelistingEventEnum nationalizationOrInsolvency) {
        this.nationalizationOrInsolvency = nationalizationOrInsolvency;
        return this;
    }

    public Representations getRepresentations() {
        return representations;
    }

    public ExtraordinaryEvents representations(Representations representations) {
        this.representations = representations;
        return this;
    }

    public EquityCorporateEvents getTenderOfferEvents() {
        return tenderOfferEvents;
    }

    public ExtraordinaryEvents tenderOfferEvents(EquityCorporateEvents tenderOfferEvents) {
        this.tenderOfferEvents = tenderOfferEvents;
        return this;
    }

}
