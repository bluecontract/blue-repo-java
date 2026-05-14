package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HVq6QEShaXeAnmgRyBUsn3Gyp6Vhp6pgdgscJVT2jtiR")
public class FieldWithMetaTimeZone {
    public static String blueId() {
        return "HVq6QEShaXeAnmgRyBUsn3Gyp6Vhp6pgdgscJVT2jtiR";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaTimeZone";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaTimeZone";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FieldWithMetaTimeZone.json";
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

    private TimeZone val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaTimeZone namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaTimeZone meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public TimeZone getVal() {
        return val;
    }

    public FieldWithMetaTimeZone val(TimeZone val) {
        this.val = val;
        return this;
    }

}
