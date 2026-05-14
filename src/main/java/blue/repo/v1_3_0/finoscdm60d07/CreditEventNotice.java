package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("4mZY5zrMek1PsVE7h1BTYCEbzN5gi6QPG1mvsNFsbL1P")
public class CreditEventNotice {
    public static String blueId() {
        return "4mZY5zrMek1PsVE7h1BTYCEbzN5gi6QPG1mvsNFsbL1P";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CreditEventNotice";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CreditEventNotice";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CreditEventNotice.json";
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

    private BusinessCenterEnum businessCenter;

    private List<CounterpartyRoleEnum> notifyingParty;

    private PubliclyAvailableInformation publiclyAvailableInformation;

    public String getNamespace() {
        return namespace;
    }

    public CreditEventNotice namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public BusinessCenterEnum getBusinessCenter() {
        return businessCenter;
    }

    public CreditEventNotice businessCenter(BusinessCenterEnum businessCenter) {
        this.businessCenter = businessCenter;
        return this;
    }

    public List<CounterpartyRoleEnum> getNotifyingParty() {
        return notifyingParty;
    }

    public CreditEventNotice notifyingParty(List<CounterpartyRoleEnum> notifyingParty) {
        this.notifyingParty = notifyingParty;
        return this;
    }

    public PubliclyAvailableInformation getPubliclyAvailableInformation() {
        return publiclyAvailableInformation;
    }

    public CreditEventNotice publiclyAvailableInformation(PubliclyAvailableInformation publiclyAvailableInformation) {
        this.publiclyAvailableInformation = publiclyAvailableInformation;
        return this;
    }

}
