package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5m4z1eZMpKGmooKirwMo4tkq4ekSjiYYBWxeRVQQDAbh")
public class FieldWithMetaContractualSupplementTypeEnum {
    public static String blueId() {
        return "5m4z1eZMpKGmooKirwMo4tkq4ekSjiYYBWxeRVQQDAbh";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaContractualSupplementTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaContractualSupplementTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FieldWithMetaContractualSupplementTypeEnum.json";
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

    private ContractualSupplementTypeEnum val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaContractualSupplementTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaContractualSupplementTypeEnum meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public ContractualSupplementTypeEnum getVal() {
        return val;
    }

    public FieldWithMetaContractualSupplementTypeEnum val(ContractualSupplementTypeEnum val) {
        this.val = val;
        return this;
    }

}
