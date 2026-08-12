package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5KinhVtR3ea8RNSGWHbur4fEos6Bk4w7H1D3saRXnHjv")
public class CdmBaseMathMeasureBase {
    public static String blueId() {
        return "5KinhVtR3ea8RNSGWHbur4fEos6Bk4w7H1D3saRXnHjv";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/math/MeasureBase";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/math/MeasureBase";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasemathMeasureBase.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseMathUnitType unit;

    private Double val;

    public CdmBaseMathUnitType getUnit() {
        return unit;
    }

    public CdmBaseMathMeasureBase unit(CdmBaseMathUnitType unit) {
        this.unit = unit;
        return this;
    }

    public Double getVal() {
        return val;
    }

    public CdmBaseMathMeasureBase val(Double val) {
        this.val = val;
        return this;
    }

}
