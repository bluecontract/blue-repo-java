package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("ApXQcSpV6jtWmN6xUv5URn79UghuL7AbxsY9UJZP8jgn")
public class FieldWithMetaGoverningLawEnum {
    public static String blueId() {
        return "ApXQcSpV6jtWmN6xUv5URn79UghuL7AbxsY9UJZP8jgn";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaGoverningLawEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaGoverningLawEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FieldWithMetaGoverningLawEnum.json";
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

    private GoverningLawEnum val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaGoverningLawEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaGoverningLawEnum meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public GoverningLawEnum getVal() {
        return val;
    }

    public FieldWithMetaGoverningLawEnum val(GoverningLawEnum val) {
        this.val = val;
        return this;
    }

}
