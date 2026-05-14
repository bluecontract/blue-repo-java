package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("BEKWCv1WpmaFsqVkWUWnM3WB5WJpUUGuUm1vDnJcgTHj")
public class CashCollateralValuationMethod {
    public static String blueId() {
        return "BEKWCv1WpmaFsqVkWUWnM3WB5WJpUUGuUm1vDnJcgTHj";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CashCollateralValuationMethod";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CashCollateralValuationMethod";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CashCollateralValuationMethod.json";
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

    private FieldWithMetaString agreedDiscountRate;

    private CsaTypeEnum applicableCsa;

    private String cashCollateralCurrency;

    private FieldWithMetaString cashCollateralInterestRate;

    private Boolean prescribedDocumentationAdjustment;

    private List<PartyDeterminationEnum> protectedParty;

    public String getNamespace() {
        return namespace;
    }

    public CashCollateralValuationMethod namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FieldWithMetaString getAgreedDiscountRate() {
        return agreedDiscountRate;
    }

    public CashCollateralValuationMethod agreedDiscountRate(FieldWithMetaString agreedDiscountRate) {
        this.agreedDiscountRate = agreedDiscountRate;
        return this;
    }

    public CsaTypeEnum getApplicableCsa() {
        return applicableCsa;
    }

    public CashCollateralValuationMethod applicableCsa(CsaTypeEnum applicableCsa) {
        this.applicableCsa = applicableCsa;
        return this;
    }

    public String getCashCollateralCurrency() {
        return cashCollateralCurrency;
    }

    public CashCollateralValuationMethod cashCollateralCurrency(String cashCollateralCurrency) {
        this.cashCollateralCurrency = cashCollateralCurrency;
        return this;
    }

    public FieldWithMetaString getCashCollateralInterestRate() {
        return cashCollateralInterestRate;
    }

    public CashCollateralValuationMethod cashCollateralInterestRate(FieldWithMetaString cashCollateralInterestRate) {
        this.cashCollateralInterestRate = cashCollateralInterestRate;
        return this;
    }

    public Boolean getPrescribedDocumentationAdjustment() {
        return prescribedDocumentationAdjustment;
    }

    public CashCollateralValuationMethod prescribedDocumentationAdjustment(Boolean prescribedDocumentationAdjustment) {
        this.prescribedDocumentationAdjustment = prescribedDocumentationAdjustment;
        return this;
    }

    public List<PartyDeterminationEnum> getProtectedParty() {
        return protectedParty;
    }

    public CashCollateralValuationMethod protectedParty(List<PartyDeterminationEnum> protectedParty) {
        this.protectedParty = protectedParty;
        return this;
    }

}
