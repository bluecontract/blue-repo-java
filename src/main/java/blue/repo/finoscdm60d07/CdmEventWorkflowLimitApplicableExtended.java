package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("EYpcaUBjmYVc34MF2zDCr15B8fCMH1Lrnw2Zq1zPU4TS")
public class CdmEventWorkflowLimitApplicableExtended {
    public static String blueId() {
        return "EYpcaUBjmYVc34MF2zDCr15B8fCMH1Lrnw2Zq1zPU4TS";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/workflow/LimitApplicableExtended";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/workflow/LimitApplicableExtended";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventworkflowLimitApplicableExtended.json";
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

    private Double limitAmount;

    private Double limitImpactDueToTrade;

    private CdmEventWorkflowFieldWithMetaLimitLevelEnum limitLevel;

    private CdmEventWorkflowFieldWithMetaCreditLimitTypeEnum limitType;

    private CdmEventWorkflowCreditLimitUtilisation utilization;

    private CdmEventWorkflowVelocity velocity;

    public Double getAmountRemaining() {
        return amountRemaining;
    }

    public CdmEventWorkflowLimitApplicableExtended amountRemaining(Double amountRemaining) {
        this.amountRemaining = amountRemaining;
        return this;
    }

    public Double getAmountUtilized() {
        return amountUtilized;
    }

    public CdmEventWorkflowLimitApplicableExtended amountUtilized(Double amountUtilized) {
        this.amountUtilized = amountUtilized;
        return this;
    }

    public BigInteger getClipSize() {
        return clipSize;
    }

    public CdmEventWorkflowLimitApplicableExtended clipSize(BigInteger clipSize) {
        this.clipSize = clipSize;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getCurrency() {
        return currency;
    }

    public CdmEventWorkflowLimitApplicableExtended currency(ComRosettaModelFieldWithMetaString currency) {
        this.currency = currency;
        return this;
    }

    public Double getLimitAmount() {
        return limitAmount;
    }

    public CdmEventWorkflowLimitApplicableExtended limitAmount(Double limitAmount) {
        this.limitAmount = limitAmount;
        return this;
    }

    public Double getLimitImpactDueToTrade() {
        return limitImpactDueToTrade;
    }

    public CdmEventWorkflowLimitApplicableExtended limitImpactDueToTrade(Double limitImpactDueToTrade) {
        this.limitImpactDueToTrade = limitImpactDueToTrade;
        return this;
    }

    public CdmEventWorkflowFieldWithMetaLimitLevelEnum getLimitLevel() {
        return limitLevel;
    }

    public CdmEventWorkflowLimitApplicableExtended limitLevel(CdmEventWorkflowFieldWithMetaLimitLevelEnum limitLevel) {
        this.limitLevel = limitLevel;
        return this;
    }

    public CdmEventWorkflowFieldWithMetaCreditLimitTypeEnum getLimitType() {
        return limitType;
    }

    public CdmEventWorkflowLimitApplicableExtended limitType(CdmEventWorkflowFieldWithMetaCreditLimitTypeEnum limitType) {
        this.limitType = limitType;
        return this;
    }

    public CdmEventWorkflowCreditLimitUtilisation getUtilization() {
        return utilization;
    }

    public CdmEventWorkflowLimitApplicableExtended utilization(CdmEventWorkflowCreditLimitUtilisation utilization) {
        this.utilization = utilization;
        return this;
    }

    public CdmEventWorkflowVelocity getVelocity() {
        return velocity;
    }

    public CdmEventWorkflowLimitApplicableExtended velocity(CdmEventWorkflowVelocity velocity) {
        this.velocity = velocity;
        return this;
    }

}
