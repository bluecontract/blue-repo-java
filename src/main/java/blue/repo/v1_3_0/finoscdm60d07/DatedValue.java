package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7888m5Pj75TZM8EopkeMnKhKBTVVQk4XKcRS1i3TPhEu")
public class DatedValue {
    public static String blueId() {
        return "7888m5Pj75TZM8EopkeMnKhKBTVVQk4XKcRS1i3TPhEu";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DatedValue";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DatedValue";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/DatedValue.json";
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

    private String date;

    private Double val;

    public String getNamespace() {
        return namespace;
    }

    public DatedValue namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getDate() {
        return date;
    }

    public DatedValue date(String date) {
        this.date = date;
        return this;
    }

    public Double getVal() {
        return val;
    }

    public DatedValue val(Double val) {
        this.val = val;
        return this;
    }

}
