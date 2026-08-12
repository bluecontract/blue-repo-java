package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("774eqeqTPdD7YGYPSVTQQ7NNBf5v5z8n5MppuAhC84Ro")
public class CdmLegaldocumentationCommonResourceLength {
    public static String blueId() {
        return "774eqeqTPdD7YGYPSVTQQ7NNBf5v5z8n5MppuAhC84Ro";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/common/ResourceLength";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/common/ResourceLength";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationcommonResourceLength.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmLegaldocumentationCommonLengthUnitEnum lengthUnit;

    private Double lengthValue;

    public CdmLegaldocumentationCommonLengthUnitEnum getLengthUnit() {
        return lengthUnit;
    }

    public CdmLegaldocumentationCommonResourceLength lengthUnit(CdmLegaldocumentationCommonLengthUnitEnum lengthUnit) {
        this.lengthUnit = lengthUnit;
        return this;
    }

    public Double getLengthValue() {
        return lengthValue;
    }

    public CdmLegaldocumentationCommonResourceLength lengthValue(Double lengthValue) {
        this.lengthValue = lengthValue;
        return this;
    }

}
