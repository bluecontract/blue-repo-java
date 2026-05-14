package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("35oFQcLcDw4DJvxu2AWweNWurTaTGU7w3knMvAzZcNHs")
public class CollateralValuationTreatment {
    public static String blueId() {
        return "35oFQcLcDw4DJvxu2AWweNWurTaTGU7w3knMvAzZcNHs";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CollateralValuationTreatment";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CollateralValuationTreatment";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CollateralValuationTreatment.json";
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

    private Double additionalHaircutPercentage;

    private Double fxHaircutPercentage;

    private Double haircutPercentage;

    private Double marginPercentage;

    public String getNamespace() {
        return namespace;
    }

    public CollateralValuationTreatment namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Double getAdditionalHaircutPercentage() {
        return additionalHaircutPercentage;
    }

    public CollateralValuationTreatment additionalHaircutPercentage(Double additionalHaircutPercentage) {
        this.additionalHaircutPercentage = additionalHaircutPercentage;
        return this;
    }

    public Double getFxHaircutPercentage() {
        return fxHaircutPercentage;
    }

    public CollateralValuationTreatment fxHaircutPercentage(Double fxHaircutPercentage) {
        this.fxHaircutPercentage = fxHaircutPercentage;
        return this;
    }

    public Double getHaircutPercentage() {
        return haircutPercentage;
    }

    public CollateralValuationTreatment haircutPercentage(Double haircutPercentage) {
        this.haircutPercentage = haircutPercentage;
        return this;
    }

    public Double getMarginPercentage() {
        return marginPercentage;
    }

    public CollateralValuationTreatment marginPercentage(Double marginPercentage) {
        this.marginPercentage = marginPercentage;
        return this;
    }

}
