package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("FZGW5MPBEPZ64p4U496EY2RYBF4Uakn53ra1DQcXdtDu")
public class CdmBaseStaticdataAssetCommonListedDerivative {
    public static String blueId() {
        return "FZGW5MPBEPZ64p4U496EY2RYBF4Uakn53ra1DQcXdtDu";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/ListedDerivative";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/ListedDerivative";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonListedDerivative.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String deliveryTerm;

    private CdmBaseStaticdataPartyLegalEntity exchange;

    private List<CdmBaseStaticdataAssetCommonAssetIdentifier> identifier;

    private CdmBaseStaticdataAssetCommonInstrumentTypeEnum instrumentType;

    private Boolean isExchangeListed;

    private CdmBaseStaticdataAssetCommonPutCallEnum optionType;

    private List<CdmBaseStaticdataPartyLegalEntity> relatedExchange;

    private Double strike;

    private List<CdmBaseStaticdataAssetCommonTaxonomy> taxonomy;

    public String getDeliveryTerm() {
        return deliveryTerm;
    }

    public CdmBaseStaticdataAssetCommonListedDerivative deliveryTerm(String deliveryTerm) {
        this.deliveryTerm = deliveryTerm;
        return this;
    }

    public CdmBaseStaticdataPartyLegalEntity getExchange() {
        return exchange;
    }

    public CdmBaseStaticdataAssetCommonListedDerivative exchange(CdmBaseStaticdataPartyLegalEntity exchange) {
        this.exchange = exchange;
        return this;
    }

    public List<CdmBaseStaticdataAssetCommonAssetIdentifier> getIdentifier() {
        return identifier;
    }

    public CdmBaseStaticdataAssetCommonListedDerivative identifier(List<CdmBaseStaticdataAssetCommonAssetIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public CdmBaseStaticdataAssetCommonInstrumentTypeEnum getInstrumentType() {
        return instrumentType;
    }

    public CdmBaseStaticdataAssetCommonListedDerivative instrumentType(CdmBaseStaticdataAssetCommonInstrumentTypeEnum instrumentType) {
        this.instrumentType = instrumentType;
        return this;
    }

    public Boolean getIsExchangeListed() {
        return isExchangeListed;
    }

    public CdmBaseStaticdataAssetCommonListedDerivative isExchangeListed(Boolean isExchangeListed) {
        this.isExchangeListed = isExchangeListed;
        return this;
    }

    public CdmBaseStaticdataAssetCommonPutCallEnum getOptionType() {
        return optionType;
    }

    public CdmBaseStaticdataAssetCommonListedDerivative optionType(CdmBaseStaticdataAssetCommonPutCallEnum optionType) {
        this.optionType = optionType;
        return this;
    }

    public List<CdmBaseStaticdataPartyLegalEntity> getRelatedExchange() {
        return relatedExchange;
    }

    public CdmBaseStaticdataAssetCommonListedDerivative relatedExchange(List<CdmBaseStaticdataPartyLegalEntity> relatedExchange) {
        this.relatedExchange = relatedExchange;
        return this;
    }

    public Double getStrike() {
        return strike;
    }

    public CdmBaseStaticdataAssetCommonListedDerivative strike(Double strike) {
        this.strike = strike;
        return this;
    }

    public List<CdmBaseStaticdataAssetCommonTaxonomy> getTaxonomy() {
        return taxonomy;
    }

    public CdmBaseStaticdataAssetCommonListedDerivative taxonomy(List<CdmBaseStaticdataAssetCommonTaxonomy> taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

}
