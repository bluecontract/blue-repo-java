package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("9nVLAxUae9w9gqhWUotMfMjkw5jNGjzuYyX3sHbXTb7F")
public class CdmProductCollateralContactElection {
    public static String blueId() {
        return "9nVLAxUae9w9gqhWUotMfMjkw5jNGjzuYyX3sHbXTb7F";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/ContactElection";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/ContactElection";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralContactElection.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmBaseStaticdataPartyPartyContactInformation> partyElection;

    public List<CdmBaseStaticdataPartyPartyContactInformation> getPartyElection() {
        return partyElection;
    }

    public CdmProductCollateralContactElection partyElection(List<CdmBaseStaticdataPartyPartyContactInformation> partyElection) {
        this.partyElection = partyElection;
        return this;
    }

}
