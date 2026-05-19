package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9fpD6N2d3FujbayQcgvMGatPq3Juz9PTsvQHpVGoEAEd")
public class Qty {
    public static String blueId() {
        return "9fpD6N2d3FujbayQcgvMGatPq3Juz9PTsvQHpVGoEAEd";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Qty";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Qty";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Qty.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    private String unit;

    public String getNamespace() {
        return namespace;
    }

    public Qty namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getUnit() {
        return unit;
    }

    public Qty unit(String unit) {
        this.unit = unit;
        return this;
    }

}
