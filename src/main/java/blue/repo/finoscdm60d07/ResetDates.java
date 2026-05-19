package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GW8qBzYqQANazzDMfXoSaCjy8bK2sj3FhqLoU762PXdd")
public class ResetDates {
    public static String blueId() {
        return "GW8qBzYqQANazzDMfXoSaCjy8bK2sj3FhqLoU762PXdd";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ResetDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ResetDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ResetDates.json";
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

    private ReferenceWithMetaCalculationPeriodDates calculationPeriodDatesReference;

    private AdjustableDate finalFixingDate;

    private RelativeDateOffset fixingDates;

    private InitialFixingDate initialFixingDate;

    private Offset rateCutOffDaysOffset;

    private BusinessDayAdjustments resetDatesAdjustments;

    private ResetFrequency resetFrequency;

    private ResetRelativeToEnum resetRelativeTo;

    public String getNamespace() {
        return namespace;
    }

    public ResetDates namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ReferenceWithMetaCalculationPeriodDates getCalculationPeriodDatesReference() {
        return calculationPeriodDatesReference;
    }

    public ResetDates calculationPeriodDatesReference(ReferenceWithMetaCalculationPeriodDates calculationPeriodDatesReference) {
        this.calculationPeriodDatesReference = calculationPeriodDatesReference;
        return this;
    }

    public AdjustableDate getFinalFixingDate() {
        return finalFixingDate;
    }

    public ResetDates finalFixingDate(AdjustableDate finalFixingDate) {
        this.finalFixingDate = finalFixingDate;
        return this;
    }

    public RelativeDateOffset getFixingDates() {
        return fixingDates;
    }

    public ResetDates fixingDates(RelativeDateOffset fixingDates) {
        this.fixingDates = fixingDates;
        return this;
    }

    public InitialFixingDate getInitialFixingDate() {
        return initialFixingDate;
    }

    public ResetDates initialFixingDate(InitialFixingDate initialFixingDate) {
        this.initialFixingDate = initialFixingDate;
        return this;
    }

    public Offset getRateCutOffDaysOffset() {
        return rateCutOffDaysOffset;
    }

    public ResetDates rateCutOffDaysOffset(Offset rateCutOffDaysOffset) {
        this.rateCutOffDaysOffset = rateCutOffDaysOffset;
        return this;
    }

    public BusinessDayAdjustments getResetDatesAdjustments() {
        return resetDatesAdjustments;
    }

    public ResetDates resetDatesAdjustments(BusinessDayAdjustments resetDatesAdjustments) {
        this.resetDatesAdjustments = resetDatesAdjustments;
        return this;
    }

    public ResetFrequency getResetFrequency() {
        return resetFrequency;
    }

    public ResetDates resetFrequency(ResetFrequency resetFrequency) {
        this.resetFrequency = resetFrequency;
        return this;
    }

    public ResetRelativeToEnum getResetRelativeTo() {
        return resetRelativeTo;
    }

    public ResetDates resetRelativeTo(ResetRelativeToEnum resetRelativeTo) {
        this.resetRelativeTo = resetRelativeTo;
        return this;
    }

}
