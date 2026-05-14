package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5GFPaD82z2LbVL33J4ZX8XDYF2uvRtCVbQh4eCYjsGH9")
public class FieldWithMetaNonNegativeQuantitySchedule {
    public static String blueId() {
        return "5GFPaD82z2LbVL33J4ZX8XDYF2uvRtCVbQh4eCYjsGH9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaNonNegativeQuantitySchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaNonNegativeQuantitySchedule";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FieldWithMetaNonNegativeQuantitySchedule.json";
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

    private NonNegativeQuantitySchedule val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaNonNegativeQuantitySchedule namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaNonNegativeQuantitySchedule meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public NonNegativeQuantitySchedule getVal() {
        return val;
    }

    public FieldWithMetaNonNegativeQuantitySchedule val(NonNegativeQuantitySchedule val) {
        this.val = val;
        return this;
    }

}
