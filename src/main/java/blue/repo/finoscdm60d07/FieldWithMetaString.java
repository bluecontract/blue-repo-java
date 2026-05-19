package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DkAAYuMhrcUQRrFdCEPKwcQDCnee3rxTu6vYVSURpWWY")
public class FieldWithMetaString {
    public static String blueId() {
        return "DkAAYuMhrcUQRrFdCEPKwcQDCnee3rxTu6vYVSURpWWY";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaString";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaString";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FieldWithMetaString.json";
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

    private String val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaString namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaString meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public String getVal() {
        return val;
    }

    public FieldWithMetaString val(String val) {
        this.val = val;
        return this;
    }

}
