package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GzWUZXmQbs3TPTEbj5nra4bvUecUBxyujn33h4TYMhmE")
public class FieldWithMetaResourceTypeEnum {
    public static String blueId() {
        return "GzWUZXmQbs3TPTEbj5nra4bvUecUBxyujn33h4TYMhmE";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaResourceTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaResourceTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FieldWithMetaResourceTypeEnum.json";
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

    private ResourceTypeEnum val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaResourceTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaResourceTypeEnum meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public ResourceTypeEnum getVal() {
        return val;
    }

    public FieldWithMetaResourceTypeEnum val(ResourceTypeEnum val) {
        this.val = val;
        return this;
    }

}
