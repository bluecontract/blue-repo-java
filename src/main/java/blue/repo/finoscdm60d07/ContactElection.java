package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("GV8qTYBfX23MVvcWgY3AHc6mgsGL94nKTXDCQW2NNxSa")
public class ContactElection {
    public static String blueId() {
        return "GV8qTYBfX23MVvcWgY3AHc6mgsGL94nKTXDCQW2NNxSa";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ContactElection";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ContactElection";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ContactElection.json";
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

    private List<PartyContactInformation> partyElection;

    public String getNamespace() {
        return namespace;
    }

    public ContactElection namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<PartyContactInformation> getPartyElection() {
        return partyElection;
    }

    public ContactElection partyElection(List<PartyContactInformation> partyElection) {
        this.partyElection = partyElection;
        return this;
    }

}
