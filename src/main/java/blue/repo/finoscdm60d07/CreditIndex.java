package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;
import java.util.List;

@TypeBlueId("4F6mUpV2LpFdnNaBRbB73cCAp6WBhyHEVpdsFLJY5osc")
public class CreditIndex {
    public static String blueId() {
        return "4F6mUpV2LpFdnNaBRbB73cCAp6WBhyHEVpdsFLJY5osc";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CreditIndex";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CreditIndex";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CreditIndex.json";
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

    private AssetClassEnum assetClass;

    private LegalEntity exchange;

    private List<ReferenceInformation> excludedReferenceEntity;

    private List<AssetIdentifier> identifier;

    private String indexAnnexDate;

    private FieldWithMetaIndexAnnexSourceEnum indexAnnexSource;

    private BigInteger indexAnnexVersion;

    private Double indexFactor;

    private BigInteger indexSeries;

    private Boolean isExchangeListed;

    private LegalEntity provider;

    private List<LegalEntity> relatedExchange;

    private CreditSeniorityEnum seniority;

    private SettledEntityMatrix settledEntityMatrix;

    private List<Taxonomy> taxonomy;

    private Tranche tranche;

    public String getNamespace() {
        return namespace;
    }

    public CreditIndex namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AssetClassEnum getAssetClass() {
        return assetClass;
    }

    public CreditIndex assetClass(AssetClassEnum assetClass) {
        this.assetClass = assetClass;
        return this;
    }

    public LegalEntity getExchange() {
        return exchange;
    }

    public CreditIndex exchange(LegalEntity exchange) {
        this.exchange = exchange;
        return this;
    }

    public List<ReferenceInformation> getExcludedReferenceEntity() {
        return excludedReferenceEntity;
    }

    public CreditIndex excludedReferenceEntity(List<ReferenceInformation> excludedReferenceEntity) {
        this.excludedReferenceEntity = excludedReferenceEntity;
        return this;
    }

    public List<AssetIdentifier> getIdentifier() {
        return identifier;
    }

    public CreditIndex identifier(List<AssetIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public String getIndexAnnexDate() {
        return indexAnnexDate;
    }

    public CreditIndex indexAnnexDate(String indexAnnexDate) {
        this.indexAnnexDate = indexAnnexDate;
        return this;
    }

    public FieldWithMetaIndexAnnexSourceEnum getIndexAnnexSource() {
        return indexAnnexSource;
    }

    public CreditIndex indexAnnexSource(FieldWithMetaIndexAnnexSourceEnum indexAnnexSource) {
        this.indexAnnexSource = indexAnnexSource;
        return this;
    }

    public BigInteger getIndexAnnexVersion() {
        return indexAnnexVersion;
    }

    public CreditIndex indexAnnexVersion(BigInteger indexAnnexVersion) {
        this.indexAnnexVersion = indexAnnexVersion;
        return this;
    }

    public Double getIndexFactor() {
        return indexFactor;
    }

    public CreditIndex indexFactor(Double indexFactor) {
        this.indexFactor = indexFactor;
        return this;
    }

    public BigInteger getIndexSeries() {
        return indexSeries;
    }

    public CreditIndex indexSeries(BigInteger indexSeries) {
        this.indexSeries = indexSeries;
        return this;
    }

    public Boolean getIsExchangeListed() {
        return isExchangeListed;
    }

    public CreditIndex isExchangeListed(Boolean isExchangeListed) {
        this.isExchangeListed = isExchangeListed;
        return this;
    }

    public LegalEntity getProvider() {
        return provider;
    }

    public CreditIndex provider(LegalEntity provider) {
        this.provider = provider;
        return this;
    }

    public List<LegalEntity> getRelatedExchange() {
        return relatedExchange;
    }

    public CreditIndex relatedExchange(List<LegalEntity> relatedExchange) {
        this.relatedExchange = relatedExchange;
        return this;
    }

    public CreditSeniorityEnum getSeniority() {
        return seniority;
    }

    public CreditIndex seniority(CreditSeniorityEnum seniority) {
        this.seniority = seniority;
        return this;
    }

    public SettledEntityMatrix getSettledEntityMatrix() {
        return settledEntityMatrix;
    }

    public CreditIndex settledEntityMatrix(SettledEntityMatrix settledEntityMatrix) {
        this.settledEntityMatrix = settledEntityMatrix;
        return this;
    }

    public List<Taxonomy> getTaxonomy() {
        return taxonomy;
    }

    public CreditIndex taxonomy(List<Taxonomy> taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

    public Tranche getTranche() {
        return tranche;
    }

    public CreditIndex tranche(Tranche tranche) {
        this.tranche = tranche;
        return this;
    }

}
