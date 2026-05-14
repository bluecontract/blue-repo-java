package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2DYCrXPadeXAPHqH3yJBqP2io5PoiHFfUeQHYTBM1Eh9")
public class FieldWithMetaMatrixTermEnum {
    public static String blueId() {
        return "2DYCrXPadeXAPHqH3yJBqP2io5PoiHFfUeQHYTBM1Eh9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaMatrixTermEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaMatrixTermEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FieldWithMetaMatrixTermEnum.json";
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

    private MatrixTermEnum val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaMatrixTermEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaMatrixTermEnum meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public MatrixTermEnum getVal() {
        return val;
    }

    public FieldWithMetaMatrixTermEnum val(MatrixTermEnum val) {
        this.val = val;
        return this;
    }

}
