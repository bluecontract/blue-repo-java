package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("oTpGdJoCGs6bye7euLM5RaGh8sDGwEjdHJVFgCxiC6T")
public class FieldWithMetaBusinessCenterEnum {
    public static String blueId() {
        return "oTpGdJoCGs6bye7euLM5RaGh8sDGwEjdHJVFgCxiC6T";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaBusinessCenterEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaBusinessCenterEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FieldWithMetaBusinessCenterEnum.json";
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

    private BusinessCenterEnum val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaBusinessCenterEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaBusinessCenterEnum meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public BusinessCenterEnum getVal() {
        return val;
    }

    public FieldWithMetaBusinessCenterEnum val(BusinessCenterEnum val) {
        this.val = val;
        return this;
    }

}
