package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9QEEP3vJftxGgridJuAvcaKfZusGZVsywkfLzikwpM28")
public class CdmBaseMathDatedValue {
    public static String blueId() {
        return "9QEEP3vJftxGgridJuAvcaKfZusGZVsywkfLzikwpM28";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/math/DatedValue";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/math/DatedValue";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasemathDatedValue.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String date;

    private Double val;

    public String getDate() {
        return date;
    }

    public CdmBaseMathDatedValue date(String date) {
        this.date = date;
        return this;
    }

    public Double getVal() {
        return val;
    }

    public CdmBaseMathDatedValue val(Double val) {
        this.val = val;
        return this;
    }

}
