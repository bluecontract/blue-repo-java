package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EaHGdmPRG13Uw734jEMLP199CRdDhtpeH1QrNpQSdRwc")
public class CdmProductTemplateExerciseFee {
    public static String blueId() {
        return "EaHGdmPRG13Uw734jEMLP199CRdDhtpeH1QrNpQSdRwc";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/ExerciseFee";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/ExerciseFee";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateExerciseFee.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Double feeAmount;

    private CdmBaseDatetimeRelativeDateOffset feePaymentDate;

    private Double feeRate;

    private CdmObservableAssetMetafieldsReferenceWithMetaMoney notionalReference;

    private CdmBaseStaticdataPartyCounterpartyRoleEnum payer;

    private CdmBaseStaticdataPartyCounterpartyRoleEnum receiver;

    public Double getFeeAmount() {
        return feeAmount;
    }

    public CdmProductTemplateExerciseFee feeAmount(Double feeAmount) {
        this.feeAmount = feeAmount;
        return this;
    }

    public CdmBaseDatetimeRelativeDateOffset getFeePaymentDate() {
        return feePaymentDate;
    }

    public CdmProductTemplateExerciseFee feePaymentDate(CdmBaseDatetimeRelativeDateOffset feePaymentDate) {
        this.feePaymentDate = feePaymentDate;
        return this;
    }

    public Double getFeeRate() {
        return feeRate;
    }

    public CdmProductTemplateExerciseFee feeRate(Double feeRate) {
        this.feeRate = feeRate;
        return this;
    }

    public CdmObservableAssetMetafieldsReferenceWithMetaMoney getNotionalReference() {
        return notionalReference;
    }

    public CdmProductTemplateExerciseFee notionalReference(CdmObservableAssetMetafieldsReferenceWithMetaMoney notionalReference) {
        this.notionalReference = notionalReference;
        return this;
    }

    public CdmBaseStaticdataPartyCounterpartyRoleEnum getPayer() {
        return payer;
    }

    public CdmProductTemplateExerciseFee payer(CdmBaseStaticdataPartyCounterpartyRoleEnum payer) {
        this.payer = payer;
        return this;
    }

    public CdmBaseStaticdataPartyCounterpartyRoleEnum getReceiver() {
        return receiver;
    }

    public CdmProductTemplateExerciseFee receiver(CdmBaseStaticdataPartyCounterpartyRoleEnum receiver) {
        this.receiver = receiver;
        return this;
    }

}
