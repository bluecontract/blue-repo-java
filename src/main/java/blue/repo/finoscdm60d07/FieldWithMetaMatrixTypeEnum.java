package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DvPgToRhfgp3jF13JRybdSgaSYXCEx2JyvzV7Gh52RzC")
public class FieldWithMetaMatrixTypeEnum {
    public static String blueId() {
        return "DvPgToRhfgp3jF13JRybdSgaSYXCEx2JyvzV7Gh52RzC";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaMatrixTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaMatrixTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FieldWithMetaMatrixTypeEnum.json";
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

    private MatrixTypeEnum val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaMatrixTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaMatrixTypeEnum meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public MatrixTypeEnum getVal() {
        return val;
    }

    public FieldWithMetaMatrixTypeEnum val(MatrixTypeEnum val) {
        this.val = val;
        return this;
    }

}
