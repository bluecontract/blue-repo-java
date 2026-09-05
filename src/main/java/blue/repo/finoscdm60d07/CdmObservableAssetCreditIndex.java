package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;
import java.util.List;

@TypeBlueId("6ydaRacSzYMSL7cUE57Kp6GxJdVNHcMkkjqcgnfBwXtz")
public class CdmObservableAssetCreditIndex {
    public static String blueId() {
        return "6ydaRacSzYMSL7cUE57Kp6GxJdVNHcMkkjqcgnfBwXtz";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/CreditIndex";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/CreditIndex";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetCreditIndex.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataAssetCommonAssetClassEnum assetClass;

    private CdmBaseStaticdataPartyLegalEntity exchange;

    private List<CdmProductAssetReferenceInformation> excludedReferenceEntity;

    private List<CdmBaseStaticdataAssetCommonAssetIdentifier> identifier;

    private String indexAnnexDate;

    private CdmProductAssetFieldWithMetaIndexAnnexSourceEnum indexAnnexSource;

    private BigInteger indexAnnexVersion;

    private Double indexFactor;

    private BigInteger indexSeries;

    private Boolean isExchangeListed;

    private CdmBaseStaticdataPartyLegalEntity provider;

    private List<CdmBaseStaticdataPartyLegalEntity> relatedExchange;

    private CdmProductAssetCreditSeniorityEnum seniority;

    private CdmProductAssetSettledEntityMatrix settledEntityMatrix;

    private List<CdmBaseStaticdataAssetCommonTaxonomy> taxonomy;

    private CdmProductAssetTranche tranche;

    public CdmBaseStaticdataAssetCommonAssetClassEnum getAssetClass() {
        return assetClass;
    }

    public CdmObservableAssetCreditIndex assetClass(CdmBaseStaticdataAssetCommonAssetClassEnum assetClass) {
        this.assetClass = assetClass;
        return this;
    }

    public CdmBaseStaticdataPartyLegalEntity getExchange() {
        return exchange;
    }

    public CdmObservableAssetCreditIndex exchange(CdmBaseStaticdataPartyLegalEntity exchange) {
        this.exchange = exchange;
        return this;
    }

    public List<CdmProductAssetReferenceInformation> getExcludedReferenceEntity() {
        return excludedReferenceEntity;
    }

    public CdmObservableAssetCreditIndex excludedReferenceEntity(List<CdmProductAssetReferenceInformation> excludedReferenceEntity) {
        this.excludedReferenceEntity = excludedReferenceEntity;
        return this;
    }

    public List<CdmBaseStaticdataAssetCommonAssetIdentifier> getIdentifier() {
        return identifier;
    }

    public CdmObservableAssetCreditIndex identifier(List<CdmBaseStaticdataAssetCommonAssetIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public String getIndexAnnexDate() {
        return indexAnnexDate;
    }

    public CdmObservableAssetCreditIndex indexAnnexDate(String indexAnnexDate) {
        this.indexAnnexDate = indexAnnexDate;
        return this;
    }

    public CdmProductAssetFieldWithMetaIndexAnnexSourceEnum getIndexAnnexSource() {
        return indexAnnexSource;
    }

    public CdmObservableAssetCreditIndex indexAnnexSource(CdmProductAssetFieldWithMetaIndexAnnexSourceEnum indexAnnexSource) {
        this.indexAnnexSource = indexAnnexSource;
        return this;
    }

    public BigInteger getIndexAnnexVersion() {
        return indexAnnexVersion;
    }

    public CdmObservableAssetCreditIndex indexAnnexVersion(BigInteger indexAnnexVersion) {
        this.indexAnnexVersion = indexAnnexVersion;
        return this;
    }

    public Double getIndexFactor() {
        return indexFactor;
    }

    public CdmObservableAssetCreditIndex indexFactor(Double indexFactor) {
        this.indexFactor = indexFactor;
        return this;
    }

    public BigInteger getIndexSeries() {
        return indexSeries;
    }

    public CdmObservableAssetCreditIndex indexSeries(BigInteger indexSeries) {
        this.indexSeries = indexSeries;
        return this;
    }

    public Boolean getIsExchangeListed() {
        return isExchangeListed;
    }

    public CdmObservableAssetCreditIndex isExchangeListed(Boolean isExchangeListed) {
        this.isExchangeListed = isExchangeListed;
        return this;
    }

    public CdmBaseStaticdataPartyLegalEntity getProvider() {
        return provider;
    }

    public CdmObservableAssetCreditIndex provider(CdmBaseStaticdataPartyLegalEntity provider) {
        this.provider = provider;
        return this;
    }

    public List<CdmBaseStaticdataPartyLegalEntity> getRelatedExchange() {
        return relatedExchange;
    }

    public CdmObservableAssetCreditIndex relatedExchange(List<CdmBaseStaticdataPartyLegalEntity> relatedExchange) {
        this.relatedExchange = relatedExchange;
        return this;
    }

    public CdmProductAssetCreditSeniorityEnum getSeniority() {
        return seniority;
    }

    public CdmObservableAssetCreditIndex seniority(CdmProductAssetCreditSeniorityEnum seniority) {
        this.seniority = seniority;
        return this;
    }

    public CdmProductAssetSettledEntityMatrix getSettledEntityMatrix() {
        return settledEntityMatrix;
    }

    public CdmObservableAssetCreditIndex settledEntityMatrix(CdmProductAssetSettledEntityMatrix settledEntityMatrix) {
        this.settledEntityMatrix = settledEntityMatrix;
        return this;
    }

    public List<CdmBaseStaticdataAssetCommonTaxonomy> getTaxonomy() {
        return taxonomy;
    }

    public CdmObservableAssetCreditIndex taxonomy(List<CdmBaseStaticdataAssetCommonTaxonomy> taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

    public CdmProductAssetTranche getTranche() {
        return tranche;
    }

    public CdmObservableAssetCreditIndex tranche(CdmProductAssetTranche tranche) {
        this.tranche = tranche;
        return this;
    }

}
