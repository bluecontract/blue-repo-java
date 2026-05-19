package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("F53FK8FmZbRvA3FdzPhh7a2KwsZD9iXWUfKiJ7jefC3F")
public class CreditEvent {
    public static String blueId() {
        return "F53FK8FmZbRvA3FdzPhh7a2KwsZD9iXWUfKiJ7jefC3F";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CreditEvent";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CreditEvent";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CreditEvent.json";
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

    private String auctionDate;

    private CreditEventTypeEnum creditEventType;

    private String eventDeterminationDate;

    private Price finalPrice;

    private List<Resource> publiclyAvailableInformation;

    private Double recoveryPercent;

    private ReferenceInformation referenceInformation;

    public String getNamespace() {
        return namespace;
    }

    public CreditEvent namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getAuctionDate() {
        return auctionDate;
    }

    public CreditEvent auctionDate(String auctionDate) {
        this.auctionDate = auctionDate;
        return this;
    }

    public CreditEventTypeEnum getCreditEventType() {
        return creditEventType;
    }

    public CreditEvent creditEventType(CreditEventTypeEnum creditEventType) {
        this.creditEventType = creditEventType;
        return this;
    }

    public String getEventDeterminationDate() {
        return eventDeterminationDate;
    }

    public CreditEvent eventDeterminationDate(String eventDeterminationDate) {
        this.eventDeterminationDate = eventDeterminationDate;
        return this;
    }

    public Price getFinalPrice() {
        return finalPrice;
    }

    public CreditEvent finalPrice(Price finalPrice) {
        this.finalPrice = finalPrice;
        return this;
    }

    public List<Resource> getPubliclyAvailableInformation() {
        return publiclyAvailableInformation;
    }

    public CreditEvent publiclyAvailableInformation(List<Resource> publiclyAvailableInformation) {
        this.publiclyAvailableInformation = publiclyAvailableInformation;
        return this;
    }

    public Double getRecoveryPercent() {
        return recoveryPercent;
    }

    public CreditEvent recoveryPercent(Double recoveryPercent) {
        this.recoveryPercent = recoveryPercent;
        return this;
    }

    public ReferenceInformation getReferenceInformation() {
        return referenceInformation;
    }

    public CreditEvent referenceInformation(ReferenceInformation referenceInformation) {
        this.referenceInformation = referenceInformation;
        return this;
    }

}
