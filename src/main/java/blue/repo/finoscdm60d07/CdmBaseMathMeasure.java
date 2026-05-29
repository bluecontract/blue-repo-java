package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AEQQZFaozyoKC3MBxy64bi4HpEtBak48DE6atPK1bYC1")
public class CdmBaseMathMeasure {
    public static String blueId() {
        return "AEQQZFaozyoKC3MBxy64bi4HpEtBak48DE6atPK1bYC1";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/math/Measure";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/math/Measure";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasemathMeasure.json";
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

    public CdmBaseMathMeasure unit(CdmBaseMathUnitType unit) {
        this.unit = unit;
        return this;
    }

    public Double getVal() {
        return val;
    }

    public CdmBaseMathMeasure val(Double val) {
        this.val = val;
        return this;
    }

}
