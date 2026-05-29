package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("6QJPBRQ2jy9t4PXjUJ2Z8HB4HNtXM4iwKtw1V5xgtsii")
public class CdmBaseMathSchedule {
    public static String blueId() {
        return "6QJPBRQ2jy9t4PXjUJ2Z8HB4HNtXM4iwKtw1V5xgtsii";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/math/Schedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/math/Schedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasemathSchedule.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmBaseMathDatedValue> datedValue;

    private Double val;

    public List<CdmBaseMathDatedValue> getDatedValue() {
        return datedValue;
    }

    public CdmBaseMathSchedule datedValue(List<CdmBaseMathDatedValue> datedValue) {
        this.datedValue = datedValue;
        return this;
    }

    public Double getVal() {
        return val;
    }

    public CdmBaseMathSchedule val(Double val) {
        this.val = val;
        return this;
    }

}
