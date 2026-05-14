package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8HxGXBgYZPyirVyritWo12kVT2cL8N2ZjWmPRVFZXMRZ")
public class CalculationPeriodBase {
    public static String blueId() {
        return "8HxGXBgYZPyirVyritWo12kVT2cL8N2ZjWmPRVFZXMRZ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CalculationPeriodBase";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CalculationPeriodBase";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CalculationPeriodBase.json";
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

    private String adjustedEndDate;

    private String adjustedStartDate;

    public String getNamespace() {
        return namespace;
    }

    public CalculationPeriodBase namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getAdjustedEndDate() {
        return adjustedEndDate;
    }

    public CalculationPeriodBase adjustedEndDate(String adjustedEndDate) {
        this.adjustedEndDate = adjustedEndDate;
        return this;
    }

    public String getAdjustedStartDate() {
        return adjustedStartDate;
    }

    public CalculationPeriodBase adjustedStartDate(String adjustedStartDate) {
        this.adjustedStartDate = adjustedStartDate;
        return this;
    }

}
