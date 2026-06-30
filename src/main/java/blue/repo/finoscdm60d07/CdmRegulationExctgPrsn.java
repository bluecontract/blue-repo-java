package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Tu5nRRqGCYvPv1JfDkUiceaDiRxNSCT7gT7SQx2GA5Z")
public class CdmRegulationExctgPrsn {
    public static String blueId() {
        return "Tu5nRRqGCYvPv1JfDkUiceaDiRxNSCT7gT7SQx2GA5Z";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/regulation/ExctgPrsn";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/regulation/ExctgPrsn";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmregulationExctgPrsn.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmRegulationPrsn prsn;

    public CdmRegulationPrsn getPrsn() {
        return prsn;
    }

    public CdmRegulationExctgPrsn prsn(CdmRegulationPrsn prsn) {
        this.prsn = prsn;
        return this;
    }

}
