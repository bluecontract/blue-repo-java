package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Dn12c2Sfj1hmoE5M8rBoda3bm6zetvLg7jH6mgHdEnZv")
public class FieldWithMetaInterpolationMethodEnum {
    public static String blueId() {
        return "Dn12c2Sfj1hmoE5M8rBoda3bm6zetvLg7jH6mgHdEnZv";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaInterpolationMethodEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaInterpolationMethodEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FieldWithMetaInterpolationMethodEnum.json";
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

    private InterpolationMethodEnum val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaInterpolationMethodEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaInterpolationMethodEnum meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public InterpolationMethodEnum getVal() {
        return val;
    }

    public FieldWithMetaInterpolationMethodEnum val(InterpolationMethodEnum val) {
        this.val = val;
        return this;
    }

}
