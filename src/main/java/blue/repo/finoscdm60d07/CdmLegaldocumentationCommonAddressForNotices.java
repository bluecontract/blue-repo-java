package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("5NxschaoZUezk2BPbZj7X7nhfYwLz97EWLXacfYbzGHh")
public class CdmLegaldocumentationCommonAddressForNotices {
    public static String blueId() {
        return "5NxschaoZUezk2BPbZj7X7nhfYwLz97EWLXacfYbzGHh";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/common/AddressForNotices";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/common/AddressForNotices";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationcommonAddressForNotices.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmBaseStaticdataPartyPartyContactInformation> additionalNotices;

    private CdmProductCollateralContactElection primaryNotices;

    public List<CdmBaseStaticdataPartyPartyContactInformation> getAdditionalNotices() {
        return additionalNotices;
    }

    public CdmLegaldocumentationCommonAddressForNotices additionalNotices(List<CdmBaseStaticdataPartyPartyContactInformation> additionalNotices) {
        this.additionalNotices = additionalNotices;
        return this;
    }

    public CdmProductCollateralContactElection getPrimaryNotices() {
        return primaryNotices;
    }

    public CdmLegaldocumentationCommonAddressForNotices primaryNotices(CdmProductCollateralContactElection primaryNotices) {
        this.primaryNotices = primaryNotices;
        return this;
    }

}
