package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2xwAHyjVuSzA57dVQJAEcfr7Eg6P3Ms4XxwPwQwPQsAK")
public class CdmRegulationOthr {
    public static String blueId() {
        return "2xwAHyjVuSzA57dVQJAEcfr7Eg6P3Ms4XxwPwQwPQsAK";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/regulation/Othr";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/regulation/Othr";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmregulationOthr.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmRegulationDerivInstrmAttrbts derivInstrmAttrbts;

    private CdmRegulationFinInstrmGnlAttrbts finInstrmGnlAttrbts;

    private String id;

    private CdmRegulationSchmeNm schmeNm;

    public CdmRegulationDerivInstrmAttrbts getDerivInstrmAttrbts() {
        return derivInstrmAttrbts;
    }

    public CdmRegulationOthr derivInstrmAttrbts(CdmRegulationDerivInstrmAttrbts derivInstrmAttrbts) {
        this.derivInstrmAttrbts = derivInstrmAttrbts;
        return this;
    }

    public CdmRegulationFinInstrmGnlAttrbts getFinInstrmGnlAttrbts() {
        return finInstrmGnlAttrbts;
    }

    public CdmRegulationOthr finInstrmGnlAttrbts(CdmRegulationFinInstrmGnlAttrbts finInstrmGnlAttrbts) {
        this.finInstrmGnlAttrbts = finInstrmGnlAttrbts;
        return this;
    }

    public String getId() {
        return id;
    }

    public CdmRegulationOthr id(String id) {
        this.id = id;
        return this;
    }

    public CdmRegulationSchmeNm getSchmeNm() {
        return schmeNm;
    }

    public CdmRegulationOthr schmeNm(CdmRegulationSchmeNm schmeNm) {
        this.schmeNm = schmeNm;
        return this;
    }

}
