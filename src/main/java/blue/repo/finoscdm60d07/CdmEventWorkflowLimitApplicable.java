package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("3fw932JEV4EnfQPhRdDhvMBKZU4GV2sCgEXHrcXZBhvu")
public class CdmEventWorkflowLimitApplicable {
    public static String blueId() {
        return "3fw932JEV4EnfQPhRdDhvMBKZU4GV2sCgEXHrcXZBhvu";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/workflow/LimitApplicable";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/workflow/LimitApplicable";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventworkflowLimitApplicable.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Double amountRemaining;

    private Double amountUtilized;

    private BigInteger clipSize;

    private ComRosettaModelFieldWithMetaString currency;

    private CdmEventWorkflowFieldWithMetaCreditLimitTypeEnum limitType;

    private CdmEventWorkflowCreditLimitUtilisation utilization;

    private CdmEventWorkflowVelocity velocity;

    public Double getAmountRemaining() {
        return amountRemaining;
    }

    public CdmEventWorkflowLimitApplicable amountRemaining(Double amountRemaining) {
        this.amountRemaining = amountRemaining;
        return this;
    }

    public Double getAmountUtilized() {
        return amountUtilized;
    }

    public CdmEventWorkflowLimitApplicable amountUtilized(Double amountUtilized) {
        this.amountUtilized = amountUtilized;
        return this;
    }

    public BigInteger getClipSize() {
        return clipSize;
    }

    public CdmEventWorkflowLimitApplicable clipSize(BigInteger clipSize) {
        this.clipSize = clipSize;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getCurrency() {
        return currency;
    }

    public CdmEventWorkflowLimitApplicable currency(ComRosettaModelFieldWithMetaString currency) {
        this.currency = currency;
        return this;
    }

    public CdmEventWorkflowFieldWithMetaCreditLimitTypeEnum getLimitType() {
        return limitType;
    }

    public CdmEventWorkflowLimitApplicable limitType(CdmEventWorkflowFieldWithMetaCreditLimitTypeEnum limitType) {
        this.limitType = limitType;
        return this;
    }

    public CdmEventWorkflowCreditLimitUtilisation getUtilization() {
        return utilization;
    }

    public CdmEventWorkflowLimitApplicable utilization(CdmEventWorkflowCreditLimitUtilisation utilization) {
        this.utilization = utilization;
        return this;
    }

    public CdmEventWorkflowVelocity getVelocity() {
        return velocity;
    }

    public CdmEventWorkflowLimitApplicable velocity(CdmEventWorkflowVelocity velocity) {
        this.velocity = velocity;
        return this;
    }

}
