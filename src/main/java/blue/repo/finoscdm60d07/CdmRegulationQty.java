package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6LfAdgL3H4Evj6cxAmHvohUbKGvi8hMjCW2VA7FCmp2f")
public class CdmRegulationQty {
    public static String blueId() {
        return "6LfAdgL3H4Evj6cxAmHvohUbKGvi8hMjCW2VA7FCmp2f";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/regulation/Qty";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/regulation/Qty";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmregulationQty.json";
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

    public String getUnit() {
        return unit;
    }

    public CdmRegulationQty unit(String unit) {
        this.unit = unit;
        return this;
    }

}
