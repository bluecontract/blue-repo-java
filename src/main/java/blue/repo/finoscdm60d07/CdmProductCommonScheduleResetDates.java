package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3vhZkBtf89QeyenxmdafyXvgfNendpuEbpzGhbGtJrhB")
public class CdmProductCommonScheduleResetDates {
    public static String blueId() {
        return "3vhZkBtf89QeyenxmdafyXvgfNendpuEbpzGhbGtJrhB";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/ResetDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/ResetDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonscheduleResetDates.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCommonScheduleMetafieldsReferenceWithMetaCalculationPeriodDates calculationPeriodDatesReference;

    private CdmBaseDatetimeAdjustableDate finalFixingDate;

    private CdmBaseDatetimeRelativeDateOffset fixingDates;

    private CdmProductCommonScheduleInitialFixingDate initialFixingDate;

    private CdmBaseDatetimeOffset rateCutOffDaysOffset;

    private CdmBaseDatetimeBusinessDayAdjustments resetDatesAdjustments;

    private CdmProductCommonScheduleResetFrequency resetFrequency;

    private CdmProductCommonScheduleResetRelativeToEnum resetRelativeTo;

    public CdmProductCommonScheduleMetafieldsReferenceWithMetaCalculationPeriodDates getCalculationPeriodDatesReference() {
        return calculationPeriodDatesReference;
    }

    public CdmProductCommonScheduleResetDates calculationPeriodDatesReference(CdmProductCommonScheduleMetafieldsReferenceWithMetaCalculationPeriodDates calculationPeriodDatesReference) {
        this.calculationPeriodDatesReference = calculationPeriodDatesReference;
        return this;
    }

    public CdmBaseDatetimeAdjustableDate getFinalFixingDate() {
        return finalFixingDate;
    }

    public CdmProductCommonScheduleResetDates finalFixingDate(CdmBaseDatetimeAdjustableDate finalFixingDate) {
        this.finalFixingDate = finalFixingDate;
        return this;
    }

    public CdmBaseDatetimeRelativeDateOffset getFixingDates() {
        return fixingDates;
    }

    public CdmProductCommonScheduleResetDates fixingDates(CdmBaseDatetimeRelativeDateOffset fixingDates) {
        this.fixingDates = fixingDates;
        return this;
    }

    public CdmProductCommonScheduleInitialFixingDate getInitialFixingDate() {
        return initialFixingDate;
    }

    public CdmProductCommonScheduleResetDates initialFixingDate(CdmProductCommonScheduleInitialFixingDate initialFixingDate) {
        this.initialFixingDate = initialFixingDate;
        return this;
    }

    public CdmBaseDatetimeOffset getRateCutOffDaysOffset() {
        return rateCutOffDaysOffset;
    }

    public CdmProductCommonScheduleResetDates rateCutOffDaysOffset(CdmBaseDatetimeOffset rateCutOffDaysOffset) {
        this.rateCutOffDaysOffset = rateCutOffDaysOffset;
        return this;
    }

    public CdmBaseDatetimeBusinessDayAdjustments getResetDatesAdjustments() {
        return resetDatesAdjustments;
    }

    public CdmProductCommonScheduleResetDates resetDatesAdjustments(CdmBaseDatetimeBusinessDayAdjustments resetDatesAdjustments) {
        this.resetDatesAdjustments = resetDatesAdjustments;
        return this;
    }

    public CdmProductCommonScheduleResetFrequency getResetFrequency() {
        return resetFrequency;
    }

    public CdmProductCommonScheduleResetDates resetFrequency(CdmProductCommonScheduleResetFrequency resetFrequency) {
        this.resetFrequency = resetFrequency;
        return this;
    }

    public CdmProductCommonScheduleResetRelativeToEnum getResetRelativeTo() {
        return resetRelativeTo;
    }

    public CdmProductCommonScheduleResetDates resetRelativeTo(CdmProductCommonScheduleResetRelativeToEnum resetRelativeTo) {
        this.resetRelativeTo = resetRelativeTo;
        return this;
    }

}
