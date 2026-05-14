package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("A7qKmdj1LMNNDjUPjcSkcUA3CaREe64eBDtwa19rhcKR")
public class FieldWithMetaSettlementRateOptionEnum {
    public static String blueId() {
        return "A7qKmdj1LMNNDjUPjcSkcUA3CaREe64eBDtwa19rhcKR";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaSettlementRateOptionEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaSettlementRateOptionEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FieldWithMetaSettlementRateOptionEnum.json";
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

    private SettlementRateOptionEnum val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaSettlementRateOptionEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaSettlementRateOptionEnum meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public SettlementRateOptionEnum getVal() {
        return val;
    }

    public FieldWithMetaSettlementRateOptionEnum val(SettlementRateOptionEnum val) {
        this.val = val;
        return this;
    }

}
