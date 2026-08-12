package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("2G3a7NgdwHUsNXY8WY6afyVj2ex78kmSBZ7yfp58JGaA")
public class CdmProductCollateralContactElection {
    public static String blueId() {
        return "2G3a7NgdwHUsNXY8WY6afyVj2ex78kmSBZ7yfp58JGaA";
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
