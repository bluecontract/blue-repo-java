package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Hv9KX7MviT5eAPifaFJmzQMie9NGHeG75QHiLdHaP19E")
public class CdmRegulationFinInstrmGnlAttrbts {
    public static String blueId() {
        return "Hv9KX7MviT5eAPifaFJmzQMie9NGHeG75QHiLdHaP19E";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/regulation/FinInstrmGnlAttrbts";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/regulation/FinInstrmGnlAttrbts";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmregulationFinInstrmGnlAttrbts.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String clssfctnTp;

    private String fullNm;

    private String ntnlCcy;

    public String getClssfctnTp() {
        return clssfctnTp;
    }

    public CdmRegulationFinInstrmGnlAttrbts clssfctnTp(String clssfctnTp) {
        this.clssfctnTp = clssfctnTp;
        return this;
    }

    public String getFullNm() {
        return fullNm;
    }

    public CdmRegulationFinInstrmGnlAttrbts fullNm(String fullNm) {
        this.fullNm = fullNm;
        return this;
    }

    public String getNtnlCcy() {
        return ntnlCcy;
    }

    public CdmRegulationFinInstrmGnlAttrbts ntnlCcy(String ntnlCcy) {
        this.ntnlCcy = ntnlCcy;
        return this;
    }

}
