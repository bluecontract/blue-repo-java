package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("2AjMswvvUFa65tb2E1fgtkxxgJ7ReLj17xorwjbb8wAb")
public class CdmEventPositionAggregationParameters {
    public static String blueId() {
        return "2AjMswvvUFa65tb2E1fgtkxxgJ7ReLj17xorwjbb8wAb";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/position/AggregationParameters";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/position/AggregationParameters";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventpositionAggregationParameters.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String dateTime;

    private List<CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty> party;

    private CdmEventPositionPositionStatusEnum positionStatus;

    private List<CdmProductTemplateNonTransferableProduct> product;

    private List<String> productQualifier;

    private Boolean totalPosition;

    private List<CdmEventCommonMetafieldsReferenceWithMetaTrade> tradeReference;

    public String getDateTime() {
        return dateTime;
    }

    public CdmEventPositionAggregationParameters dateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    public List<CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty> getParty() {
        return party;
    }

    public CdmEventPositionAggregationParameters party(List<CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty> party) {
        this.party = party;
        return this;
    }

    public CdmEventPositionPositionStatusEnum getPositionStatus() {
        return positionStatus;
    }

    public CdmEventPositionAggregationParameters positionStatus(CdmEventPositionPositionStatusEnum positionStatus) {
        this.positionStatus = positionStatus;
        return this;
    }

    public List<CdmProductTemplateNonTransferableProduct> getProduct() {
        return product;
    }

    public CdmEventPositionAggregationParameters product(List<CdmProductTemplateNonTransferableProduct> product) {
        this.product = product;
        return this;
    }

    public List<String> getProductQualifier() {
        return productQualifier;
    }

    public CdmEventPositionAggregationParameters productQualifier(List<String> productQualifier) {
        this.productQualifier = productQualifier;
        return this;
    }

    public Boolean getTotalPosition() {
        return totalPosition;
    }

    public CdmEventPositionAggregationParameters totalPosition(Boolean totalPosition) {
        this.totalPosition = totalPosition;
        return this;
    }

    public List<CdmEventCommonMetafieldsReferenceWithMetaTrade> getTradeReference() {
        return tradeReference;
    }

    public CdmEventPositionAggregationParameters tradeReference(List<CdmEventCommonMetafieldsReferenceWithMetaTrade> tradeReference) {
        this.tradeReference = tradeReference;
        return this;
    }

}
