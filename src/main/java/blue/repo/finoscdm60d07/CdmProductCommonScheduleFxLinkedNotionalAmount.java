package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("J1E3aP2gHFG6xXmDZbkh3v4aXuN62czNKzQgw9T41sdB")
public class CdmProductCommonScheduleFxLinkedNotionalAmount {
    public static String blueId() {
        return "J1E3aP2gHFG6xXmDZbkh3v4aXuN62czNKzQgw9T41sdB";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/FxLinkedNotionalAmount";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/FxLinkedNotionalAmount";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonscheduleFxLinkedNotionalAmount.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String adjustedFxSpotFixingDate;

    private Double notionalAmount;

    private Double observedFxSpotRate;

    private String resetDate;

    public String getAdjustedFxSpotFixingDate() {
        return adjustedFxSpotFixingDate;
    }

    public CdmProductCommonScheduleFxLinkedNotionalAmount adjustedFxSpotFixingDate(String adjustedFxSpotFixingDate) {
        this.adjustedFxSpotFixingDate = adjustedFxSpotFixingDate;
        return this;
    }

    public Double getNotionalAmount() {
        return notionalAmount;
    }

    public CdmProductCommonScheduleFxLinkedNotionalAmount notionalAmount(Double notionalAmount) {
        this.notionalAmount = notionalAmount;
        return this;
    }

    public Double getObservedFxSpotRate() {
        return observedFxSpotRate;
    }

    public CdmProductCommonScheduleFxLinkedNotionalAmount observedFxSpotRate(Double observedFxSpotRate) {
        this.observedFxSpotRate = observedFxSpotRate;
        return this;
    }

    public String getResetDate() {
        return resetDate;
    }

    public CdmProductCommonScheduleFxLinkedNotionalAmount resetDate(String resetDate) {
        this.resetDate = resetDate;
        return this;
    }

}
