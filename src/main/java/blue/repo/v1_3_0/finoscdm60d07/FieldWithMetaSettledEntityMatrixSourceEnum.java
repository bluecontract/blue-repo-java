package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("D9HbQeEgmNuGgZ99VL3iEWVVdZheUPa759m36Un9Ai3d")
public class FieldWithMetaSettledEntityMatrixSourceEnum {
    public static String blueId() {
        return "D9HbQeEgmNuGgZ99VL3iEWVVdZheUPa759m36Un9Ai3d";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaSettledEntityMatrixSourceEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaSettledEntityMatrixSourceEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FieldWithMetaSettledEntityMatrixSourceEnum.json";
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

    private SettledEntityMatrixSourceEnum val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaSettledEntityMatrixSourceEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaSettledEntityMatrixSourceEnum meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public SettledEntityMatrixSourceEnum getVal() {
        return val;
    }

    public FieldWithMetaSettledEntityMatrixSourceEnum val(SettledEntityMatrixSourceEnum val) {
        this.val = val;
        return this;
    }

}
