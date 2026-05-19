package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("A9NtaYhUV7GKu4cZ6H5E3xCMhLya3yFF91mk1FYZ3Lsb")
public class FieldWithMetaCommodityReferencePriceEnum {
    public static String blueId() {
        return "A9NtaYhUV7GKu4cZ6H5E3xCMhLya3yFF91mk1FYZ3Lsb";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaCommodityReferencePriceEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaCommodityReferencePriceEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FieldWithMetaCommodityReferencePriceEnum.json";
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

    private CommodityReferencePriceEnum val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaCommodityReferencePriceEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaCommodityReferencePriceEnum meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CommodityReferencePriceEnum getVal() {
        return val;
    }

    public FieldWithMetaCommodityReferencePriceEnum val(CommodityReferencePriceEnum val) {
        this.val = val;
        return this;
    }

}
