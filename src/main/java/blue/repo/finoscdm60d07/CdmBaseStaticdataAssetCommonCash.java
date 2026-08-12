package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("Fp8kieXrgB8GUChsCNFFLB9bbPSRfh2sua3aPiz8Zp5u")
public class CdmBaseStaticdataAssetCommonCash {
    public static String blueId() {
        return "Fp8kieXrgB8GUChsCNFFLB9bbPSRfh2sua3aPiz8Zp5u";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/Cash";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/Cash";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonCash.json";
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

    public CdmBaseStaticdataAssetCommonCash exchange(CdmBaseStaticdataPartyLegalEntity exchange) {
        this.exchange = exchange;
        return this;
    }

    public List<CdmBaseStaticdataAssetCommonAssetIdentifier> getIdentifier() {
        return identifier;
    }

    public CdmBaseStaticdataAssetCommonCash identifier(List<CdmBaseStaticdataAssetCommonAssetIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public Boolean getIsExchangeListed() {
        return isExchangeListed;
    }

    public CdmBaseStaticdataAssetCommonCash isExchangeListed(Boolean isExchangeListed) {
        this.isExchangeListed = isExchangeListed;
        return this;
    }

    public List<CdmBaseStaticdataPartyLegalEntity> getRelatedExchange() {
        return relatedExchange;
    }

    public CdmBaseStaticdataAssetCommonCash relatedExchange(List<CdmBaseStaticdataPartyLegalEntity> relatedExchange) {
        this.relatedExchange = relatedExchange;
        return this;
    }

    public List<CdmBaseStaticdataAssetCommonTaxonomy> getTaxonomy() {
        return taxonomy;
    }

    public CdmBaseStaticdataAssetCommonCash taxonomy(List<CdmBaseStaticdataAssetCommonTaxonomy> taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

}
