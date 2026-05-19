package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("89wwdBE3w6Xk3AHM1Sa8ee4AtX8zBUL55vTdSLwGgnYQ")
public class FieldWithMetaRestructuringEnum {
    public static String blueId() {
        return "89wwdBE3w6Xk3AHM1Sa8ee4AtX8zBUL55vTdSLwGgnYQ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaRestructuringEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaRestructuringEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FieldWithMetaRestructuringEnum.json";
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

    private RestructuringEnum val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaRestructuringEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaRestructuringEnum meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public RestructuringEnum getVal() {
        return val;
    }

    public FieldWithMetaRestructuringEnum val(RestructuringEnum val) {
        this.val = val;
        return this;
    }

}
