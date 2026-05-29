package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("85PXDKMedojZoEVeXQsWFDpScr15PdhY8vzQ9xYLQJMy")
public class CdmObservableEventFailureToPay {
    public static String blueId() {
        return "85PXDKMedojZoEVeXQsWFDpScr15PdhY8vzQ9xYLQJMy";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/event/FailureToPay";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/event/FailureToPay";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableeventFailureToPay.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean applicable;

    private CdmObservableEventGracePeriodExtension gracePeriodExtension;

    private CdmObservableAssetMoney paymentRequirement;

    public Boolean getApplicable() {
        return applicable;
    }

    public CdmObservableEventFailureToPay applicable(Boolean applicable) {
        this.applicable = applicable;
        return this;
    }

    public CdmObservableEventGracePeriodExtension getGracePeriodExtension() {
        return gracePeriodExtension;
    }

    public CdmObservableEventFailureToPay gracePeriodExtension(CdmObservableEventGracePeriodExtension gracePeriodExtension) {
        this.gracePeriodExtension = gracePeriodExtension;
        return this;
    }

    public CdmObservableAssetMoney getPaymentRequirement() {
        return paymentRequirement;
    }

    public CdmObservableEventFailureToPay paymentRequirement(CdmObservableAssetMoney paymentRequirement) {
        this.paymentRequirement = paymentRequirement;
        return this;
    }

}
