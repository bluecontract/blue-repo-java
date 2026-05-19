package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("F7kFYqU1YX2dTdP9CRsJEnr3iHj8XnE4r3cgHrURAAg6")
public class LimitApplicableExtended {
    public static String blueId() {
        return "F7kFYqU1YX2dTdP9CRsJEnr3iHj8XnE4r3cgHrURAAg6";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "LimitApplicableExtended";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/LimitApplicableExtended";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/LimitApplicableExtended.json";
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

    private Double amountRemaining;

    private Double amountUtilized;

    private BigInteger clipSize;

    private FieldWithMetaString currency;

    private Double limitAmount;

    private Double limitImpactDueToTrade;

    private FieldWithMetaLimitLevelEnum limitLevel;

    private FieldWithMetaCreditLimitTypeEnum limitType;

    private CreditLimitUtilisation utilization;

    private Velocity velocity;

    public String getNamespace() {
        return namespace;
    }

    public LimitApplicableExtended namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Double getAmountRemaining() {
        return amountRemaining;
    }

    public LimitApplicableExtended amountRemaining(Double amountRemaining) {
        this.amountRemaining = amountRemaining;
        return this;
    }

    public Double getAmountUtilized() {
        return amountUtilized;
    }

    public LimitApplicableExtended amountUtilized(Double amountUtilized) {
        this.amountUtilized = amountUtilized;
        return this;
    }

    public BigInteger getClipSize() {
        return clipSize;
    }

    public LimitApplicableExtended clipSize(BigInteger clipSize) {
        this.clipSize = clipSize;
        return this;
    }

    public FieldWithMetaString getCurrency() {
        return currency;
    }

    public LimitApplicableExtended currency(FieldWithMetaString currency) {
        this.currency = currency;
        return this;
    }

    public Double getLimitAmount() {
        return limitAmount;
    }

    public LimitApplicableExtended limitAmount(Double limitAmount) {
        this.limitAmount = limitAmount;
        return this;
    }

    public Double getLimitImpactDueToTrade() {
        return limitImpactDueToTrade;
    }

    public LimitApplicableExtended limitImpactDueToTrade(Double limitImpactDueToTrade) {
        this.limitImpactDueToTrade = limitImpactDueToTrade;
        return this;
    }

    public FieldWithMetaLimitLevelEnum getLimitLevel() {
        return limitLevel;
    }

    public LimitApplicableExtended limitLevel(FieldWithMetaLimitLevelEnum limitLevel) {
        this.limitLevel = limitLevel;
        return this;
    }

    public FieldWithMetaCreditLimitTypeEnum getLimitType() {
        return limitType;
    }

    public LimitApplicableExtended limitType(FieldWithMetaCreditLimitTypeEnum limitType) {
        this.limitType = limitType;
        return this;
    }

    public CreditLimitUtilisation getUtilization() {
        return utilization;
    }

    public LimitApplicableExtended utilization(CreditLimitUtilisation utilization) {
        this.utilization = utilization;
        return this;
    }

    public Velocity getVelocity() {
        return velocity;
    }

    public LimitApplicableExtended velocity(Velocity velocity) {
        this.velocity = velocity;
        return this;
    }

}
