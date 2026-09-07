package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("32Bq9X3rBgymaeWQt2xPTiPosXQSknLh5UmKzp3R7W4D")
public class CdmProductCommonSchedulePaymentCalculationPeriod {
    public static String blueId() {
        return "32Bq9X3rBgymaeWQt2xPTiPosXQSknLh5UmKzp3R7W4D";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/PaymentCalculationPeriod";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/PaymentCalculationPeriod";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonschedulePaymentCalculationPeriod.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String adjustedPaymentDate;

    private List<CdmProductCommonScheduleCalculationPeriod> calculationPeriod;

    private Double discountFactor;

    private CdmObservableAssetMoney fixedPaymentAmount;

    private CdmObservableAssetMoney forecastPaymentAmount;

    private CdmObservableAssetMoney presentValueAmount;

    private String unadjustedPaymentDate;

    public String getAdjustedPaymentDate() {
        return adjustedPaymentDate;
    }

    public CdmProductCommonSchedulePaymentCalculationPeriod adjustedPaymentDate(String adjustedPaymentDate) {
        this.adjustedPaymentDate = adjustedPaymentDate;
        return this;
    }

    public List<CdmProductCommonScheduleCalculationPeriod> getCalculationPeriod() {
        return calculationPeriod;
    }

    public CdmProductCommonSchedulePaymentCalculationPeriod calculationPeriod(List<CdmProductCommonScheduleCalculationPeriod> calculationPeriod) {
        this.calculationPeriod = calculationPeriod;
        return this;
    }

    public Double getDiscountFactor() {
        return discountFactor;
    }

    public CdmProductCommonSchedulePaymentCalculationPeriod discountFactor(Double discountFactor) {
        this.discountFactor = discountFactor;
        return this;
    }

    public CdmObservableAssetMoney getFixedPaymentAmount() {
        return fixedPaymentAmount;
    }

    public CdmProductCommonSchedulePaymentCalculationPeriod fixedPaymentAmount(CdmObservableAssetMoney fixedPaymentAmount) {
        this.fixedPaymentAmount = fixedPaymentAmount;
        return this;
    }

    public CdmObservableAssetMoney getForecastPaymentAmount() {
        return forecastPaymentAmount;
    }

    public CdmProductCommonSchedulePaymentCalculationPeriod forecastPaymentAmount(CdmObservableAssetMoney forecastPaymentAmount) {
        this.forecastPaymentAmount = forecastPaymentAmount;
        return this;
    }

    public CdmObservableAssetMoney getPresentValueAmount() {
        return presentValueAmount;
    }

    public CdmProductCommonSchedulePaymentCalculationPeriod presentValueAmount(CdmObservableAssetMoney presentValueAmount) {
        this.presentValueAmount = presentValueAmount;
        return this;
    }

    public String getUnadjustedPaymentDate() {
        return unadjustedPaymentDate;
    }

    public CdmProductCommonSchedulePaymentCalculationPeriod unadjustedPaymentDate(String unadjustedPaymentDate) {
        this.unadjustedPaymentDate = unadjustedPaymentDate;
        return this;
    }

}
