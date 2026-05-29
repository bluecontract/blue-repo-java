package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("CLeDSCc12UYPpfL16b4NzJo2e8CGvk9vpwjP12enqnyy")
public class CdmBaseStaticdataAssetCommonDigitalAsset {
    public static String blueId() {
        return "CLeDSCc12UYPpfL16b4NzJo2e8CGvk9vpwjP12enqnyy";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/DigitalAsset";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/DigitalAsset";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonDigitalAsset.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataPartyLegalEntity exchange;

    private List<CdmBaseStaticdataAssetCommonAssetIdentifier> identifier;

    private Boolean isExchangeListed;

    private List<CdmBaseStaticdataPartyLegalEntity> relatedExchange;

    private List<CdmBaseStaticdataAssetCommonTaxonomy> taxonomy;

    public CdmBaseStaticdataPartyLegalEntity getExchange() {
        return exchange;
    }

    public CdmBaseStaticdataAssetCommonDigitalAsset exchange(CdmBaseStaticdataPartyLegalEntity exchange) {
        this.exchange = exchange;
        return this;
    }

    public List<CdmBaseStaticdataAssetCommonAssetIdentifier> getIdentifier() {
        return identifier;
    }

    public CdmBaseStaticdataAssetCommonDigitalAsset identifier(List<CdmBaseStaticdataAssetCommonAssetIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public Boolean getIsExchangeListed() {
        return isExchangeListed;
    }

    public CdmBaseStaticdataAssetCommonDigitalAsset isExchangeListed(Boolean isExchangeListed) {
        this.isExchangeListed = isExchangeListed;
        return this;
    }

    public List<CdmBaseStaticdataPartyLegalEntity> getRelatedExchange() {
        return relatedExchange;
    }

    public CdmBaseStaticdataAssetCommonDigitalAsset relatedExchange(List<CdmBaseStaticdataPartyLegalEntity> relatedExchange) {
        this.relatedExchange = relatedExchange;
        return this;
    }

    public List<CdmBaseStaticdataAssetCommonTaxonomy> getTaxonomy() {
        return taxonomy;
    }

    public CdmBaseStaticdataAssetCommonDigitalAsset taxonomy(List<CdmBaseStaticdataAssetCommonTaxonomy> taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

}
