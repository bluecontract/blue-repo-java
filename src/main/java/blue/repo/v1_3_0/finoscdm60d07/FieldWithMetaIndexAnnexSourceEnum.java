package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("B7cPXEFGrqyjYhJ6SgnsbRUZv9wrVx1mGL68zZXGh4Yq")
public class FieldWithMetaIndexAnnexSourceEnum {
    public static String blueId() {
        return "B7cPXEFGrqyjYhJ6SgnsbRUZv9wrVx1mGL68zZXGh4Yq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaIndexAnnexSourceEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaIndexAnnexSourceEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FieldWithMetaIndexAnnexSourceEnum.json";
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

    private IndexAnnexSourceEnum val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaIndexAnnexSourceEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaIndexAnnexSourceEnum meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public IndexAnnexSourceEnum getVal() {
        return val;
    }

    public FieldWithMetaIndexAnnexSourceEnum val(IndexAnnexSourceEnum val) {
        this.val = val;
        return this;
    }

}
