package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("GpKpXbyQGzZvjEyDEyTcaQNE6sTtGkWtzKHbuUBEesst")
public class LimitApplicable {
    public static String blueId() {
        return "GpKpXbyQGzZvjEyDEyTcaQNE6sTtGkWtzKHbuUBEesst";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "LimitApplicable";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/LimitApplicable";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/LimitApplicable.json";
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

    private FieldWithMetaCreditLimitTypeEnum limitType;

    private CreditLimitUtilisation utilization;

    private Velocity velocity;

    public String getNamespace() {
        return namespace;
    }

    public LimitApplicable namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Double getAmountRemaining() {
        return amountRemaining;
    }

    public LimitApplicable amountRemaining(Double amountRemaining) {
        this.amountRemaining = amountRemaining;
        return this;
    }

    public Double getAmountUtilized() {
        return amountUtilized;
    }

    public LimitApplicable amountUtilized(Double amountUtilized) {
        this.amountUtilized = amountUtilized;
        return this;
    }

    public BigInteger getClipSize() {
        return clipSize;
    }

    public LimitApplicable clipSize(BigInteger clipSize) {
        this.clipSize = clipSize;
        return this;
    }

    public FieldWithMetaString getCurrency() {
        return currency;
    }

    public LimitApplicable currency(FieldWithMetaString currency) {
        this.currency = currency;
        return this;
    }

    public FieldWithMetaCreditLimitTypeEnum getLimitType() {
        return limitType;
    }

    public LimitApplicable limitType(FieldWithMetaCreditLimitTypeEnum limitType) {
        this.limitType = limitType;
        return this;
    }

    public CreditLimitUtilisation getUtilization() {
        return utilization;
    }

    public LimitApplicable utilization(CreditLimitUtilisation utilization) {
        this.utilization = utilization;
        return this;
    }

    public Velocity getVelocity() {
        return velocity;
    }

    public LimitApplicable velocity(Velocity velocity) {
        this.velocity = velocity;
        return this;
    }

}
