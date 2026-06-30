package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("35r3StzAH6Qus8FCSpiCqqUrKHx9d4SYBCL2gEecgCJq")
public class CdmEventCommonValuation {
    public static String blueId() {
        return "35r3StzAH6Qus8FCSpiCqqUrKHx9d4SYBCL2gEecgCJq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/Valuation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/Valuation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonValuation.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetMoney amount;

    private Double delta;

    private CdmEventCommonValuationTypeEnum method;

    private CdmObservableAssetPrice priceComponent;

    private CdmEventCommonValuationSourceEnum source;

    private String timestamp;

    private CdmEventCommonPriceTimingEnum valuationTiming;

    public CdmObservableAssetMoney getAmount() {
        return amount;
    }

    public CdmEventCommonValuation amount(CdmObservableAssetMoney amount) {
        this.amount = amount;
        return this;
    }

    public Double getDelta() {
        return delta;
    }

    public CdmEventCommonValuation delta(Double delta) {
        this.delta = delta;
        return this;
    }

    public CdmEventCommonValuationTypeEnum getMethod() {
        return method;
    }

    public CdmEventCommonValuation method(CdmEventCommonValuationTypeEnum method) {
        this.method = method;
        return this;
    }

    public CdmObservableAssetPrice getPriceComponent() {
        return priceComponent;
    }

    public CdmEventCommonValuation priceComponent(CdmObservableAssetPrice priceComponent) {
        this.priceComponent = priceComponent;
        return this;
    }

    public CdmEventCommonValuationSourceEnum getSource() {
        return source;
    }

    public CdmEventCommonValuation source(CdmEventCommonValuationSourceEnum source) {
        this.source = source;
        return this;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public CdmEventCommonValuation timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public CdmEventCommonPriceTimingEnum getValuationTiming() {
        return valuationTiming;
    }

    public CdmEventCommonValuation valuationTiming(CdmEventCommonPriceTimingEnum valuationTiming) {
        this.valuationTiming = valuationTiming;
        return this;
    }

}
