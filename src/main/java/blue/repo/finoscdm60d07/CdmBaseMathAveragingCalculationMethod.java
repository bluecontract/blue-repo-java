package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2EzRuguKzzQR2u8dtQqTXe7ATvUruro1jyD4Hc8MHaJk")
public class CdmBaseMathAveragingCalculationMethod {
    public static String blueId() {
        return "2EzRuguKzzQR2u8dtQqTXe7ATvUruro1jyD4Hc8MHaJk";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/math/AveragingCalculationMethod";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/math/AveragingCalculationMethod";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasemathAveragingCalculationMethod.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseMathAveragingCalculationMethodEnum calculationMethod;

    private Boolean isWeighted;

    public CdmBaseMathAveragingCalculationMethodEnum getCalculationMethod() {
        return calculationMethod;
    }

    public CdmBaseMathAveragingCalculationMethod calculationMethod(CdmBaseMathAveragingCalculationMethodEnum calculationMethod) {
        this.calculationMethod = calculationMethod;
        return this;
    }

    public Boolean getIsWeighted() {
        return isWeighted;
    }

    public CdmBaseMathAveragingCalculationMethod isWeighted(Boolean isWeighted) {
        this.isWeighted = isWeighted;
        return this;
    }

}
