package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("D47eyKS7yewPVC5jUEbouYutWpSrDF1kdJ1AVrcHsRd4")
public class CdmRegulationBuyr {
    public static String blueId() {
        return "D47eyKS7yewPVC5jUEbouYutWpSrDF1kdJ1AVrcHsRd4";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/regulation/Buyr";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/regulation/Buyr";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmregulationBuyr.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmRegulationAcctOwnr acctOwnr;

    public CdmRegulationAcctOwnr getAcctOwnr() {
        return acctOwnr;
    }

    public CdmRegulationBuyr acctOwnr(CdmRegulationAcctOwnr acctOwnr) {
        this.acctOwnr = acctOwnr;
        return this;
    }

}
