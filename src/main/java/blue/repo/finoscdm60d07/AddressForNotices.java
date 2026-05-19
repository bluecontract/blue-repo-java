package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("H7r9ighiov9fzMyR7CSbph4UX58oY94tXJQsVACb8af3")
public class AddressForNotices {
    public static String blueId() {
        return "H7r9ighiov9fzMyR7CSbph4UX58oY94tXJQsVACb8af3";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AddressForNotices";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AddressForNotices";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/AddressForNotices.json";
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

    private List<PartyContactInformation> additionalNotices;

    private ContactElection primaryNotices;

    public String getNamespace() {
        return namespace;
    }

    public AddressForNotices namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<PartyContactInformation> getAdditionalNotices() {
        return additionalNotices;
    }

    public AddressForNotices additionalNotices(List<PartyContactInformation> additionalNotices) {
        this.additionalNotices = additionalNotices;
        return this;
    }

    public ContactElection getPrimaryNotices() {
        return primaryNotices;
    }

    public AddressForNotices primaryNotices(ContactElection primaryNotices) {
        this.primaryNotices = primaryNotices;
        return this;
    }

}
