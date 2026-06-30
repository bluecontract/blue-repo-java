package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CAWuQnv8ErBNebNAhWCC5XXHxx49GA2Yi9eaWFTXcij1")
public class CdmProductTemplateSchedulePeriod {
    public static String blueId() {
        return "CAWuQnv8ErBNebNAhWCC5XXHxx49GA2Yi9eaWFTXcij1";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/SchedulePeriod";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/SchedulePeriod";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateSchedulePeriod.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeDateRange calculationPeriod;

    private CdmProductAssetCalculationScheduleDeliveryPeriods deliveryPeriod;

    private CdmBaseDatetimeDateRange fixingPeriod;

    private String paymentDate;

    public CdmBaseDatetimeDateRange getCalculationPeriod() {
        return calculationPeriod;
    }

    public CdmProductTemplateSchedulePeriod calculationPeriod(CdmBaseDatetimeDateRange calculationPeriod) {
        this.calculationPeriod = calculationPeriod;
        return this;
    }

    public CdmProductAssetCalculationScheduleDeliveryPeriods getDeliveryPeriod() {
        return deliveryPeriod;
    }

    public CdmProductTemplateSchedulePeriod deliveryPeriod(CdmProductAssetCalculationScheduleDeliveryPeriods deliveryPeriod) {
        this.deliveryPeriod = deliveryPeriod;
        return this;
    }

    public CdmBaseDatetimeDateRange getFixingPeriod() {
        return fixingPeriod;
    }

    public CdmProductTemplateSchedulePeriod fixingPeriod(CdmBaseDatetimeDateRange fixingPeriod) {
        this.fixingPeriod = fixingPeriod;
        return this;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public CdmProductTemplateSchedulePeriod paymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }

}
