package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BhBinYsiWtW4KDb4LGnC6GdwMfc2RHw8pZCGk1P2XCC5")
public class FieldWithMetaEntityTypeEnum {
    public static String blueId() {
        return "BhBinYsiWtW4KDb4LGnC6GdwMfc2RHw8pZCGk1P2XCC5";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaEntityTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaEntityTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FieldWithMetaEntityTypeEnum.json";
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

    private EntityTypeEnum val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaEntityTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaEntityTypeEnum meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public EntityTypeEnum getVal() {
        return val;
    }

    public FieldWithMetaEntityTypeEnum val(EntityTypeEnum val) {
        this.val = val;
        return this;
    }

}
