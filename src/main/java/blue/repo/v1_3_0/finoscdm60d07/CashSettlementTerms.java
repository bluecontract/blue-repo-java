package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("au6xL82deTv95pE1mkjAHYJmyDGg9H96KS1vYB2jAYt")
public class CashSettlementTerms {
    public static String blueId() {
        return "au6xL82deTv95pE1mkjAHYJmyDGg9H96KS1vYB2jAYt";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CashSettlementTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CashSettlementTerms";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CashSettlementTerms.json";
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

    private Boolean accruedInterest;

    private Money cashSettlementAmount;

    private CashSettlementMethodEnum cashSettlementMethod;

    private Boolean fixedSettlement;

    private Double recoveryFactor;

    private ValuationDate valuationDate;

    private ValuationMethod valuationMethod;

    private BusinessCenterTime valuationTime;

    public String getNamespace() {
        return namespace;
    }

    public CashSettlementTerms namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getAccruedInterest() {
        return accruedInterest;
    }

    public CashSettlementTerms accruedInterest(Boolean accruedInterest) {
        this.accruedInterest = accruedInterest;
        return this;
    }

    public Money getCashSettlementAmount() {
        return cashSettlementAmount;
    }

    public CashSettlementTerms cashSettlementAmount(Money cashSettlementAmount) {
        this.cashSettlementAmount = cashSettlementAmount;
        return this;
    }

    public CashSettlementMethodEnum getCashSettlementMethod() {
        return cashSettlementMethod;
    }

    public CashSettlementTerms cashSettlementMethod(CashSettlementMethodEnum cashSettlementMethod) {
        this.cashSettlementMethod = cashSettlementMethod;
        return this;
    }

    public Boolean getFixedSettlement() {
        return fixedSettlement;
    }

    public CashSettlementTerms fixedSettlement(Boolean fixedSettlement) {
        this.fixedSettlement = fixedSettlement;
        return this;
    }

    public Double getRecoveryFactor() {
        return recoveryFactor;
    }

    public CashSettlementTerms recoveryFactor(Double recoveryFactor) {
        this.recoveryFactor = recoveryFactor;
        return this;
    }

    public ValuationDate getValuationDate() {
        return valuationDate;
    }

    public CashSettlementTerms valuationDate(ValuationDate valuationDate) {
        this.valuationDate = valuationDate;
        return this;
    }

    public ValuationMethod getValuationMethod() {
        return valuationMethod;
    }

    public CashSettlementTerms valuationMethod(ValuationMethod valuationMethod) {
        this.valuationMethod = valuationMethod;
        return this;
    }

    public BusinessCenterTime getValuationTime() {
        return valuationTime;
    }

    public CashSettlementTerms valuationTime(BusinessCenterTime valuationTime) {
        this.valuationTime = valuationTime;
        return this;
    }

}
