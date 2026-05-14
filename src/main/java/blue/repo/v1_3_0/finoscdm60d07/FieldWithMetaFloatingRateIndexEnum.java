package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6UqK1hMXBKkwQRczdakVZrrBPaYxWdkaUojM8M69CSx3")
public class FieldWithMetaFloatingRateIndexEnum {
    public static String blueId() {
        return "6UqK1hMXBKkwQRczdakVZrrBPaYxWdkaUojM8M69CSx3";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaFloatingRateIndexEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaFloatingRateIndexEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FieldWithMetaFloatingRateIndexEnum.json";
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

    private FloatingRateIndexEnum val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaFloatingRateIndexEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaFloatingRateIndexEnum meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public FloatingRateIndexEnum getVal() {
        return val;
    }

    public FieldWithMetaFloatingRateIndexEnum val(FloatingRateIndexEnum val) {
        this.val = val;
        return this;
    }

}
