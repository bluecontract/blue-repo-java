package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GbULufXmoeMFxoHNGtvmQUqPmwnLY7caxb2TY3sKrRAR")
public class CdmRegulationTerm {
    public static String blueId() {
        return "GbULufXmoeMFxoHNGtvmQUqPmwnLY7caxb2TY3sKrRAR";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/regulation/Term";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/regulation/Term";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmregulationTerm.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String unit;

    private String val;

    public String getUnit() {
        return unit;
    }

    public CdmRegulationTerm unit(String unit) {
        this.unit = unit;
        return this;
    }

    public String getVal() {
        return val;
    }

    public CdmRegulationTerm val(String val) {
        this.val = val;
        return this;
    }

}
