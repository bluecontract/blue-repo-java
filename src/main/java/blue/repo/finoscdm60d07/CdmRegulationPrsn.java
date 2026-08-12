package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("B3r27V8s3urUxxafaEH6UCBqmktZknuup57bqpUK1UV2")
public class CdmRegulationPrsn {
    public static String blueId() {
        return "B3r27V8s3urUxxafaEH6UCBqmktZknuup57bqpUK1UV2";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/regulation/Prsn";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/regulation/Prsn";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmregulationPrsn.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String ctryOfBrnch;

    private CdmRegulationOthr othr;

    public String getCtryOfBrnch() {
        return ctryOfBrnch;
    }

    public CdmRegulationPrsn ctryOfBrnch(String ctryOfBrnch) {
        this.ctryOfBrnch = ctryOfBrnch;
        return this;
    }

    public CdmRegulationOthr getOthr() {
        return othr;
    }

    public CdmRegulationPrsn othr(CdmRegulationOthr othr) {
        this.othr = othr;
        return this;
    }

}
