package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2py4rC138DyArz1mXMMD2P9MneddHfyn58X476X9UP6k")
public class CommodityProductDefinition {
    public static String blueId() {
        return "2py4rC138DyArz1mXMMD2P9MneddHfyn58X476X9UP6k";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CommodityProductDefinition";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CommodityProductDefinition";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CommodityProductDefinition.json";
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

    private CommodityInformationPublisherEnum commodityInfoPublisher;

    private FieldWithMetaString exchangeId;

    private PriceSource priceSource;

    private CommodityReferenceFramework referenceFramework;

    public String getNamespace() {
        return namespace;
    }

    public CommodityProductDefinition namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CommodityInformationPublisherEnum getCommodityInfoPublisher() {
        return commodityInfoPublisher;
    }

    public CommodityProductDefinition commodityInfoPublisher(CommodityInformationPublisherEnum commodityInfoPublisher) {
        this.commodityInfoPublisher = commodityInfoPublisher;
        return this;
    }

    public FieldWithMetaString getExchangeId() {
        return exchangeId;
    }

    public CommodityProductDefinition exchangeId(FieldWithMetaString exchangeId) {
        this.exchangeId = exchangeId;
        return this;
    }

    public PriceSource getPriceSource() {
        return priceSource;
    }

    public CommodityProductDefinition priceSource(PriceSource priceSource) {
        this.priceSource = priceSource;
        return this;
    }

    public CommodityReferenceFramework getReferenceFramework() {
        return referenceFramework;
    }

    public CommodityProductDefinition referenceFramework(CommodityReferenceFramework referenceFramework) {
        this.referenceFramework = referenceFramework;
        return this;
    }

}
