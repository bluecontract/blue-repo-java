package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("EB88pgHdqGKVYYZDmHbqdg7ecuE5xtCMpNJS1fboGe9P")
public class AggregationParameters {
    public static String blueId() {
        return "EB88pgHdqGKVYYZDmHbqdg7ecuE5xtCMpNJS1fboGe9P";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AggregationParameters";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AggregationParameters";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/AggregationParameters.json";
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

    private String dateTime;

    private List<ReferenceWithMetaParty> party;

    private PositionStatusEnum positionStatus;

    private List<NonTransferableProduct> product;

    private List<String> productQualifier;

    private Boolean totalPosition;

    private List<ReferenceWithMetaTrade> tradeReference;

    public String getNamespace() {
        return namespace;
    }

    public AggregationParameters namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getDateTime() {
        return dateTime;
    }

    public AggregationParameters dateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    public List<ReferenceWithMetaParty> getParty() {
        return party;
    }

    public AggregationParameters party(List<ReferenceWithMetaParty> party) {
        this.party = party;
        return this;
    }

    public PositionStatusEnum getPositionStatus() {
        return positionStatus;
    }

    public AggregationParameters positionStatus(PositionStatusEnum positionStatus) {
        this.positionStatus = positionStatus;
        return this;
    }

    public List<NonTransferableProduct> getProduct() {
        return product;
    }

    public AggregationParameters product(List<NonTransferableProduct> product) {
        this.product = product;
        return this;
    }

    public List<String> getProductQualifier() {
        return productQualifier;
    }

    public AggregationParameters productQualifier(List<String> productQualifier) {
        this.productQualifier = productQualifier;
        return this;
    }

    public Boolean getTotalPosition() {
        return totalPosition;
    }

    public AggregationParameters totalPosition(Boolean totalPosition) {
        this.totalPosition = totalPosition;
        return this;
    }

    public List<ReferenceWithMetaTrade> getTradeReference() {
        return tradeReference;
    }

    public AggregationParameters tradeReference(List<ReferenceWithMetaTrade> tradeReference) {
        this.tradeReference = tradeReference;
        return this;
    }

}
