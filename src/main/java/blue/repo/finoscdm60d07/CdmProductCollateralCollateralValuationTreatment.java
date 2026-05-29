package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6jPEeuHYwc7SYkDRExZS37FF7KdHg9uaHEasdRpFFvGN")
public class CdmProductCollateralCollateralValuationTreatment {
    public static String blueId() {
        return "6jPEeuHYwc7SYkDRExZS37FF7KdHg9uaHEasdRpFFvGN";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/CollateralValuationTreatment";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/CollateralValuationTreatment";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralCollateralValuationTreatment.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Double additionalHaircutPercentage;

    private Double fxHaircutPercentage;

    private Double haircutPercentage;

    private Double marginPercentage;

    public Double getAdditionalHaircutPercentage() {
        return additionalHaircutPercentage;
    }

    public CdmProductCollateralCollateralValuationTreatment additionalHaircutPercentage(Double additionalHaircutPercentage) {
        this.additionalHaircutPercentage = additionalHaircutPercentage;
        return this;
    }

    public Double getFxHaircutPercentage() {
        return fxHaircutPercentage;
    }

    public CdmProductCollateralCollateralValuationTreatment fxHaircutPercentage(Double fxHaircutPercentage) {
        this.fxHaircutPercentage = fxHaircutPercentage;
        return this;
    }

    public Double getHaircutPercentage() {
        return haircutPercentage;
    }

    public CdmProductCollateralCollateralValuationTreatment haircutPercentage(Double haircutPercentage) {
        this.haircutPercentage = haircutPercentage;
        return this;
    }

    public Double getMarginPercentage() {
        return marginPercentage;
    }

    public CdmProductCollateralCollateralValuationTreatment marginPercentage(Double marginPercentage) {
        this.marginPercentage = marginPercentage;
        return this;
    }

}
