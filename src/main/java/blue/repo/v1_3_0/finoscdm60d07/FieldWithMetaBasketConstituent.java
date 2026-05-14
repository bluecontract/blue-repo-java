package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HmwDrGtkX4d8yqFFhZcJNkbkgcXFGEXgdLe8hyq1RLcU#0")
public class FieldWithMetaBasketConstituent {
    public static String blueId() {
        return "HmwDrGtkX4d8yqFFhZcJNkbkgcXFGEXgdLe8hyq1RLcU#0";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaBasketConstituent";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaBasketConstituent";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FieldWithMetaBasketConstituent.json";
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

    private BasketConstituent val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaBasketConstituent namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaBasketConstituent meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public BasketConstituent getVal() {
        return val;
    }

    public FieldWithMetaBasketConstituent val(BasketConstituent val) {
        this.val = val;
        return this;
    }

}
