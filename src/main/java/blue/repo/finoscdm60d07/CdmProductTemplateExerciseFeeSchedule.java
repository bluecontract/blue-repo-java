package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EKJ7CajtqR1629roZEkSxTwTcmpawEkuH7mrHxSBZ1FD")
public class CdmProductTemplateExerciseFeeSchedule {
    public static String blueId() {
        return "EKJ7CajtqR1629roZEkSxTwTcmpawEkuH7mrHxSBZ1FD";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/ExerciseFeeSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/ExerciseFeeSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateExerciseFeeSchedule.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCommonScheduleAmountSchedule feeAmountSchedule;

    private CdmBaseDatetimeRelativeDateOffset feePaymentDate;

    private CdmBaseMathSchedule feeRateSchedule;

    private CdmObservableAssetMetafieldsReferenceWithMetaMoney notionalReference;

    private CdmBaseStaticdataPartyCounterpartyRoleEnum payer;

    private CdmBaseStaticdataPartyCounterpartyRoleEnum receiver;

    public CdmProductCommonScheduleAmountSchedule getFeeAmountSchedule() {
        return feeAmountSchedule;
    }

    public CdmProductTemplateExerciseFeeSchedule feeAmountSchedule(CdmProductCommonScheduleAmountSchedule feeAmountSchedule) {
        this.feeAmountSchedule = feeAmountSchedule;
        return this;
    }

    public CdmBaseDatetimeRelativeDateOffset getFeePaymentDate() {
        return feePaymentDate;
    }

    public CdmProductTemplateExerciseFeeSchedule feePaymentDate(CdmBaseDatetimeRelativeDateOffset feePaymentDate) {
        this.feePaymentDate = feePaymentDate;
        return this;
    }

    public CdmBaseMathSchedule getFeeRateSchedule() {
        return feeRateSchedule;
    }

    public CdmProductTemplateExerciseFeeSchedule feeRateSchedule(CdmBaseMathSchedule feeRateSchedule) {
        this.feeRateSchedule = feeRateSchedule;
        return this;
    }

    public CdmObservableAssetMetafieldsReferenceWithMetaMoney getNotionalReference() {
        return notionalReference;
    }

    public CdmProductTemplateExerciseFeeSchedule notionalReference(CdmObservableAssetMetafieldsReferenceWithMetaMoney notionalReference) {
        this.notionalReference = notionalReference;
        return this;
    }

    public CdmBaseStaticdataPartyCounterpartyRoleEnum getPayer() {
        return payer;
    }

    public CdmProductTemplateExerciseFeeSchedule payer(CdmBaseStaticdataPartyCounterpartyRoleEnum payer) {
        this.payer = payer;
        return this;
    }

    public CdmBaseStaticdataPartyCounterpartyRoleEnum getReceiver() {
        return receiver;
    }

    public CdmProductTemplateExerciseFeeSchedule receiver(CdmBaseStaticdataPartyCounterpartyRoleEnum receiver) {
        this.receiver = receiver;
        return this;
    }

}
