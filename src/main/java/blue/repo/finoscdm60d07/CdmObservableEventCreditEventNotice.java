package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("6CHwZncrbE252GMkntXjA6NPmPA2w12w8REc7sGB5aNq")
public class CdmObservableEventCreditEventNotice {
    public static String blueId() {
        return "6CHwZncrbE252GMkntXjA6NPmPA2w12w8REc7sGB5aNq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/event/CreditEventNotice";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/event/CreditEventNotice";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableeventCreditEventNotice.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeBusinessCenterEnum businessCenter;

    private List<CdmBaseStaticdataPartyCounterpartyRoleEnum> notifyingParty;

    private CdmObservableEventPubliclyAvailableInformation publiclyAvailableInformation;

    public CdmBaseDatetimeBusinessCenterEnum getBusinessCenter() {
        return businessCenter;
    }

    public CdmObservableEventCreditEventNotice businessCenter(CdmBaseDatetimeBusinessCenterEnum businessCenter) {
        this.businessCenter = businessCenter;
        return this;
    }

    public List<CdmBaseStaticdataPartyCounterpartyRoleEnum> getNotifyingParty() {
        return notifyingParty;
    }

    public CdmObservableEventCreditEventNotice notifyingParty(List<CdmBaseStaticdataPartyCounterpartyRoleEnum> notifyingParty) {
        this.notifyingParty = notifyingParty;
        return this;
    }

    public CdmObservableEventPubliclyAvailableInformation getPubliclyAvailableInformation() {
        return publiclyAvailableInformation;
    }

    public CdmObservableEventCreditEventNotice publiclyAvailableInformation(CdmObservableEventPubliclyAvailableInformation publiclyAvailableInformation) {
        this.publiclyAvailableInformation = publiclyAvailableInformation;
        return this;
    }

}
