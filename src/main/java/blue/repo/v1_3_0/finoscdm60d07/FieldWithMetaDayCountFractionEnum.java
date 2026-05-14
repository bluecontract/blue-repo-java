package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("En4do7p5Vp9jSGvut9A1xsbPPYWUdhS2F3Vs8Di6eVcf")
public class FieldWithMetaDayCountFractionEnum {
    public static String blueId() {
        return "En4do7p5Vp9jSGvut9A1xsbPPYWUdhS2F3Vs8Di6eVcf";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaDayCountFractionEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaDayCountFractionEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FieldWithMetaDayCountFractionEnum.json";
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

    private MetaFields meta;

    private DayCountFractionEnum val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaDayCountFractionEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaDayCountFractionEnum meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public DayCountFractionEnum getVal() {
        return val;
    }

    public FieldWithMetaDayCountFractionEnum val(DayCountFractionEnum val) {
        this.val = val;
        return this;
    }

}
