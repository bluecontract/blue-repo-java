package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5yXQrJRdwyy7qcvzV1t527g5pyYzCtQT6qXswJVtgu7f")
public class FinalCalculationPeriodDateAdjustment {
    public static String blueId() {
        return "5yXQrJRdwyy7qcvzV1t527g5pyYzCtQT6qXswJVtgu7f";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FinalCalculationPeriodDateAdjustment";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FinalCalculationPeriodDateAdjustment";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FinalCalculationPeriodDateAdjustment.json";
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

    private BusinessDayConventionEnum businessDayConvention;

    private ReferenceWithMetaAdjustableOrRelativeDates relevantUnderlyingDateReference;

    private ReferenceWithMetaInterestRatePayout swapStreamReference;

    public String getNamespace() {
        return namespace;
    }

    public FinalCalculationPeriodDateAdjustment namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public BusinessDayConventionEnum getBusinessDayConvention() {
        return businessDayConvention;
    }

    public FinalCalculationPeriodDateAdjustment businessDayConvention(BusinessDayConventionEnum businessDayConvention) {
        this.businessDayConvention = businessDayConvention;
        return this;
    }

    public ReferenceWithMetaAdjustableOrRelativeDates getRelevantUnderlyingDateReference() {
        return relevantUnderlyingDateReference;
    }

    public FinalCalculationPeriodDateAdjustment relevantUnderlyingDateReference(ReferenceWithMetaAdjustableOrRelativeDates relevantUnderlyingDateReference) {
        this.relevantUnderlyingDateReference = relevantUnderlyingDateReference;
        return this;
    }

    public ReferenceWithMetaInterestRatePayout getSwapStreamReference() {
        return swapStreamReference;
    }

    public FinalCalculationPeriodDateAdjustment swapStreamReference(ReferenceWithMetaInterestRatePayout swapStreamReference) {
        this.swapStreamReference = swapStreamReference;
        return this;
    }

}
