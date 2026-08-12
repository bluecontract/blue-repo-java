package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6semmaRGbbwZi3WuvBjGtUDnUF52hRjzYmrBnaSzyuBQ")
public class CdmBaseMathNonNegativeStep {
    public static String blueId() {
        return "6semmaRGbbwZi3WuvBjGtUDnUF52hRjzYmrBnaSzyuBQ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/math/NonNegativeStep";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/math/NonNegativeStep";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasemathNonNegativeStep.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String stepDate;

    private Double stepValue;

    public String getStepDate() {
        return stepDate;
    }

    public CdmBaseMathNonNegativeStep stepDate(String stepDate) {
        this.stepDate = stepDate;
        return this;
    }

    public Double getStepValue() {
        return stepValue;
    }

    public CdmBaseMathNonNegativeStep stepValue(Double stepValue) {
        this.stepValue = stepValue;
        return this;
    }

}
