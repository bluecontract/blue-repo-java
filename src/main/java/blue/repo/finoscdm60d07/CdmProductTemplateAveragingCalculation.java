package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8c8jodXTXZTXGtEBBCLNdZGym3ZQYVbB5FZcWZCRXJ8i")
public class CdmProductTemplateAveragingCalculation {
    public static String blueId() {
        return "8c8jodXTXZTXGtEBBCLNdZGym3ZQYVbB5FZcWZCRXJ8i";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/AveragingCalculation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/AveragingCalculation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateAveragingCalculation.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseMathAveragingCalculationMethod averagingMethod;

    private CdmBaseMathRounding precision;

    public CdmBaseMathAveragingCalculationMethod getAveragingMethod() {
        return averagingMethod;
    }

    public CdmProductTemplateAveragingCalculation averagingMethod(CdmBaseMathAveragingCalculationMethod averagingMethod) {
        this.averagingMethod = averagingMethod;
        return this;
    }

    public CdmBaseMathRounding getPrecision() {
        return precision;
    }

    public CdmProductTemplateAveragingCalculation precision(CdmBaseMathRounding precision) {
        this.precision = precision;
        return this;
    }

}
