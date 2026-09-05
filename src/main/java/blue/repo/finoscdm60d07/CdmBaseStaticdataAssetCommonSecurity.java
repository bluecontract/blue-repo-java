package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("Da1DX2cF83ZptSYG8SJcGu3xdxSQJT4XCNbE5GfCkC5L")
public class CdmBaseStaticdataAssetCommonSecurity {
    public static String blueId() {
        return "Da1DX2cF83ZptSYG8SJcGu3xdxSQJT4XCNbE5GfCkC5L";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/Security";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/Security";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonSecurity.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataAssetCommonDebtType debtType;

    private CdmBaseStaticdataAssetCommonEquityTypeEnum equityType;

    private CdmBaseStaticdataPartyLegalEntity exchange;

    private CdmBaseStaticdataAssetCommonFundProductTypeEnum fundType;

    private List<CdmBaseStaticdataAssetCommonAssetIdentifier> identifier;

    private CdmBaseStaticdataAssetCommonInstrumentTypeEnum instrumentType;

    private Boolean isExchangeListed;

    private List<CdmBaseStaticdataPartyLegalEntity> relatedExchange;

    private List<CdmBaseStaticdataAssetCommonTaxonomy> taxonomy;

    public CdmBaseStaticdataAssetCommonDebtType getDebtType() {
        return debtType;
    }

    public CdmBaseStaticdataAssetCommonSecurity debtType(CdmBaseStaticdataAssetCommonDebtType debtType) {
        this.debtType = debtType;
        return this;
    }

    public CdmBaseStaticdataAssetCommonEquityTypeEnum getEquityType() {
        return equityType;
    }

    public CdmBaseStaticdataAssetCommonSecurity equityType(CdmBaseStaticdataAssetCommonEquityTypeEnum equityType) {
        this.equityType = equityType;
        return this;
    }

    public CdmBaseStaticdataPartyLegalEntity getExchange() {
        return exchange;
    }

    public CdmBaseStaticdataAssetCommonSecurity exchange(CdmBaseStaticdataPartyLegalEntity exchange) {
        this.exchange = exchange;
        return this;
    }

    public CdmBaseStaticdataAssetCommonFundProductTypeEnum getFundType() {
        return fundType;
    }

    public CdmBaseStaticdataAssetCommonSecurity fundType(CdmBaseStaticdataAssetCommonFundProductTypeEnum fundType) {
        this.fundType = fundType;
        return this;
    }

    public List<CdmBaseStaticdataAssetCommonAssetIdentifier> getIdentifier() {
        return identifier;
    }

    public CdmBaseStaticdataAssetCommonSecurity identifier(List<CdmBaseStaticdataAssetCommonAssetIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public CdmBaseStaticdataAssetCommonInstrumentTypeEnum getInstrumentType() {
        return instrumentType;
    }

    public CdmBaseStaticdataAssetCommonSecurity instrumentType(CdmBaseStaticdataAssetCommonInstrumentTypeEnum instrumentType) {
        this.instrumentType = instrumentType;
        return this;
    }

    public Boolean getIsExchangeListed() {
        return isExchangeListed;
    }

    public CdmBaseStaticdataAssetCommonSecurity isExchangeListed(Boolean isExchangeListed) {
        this.isExchangeListed = isExchangeListed;
        return this;
    }

    public List<CdmBaseStaticdataPartyLegalEntity> getRelatedExchange() {
        return relatedExchange;
    }

    public CdmBaseStaticdataAssetCommonSecurity relatedExchange(List<CdmBaseStaticdataPartyLegalEntity> relatedExchange) {
        this.relatedExchange = relatedExchange;
        return this;
    }

    public List<CdmBaseStaticdataAssetCommonTaxonomy> getTaxonomy() {
        return taxonomy;
    }

    public CdmBaseStaticdataAssetCommonSecurity taxonomy(List<CdmBaseStaticdataAssetCommonTaxonomy> taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

}
