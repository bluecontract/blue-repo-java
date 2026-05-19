package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("w77BbKBw8kqAHLqjbZSmiwJZFk8Hndqv5hMYoTMP7gn")
public class SettlementDate {
    public static String blueId() {
        return "w77BbKBw8kqAHLqjbZSmiwJZFk8Hndqv5hMYoTMP7gn";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SettlementDate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SettlementDate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/SettlementDate.json";
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

    private AdjustableDates adjustableDates;

    private AdjustableOrAdjustedOrRelativeDate adjustableOrRelativeDate;

    private BusinessDateRange businessDateRange;

    private BigInteger cashSettlementBusinessDays;

    private Boolean paymentDelay;

    private String valueDate;

    public String getNamespace() {
        return namespace;
    }

    public SettlementDate namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AdjustableDates getAdjustableDates() {
        return adjustableDates;
    }

    public SettlementDate adjustableDates(AdjustableDates adjustableDates) {
        this.adjustableDates = adjustableDates;
        return this;
    }

    public AdjustableOrAdjustedOrRelativeDate getAdjustableOrRelativeDate() {
        return adjustableOrRelativeDate;
    }

    public SettlementDate adjustableOrRelativeDate(AdjustableOrAdjustedOrRelativeDate adjustableOrRelativeDate) {
        this.adjustableOrRelativeDate = adjustableOrRelativeDate;
        return this;
    }

    public BusinessDateRange getBusinessDateRange() {
        return businessDateRange;
    }

    public SettlementDate businessDateRange(BusinessDateRange businessDateRange) {
        this.businessDateRange = businessDateRange;
        return this;
    }

    public BigInteger getCashSettlementBusinessDays() {
        return cashSettlementBusinessDays;
    }

    public SettlementDate cashSettlementBusinessDays(BigInteger cashSettlementBusinessDays) {
        this.cashSettlementBusinessDays = cashSettlementBusinessDays;
        return this;
    }

    public Boolean getPaymentDelay() {
        return paymentDelay;
    }

    public SettlementDate paymentDelay(Boolean paymentDelay) {
        this.paymentDelay = paymentDelay;
        return this;
    }

    public String getValueDate() {
        return valueDate;
    }

    public SettlementDate valueDate(String valueDate) {
        this.valueDate = valueDate;
        return this;
    }

}
