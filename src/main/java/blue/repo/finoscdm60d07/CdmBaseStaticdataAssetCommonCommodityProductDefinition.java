package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("42E8LjfyrvfiY3rzFn9ktgxtEHdG6eXmK5CyYGHUkotU")
public class CdmBaseStaticdataAssetCommonCommodityProductDefinition {
    public static String blueId() {
        return "42E8LjfyrvfiY3rzFn9ktgxtEHdG6eXmK5CyYGHUkotU";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/CommodityProductDefinition";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/CommodityProductDefinition";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonCommodityProductDefinition.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataAssetCommonCommodityInformationPublisherEnum commodityInfoPublisher;

    private ComRosettaModelFieldWithMetaString exchangeId;

    private CdmBaseStaticdataAssetCommonPriceSource priceSource;

    private CdmBaseStaticdataAssetCommonCommodityReferenceFramework referenceFramework;

    public CdmBaseStaticdataAssetCommonCommodityInformationPublisherEnum getCommodityInfoPublisher() {
        return commodityInfoPublisher;
    }

    public CdmBaseStaticdataAssetCommonCommodityProductDefinition commodityInfoPublisher(CdmBaseStaticdataAssetCommonCommodityInformationPublisherEnum commodityInfoPublisher) {
        this.commodityInfoPublisher = commodityInfoPublisher;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getExchangeId() {
        return exchangeId;
    }

    public CdmBaseStaticdataAssetCommonCommodityProductDefinition exchangeId(ComRosettaModelFieldWithMetaString exchangeId) {
        this.exchangeId = exchangeId;
        return this;
    }

    public CdmBaseStaticdataAssetCommonPriceSource getPriceSource() {
        return priceSource;
    }

    public CdmBaseStaticdataAssetCommonCommodityProductDefinition priceSource(CdmBaseStaticdataAssetCommonPriceSource priceSource) {
        this.priceSource = priceSource;
        return this;
    }

    public CdmBaseStaticdataAssetCommonCommodityReferenceFramework getReferenceFramework() {
        return referenceFramework;
    }

    public CdmBaseStaticdataAssetCommonCommodityProductDefinition referenceFramework(CdmBaseStaticdataAssetCommonCommodityReferenceFramework referenceFramework) {
        this.referenceFramework = referenceFramework;
        return this;
    }

}
