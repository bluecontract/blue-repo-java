package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("AR45qW5fRMfdizm8jWmHuJ4VtwUfxFmyq5o92qyqGw28")
public class CdmProductCommonSettlementSettlementDate {
    public static String blueId() {
        return "AR45qW5fRMfdizm8jWmHuJ4VtwUfxFmyq5o92qyqGw28";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/SettlementDate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/SettlementDate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementSettlementDate.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeAdjustableDates adjustableDates;

    private CdmBaseDatetimeAdjustableOrAdjustedOrRelativeDate adjustableOrRelativeDate;

    private CdmBaseDatetimeBusinessDateRange businessDateRange;

    private BigInteger cashSettlementBusinessDays;

    private Boolean paymentDelay;

    private String valueDate;

    public CdmBaseDatetimeAdjustableDates getAdjustableDates() {
        return adjustableDates;
    }

    public CdmProductCommonSettlementSettlementDate adjustableDates(CdmBaseDatetimeAdjustableDates adjustableDates) {
        this.adjustableDates = adjustableDates;
        return this;
    }

    public CdmBaseDatetimeAdjustableOrAdjustedOrRelativeDate getAdjustableOrRelativeDate() {
        return adjustableOrRelativeDate;
    }

    public CdmProductCommonSettlementSettlementDate adjustableOrRelativeDate(CdmBaseDatetimeAdjustableOrAdjustedOrRelativeDate adjustableOrRelativeDate) {
        this.adjustableOrRelativeDate = adjustableOrRelativeDate;
        return this;
    }

    public CdmBaseDatetimeBusinessDateRange getBusinessDateRange() {
        return businessDateRange;
    }

    public CdmProductCommonSettlementSettlementDate businessDateRange(CdmBaseDatetimeBusinessDateRange businessDateRange) {
        this.businessDateRange = businessDateRange;
        return this;
    }

    public BigInteger getCashSettlementBusinessDays() {
        return cashSettlementBusinessDays;
    }

    public CdmProductCommonSettlementSettlementDate cashSettlementBusinessDays(BigInteger cashSettlementBusinessDays) {
        this.cashSettlementBusinessDays = cashSettlementBusinessDays;
        return this;
    }

    public Boolean getPaymentDelay() {
        return paymentDelay;
    }

    public CdmProductCommonSettlementSettlementDate paymentDelay(Boolean paymentDelay) {
        this.paymentDelay = paymentDelay;
        return this;
    }

    public String getValueDate() {
        return valueDate;
    }

    public CdmProductCommonSettlementSettlementDate valueDate(String valueDate) {
        this.valueDate = valueDate;
        return this;
    }

}
