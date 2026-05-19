package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("66ZPCNS5fga1DiK68TWqgzqDViQ1u8Rb1k829D6Z6iHR")
public class SettlementTerms {
    public static String blueId() {
        return "66ZPCNS5fga1DiK68TWqgzqDViQ1u8Rb1k829D6Z6iHR";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SettlementTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SettlementTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/SettlementTerms.json";
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

    private List<CashSettlementTerms> cashSettlementTerms;

    private PhysicalSettlementTerms physicalSettlementTerms;

    private SettlementCentreEnum settlementCentre;

    private FieldWithMetaString settlementCurrency;

    private SettlementDate settlementDate;

    private SettlementProvision settlementProvision;

    private SettlementTypeEnum settlementType;

    private StandardSettlementStyleEnum standardSettlementStyle;

    private TransferSettlementEnum transferSettlementType;

    public String getNamespace() {
        return namespace;
    }

    public SettlementTerms namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<CashSettlementTerms> getCashSettlementTerms() {
        return cashSettlementTerms;
    }

    public SettlementTerms cashSettlementTerms(List<CashSettlementTerms> cashSettlementTerms) {
        this.cashSettlementTerms = cashSettlementTerms;
        return this;
    }

    public PhysicalSettlementTerms getPhysicalSettlementTerms() {
        return physicalSettlementTerms;
    }

    public SettlementTerms physicalSettlementTerms(PhysicalSettlementTerms physicalSettlementTerms) {
        this.physicalSettlementTerms = physicalSettlementTerms;
        return this;
    }

    public SettlementCentreEnum getSettlementCentre() {
        return settlementCentre;
    }

    public SettlementTerms settlementCentre(SettlementCentreEnum settlementCentre) {
        this.settlementCentre = settlementCentre;
        return this;
    }

    public FieldWithMetaString getSettlementCurrency() {
        return settlementCurrency;
    }

    public SettlementTerms settlementCurrency(FieldWithMetaString settlementCurrency) {
        this.settlementCurrency = settlementCurrency;
        return this;
    }

    public SettlementDate getSettlementDate() {
        return settlementDate;
    }

    public SettlementTerms settlementDate(SettlementDate settlementDate) {
        this.settlementDate = settlementDate;
        return this;
    }

    public SettlementProvision getSettlementProvision() {
        return settlementProvision;
    }

    public SettlementTerms settlementProvision(SettlementProvision settlementProvision) {
        this.settlementProvision = settlementProvision;
        return this;
    }

    public SettlementTypeEnum getSettlementType() {
        return settlementType;
    }

    public SettlementTerms settlementType(SettlementTypeEnum settlementType) {
        this.settlementType = settlementType;
        return this;
    }

    public StandardSettlementStyleEnum getStandardSettlementStyle() {
        return standardSettlementStyle;
    }

    public SettlementTerms standardSettlementStyle(StandardSettlementStyleEnum standardSettlementStyle) {
        this.standardSettlementStyle = standardSettlementStyle;
        return this;
    }

    public TransferSettlementEnum getTransferSettlementType() {
        return transferSettlementType;
    }

    public SettlementTerms transferSettlementType(TransferSettlementEnum transferSettlementType) {
        this.transferSettlementType = transferSettlementType;
        return this;
    }

}
