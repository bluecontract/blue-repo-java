package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4fcVABrnTSjQ5yxLgpXUb3rGeF9Bcz6JjECQ4GyMSsgy")
public class FieldWithMetaMarketDisruptionEnum {
    public static String blueId() {
        return "4fcVABrnTSjQ5yxLgpXUb3rGeF9Bcz6JjECQ4GyMSsgy";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaMarketDisruptionEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaMarketDisruptionEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FieldWithMetaMarketDisruptionEnum.json";
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

    private MarketDisruptionEnum val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaMarketDisruptionEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaMarketDisruptionEnum meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public MarketDisruptionEnum getVal() {
        return val;
    }

    public FieldWithMetaMarketDisruptionEnum val(MarketDisruptionEnum val) {
        this.val = val;
        return this;
    }

}
