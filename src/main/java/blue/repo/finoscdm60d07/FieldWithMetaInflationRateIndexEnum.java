package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FVc2EgR1nGAzFFL1eTJ9VANWCyawmQUogMSwonoMyRzR")
public class FieldWithMetaInflationRateIndexEnum {
    public static String blueId() {
        return "FVc2EgR1nGAzFFL1eTJ9VANWCyawmQUogMSwonoMyRzR";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaInflationRateIndexEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaInflationRateIndexEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FieldWithMetaInflationRateIndexEnum.json";
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

    private InflationRateIndexEnum val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaInflationRateIndexEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaInflationRateIndexEnum meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public InflationRateIndexEnum getVal() {
        return val;
    }

    public FieldWithMetaInflationRateIndexEnum val(InflationRateIndexEnum val) {
        this.val = val;
        return this;
    }

}
