package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4yZFhh4YdtU9ckEuXhg1V9U1Gx6VsnrMUfoMA7zVJmeZ")
public class FieldWithMetaLimitLevelEnum {
    public static String blueId() {
        return "4yZFhh4YdtU9ckEuXhg1V9U1Gx6VsnrMUfoMA7zVJmeZ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaLimitLevelEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaLimitLevelEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FieldWithMetaLimitLevelEnum.json";
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

    private LimitLevelEnum val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaLimitLevelEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaLimitLevelEnum meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public LimitLevelEnum getVal() {
        return val;
    }

    public FieldWithMetaLimitLevelEnum val(LimitLevelEnum val) {
        this.val = val;
        return this;
    }

}
