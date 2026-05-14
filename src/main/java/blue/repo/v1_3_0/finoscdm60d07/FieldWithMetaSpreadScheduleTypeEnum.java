package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8nxPn6ytb7bcpHS3EsKSHxAexnYSJuX5m3ov7V2PsEgM")
public class FieldWithMetaSpreadScheduleTypeEnum {
    public static String blueId() {
        return "8nxPn6ytb7bcpHS3EsKSHxAexnYSJuX5m3ov7V2PsEgM";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaSpreadScheduleTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaSpreadScheduleTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FieldWithMetaSpreadScheduleTypeEnum.json";
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

    private SpreadScheduleTypeEnum val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaSpreadScheduleTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaSpreadScheduleTypeEnum meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public SpreadScheduleTypeEnum getVal() {
        return val;
    }

    public FieldWithMetaSpreadScheduleTypeEnum val(SpreadScheduleTypeEnum val) {
        this.val = val;
        return this;
    }

}
