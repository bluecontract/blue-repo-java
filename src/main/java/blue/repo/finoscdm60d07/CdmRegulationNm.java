package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DeUy9Gx8hfmSbBuggzWeFwkCqa4EN3ExbHuTh5pjdM5V")
public class CdmRegulationNm {
    public static String blueId() {
        return "DeUy9Gx8hfmSbBuggzWeFwkCqa4EN3ExbHuTh5pjdM5V";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/regulation/Nm";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/regulation/Nm";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmregulationNm.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmRegulationRefRate refRate;

    private CdmRegulationTerm term;

    public CdmRegulationRefRate getRefRate() {
        return refRate;
    }

    public CdmRegulationNm refRate(CdmRegulationRefRate refRate) {
        this.refRate = refRate;
        return this;
    }

    public CdmRegulationTerm getTerm() {
        return term;
    }

    public CdmRegulationNm term(CdmRegulationTerm term) {
        this.term = term;
        return this;
    }

}
