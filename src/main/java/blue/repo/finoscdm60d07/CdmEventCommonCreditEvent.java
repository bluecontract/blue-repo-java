package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("EQbMdmckvBWpzUSTW2RqwtdhHdRG2jG5aKmRv7qA8qf2")
public class CdmEventCommonCreditEvent {
    public static String blueId() {
        return "EQbMdmckvBWpzUSTW2RqwtdhHdRG2jG5aKmRv7qA8qf2";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/CreditEvent";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/CreditEvent";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonCreditEvent.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String auctionDate;

    private CdmEventCommonCreditEventTypeEnum creditEventType;

    private String eventDeterminationDate;

    private CdmObservableAssetPrice finalPrice;

    private List<CdmLegaldocumentationCommonResource> publiclyAvailableInformation;

    private Double recoveryPercent;

    private CdmProductAssetReferenceInformation referenceInformation;

    public String getAuctionDate() {
        return auctionDate;
    }

    public CdmEventCommonCreditEvent auctionDate(String auctionDate) {
        this.auctionDate = auctionDate;
        return this;
    }

    public CdmEventCommonCreditEventTypeEnum getCreditEventType() {
        return creditEventType;
    }

    public CdmEventCommonCreditEvent creditEventType(CdmEventCommonCreditEventTypeEnum creditEventType) {
        this.creditEventType = creditEventType;
        return this;
    }

    public String getEventDeterminationDate() {
        return eventDeterminationDate;
    }

    public CdmEventCommonCreditEvent eventDeterminationDate(String eventDeterminationDate) {
        this.eventDeterminationDate = eventDeterminationDate;
        return this;
    }

    public CdmObservableAssetPrice getFinalPrice() {
        return finalPrice;
    }

    public CdmEventCommonCreditEvent finalPrice(CdmObservableAssetPrice finalPrice) {
        this.finalPrice = finalPrice;
        return this;
    }

    public List<CdmLegaldocumentationCommonResource> getPubliclyAvailableInformation() {
        return publiclyAvailableInformation;
    }

    public CdmEventCommonCreditEvent publiclyAvailableInformation(List<CdmLegaldocumentationCommonResource> publiclyAvailableInformation) {
        this.publiclyAvailableInformation = publiclyAvailableInformation;
        return this;
    }

    public Double getRecoveryPercent() {
        return recoveryPercent;
    }

    public CdmEventCommonCreditEvent recoveryPercent(Double recoveryPercent) {
        this.recoveryPercent = recoveryPercent;
        return this;
    }

    public CdmProductAssetReferenceInformation getReferenceInformation() {
        return referenceInformation;
    }

    public CdmEventCommonCreditEvent referenceInformation(CdmProductAssetReferenceInformation referenceInformation) {
        this.referenceInformation = referenceInformation;
        return this;
    }

}
