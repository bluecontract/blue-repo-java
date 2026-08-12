package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("3xBEop5VqRojRSFKs2N78XJ9XJ3y9EwonNDNeW7bcGer")
public class CdmObservableAssetCashCollateralValuationMethod {
    public static String blueId() {
        return "3xBEop5VqRojRSFKs2N78XJ9XJ3y9EwonNDNeW7bcGer";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/CashCollateralValuationMethod";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/CashCollateralValuationMethod";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetCashCollateralValuationMethod.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private ComRosettaModelFieldWithMetaString agreedDiscountRate;

    private CdmObservableAssetCsaTypeEnum applicableCsa;

    private String cashCollateralCurrency;

    private ComRosettaModelFieldWithMetaString cashCollateralInterestRate;

    private Boolean prescribedDocumentationAdjustment;

    private List<CdmObservableAssetPartyDeterminationEnum> protectedParty;

    public ComRosettaModelFieldWithMetaString getAgreedDiscountRate() {
        return agreedDiscountRate;
    }

    public CdmObservableAssetCashCollateralValuationMethod agreedDiscountRate(ComRosettaModelFieldWithMetaString agreedDiscountRate) {
        this.agreedDiscountRate = agreedDiscountRate;
        return this;
    }

    public CdmObservableAssetCsaTypeEnum getApplicableCsa() {
        return applicableCsa;
    }

    public CdmObservableAssetCashCollateralValuationMethod applicableCsa(CdmObservableAssetCsaTypeEnum applicableCsa) {
        this.applicableCsa = applicableCsa;
        return this;
    }

    public String getCashCollateralCurrency() {
        return cashCollateralCurrency;
    }

    public CdmObservableAssetCashCollateralValuationMethod cashCollateralCurrency(String cashCollateralCurrency) {
        this.cashCollateralCurrency = cashCollateralCurrency;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getCashCollateralInterestRate() {
        return cashCollateralInterestRate;
    }

    public CdmObservableAssetCashCollateralValuationMethod cashCollateralInterestRate(ComRosettaModelFieldWithMetaString cashCollateralInterestRate) {
        this.cashCollateralInterestRate = cashCollateralInterestRate;
        return this;
    }

    public Boolean getPrescribedDocumentationAdjustment() {
        return prescribedDocumentationAdjustment;
    }

    public CdmObservableAssetCashCollateralValuationMethod prescribedDocumentationAdjustment(Boolean prescribedDocumentationAdjustment) {
        this.prescribedDocumentationAdjustment = prescribedDocumentationAdjustment;
        return this;
    }

    public List<CdmObservableAssetPartyDeterminationEnum> getProtectedParty() {
        return protectedParty;
    }

    public CdmObservableAssetCashCollateralValuationMethod protectedParty(List<CdmObservableAssetPartyDeterminationEnum> protectedParty) {
        this.protectedParty = protectedParty;
        return this;
    }

}
