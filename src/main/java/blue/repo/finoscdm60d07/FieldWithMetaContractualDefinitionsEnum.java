package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("t93oTquqSBuW9ND69UgcErUQAho8dsS7QHNdKcYxLuK")
public class FieldWithMetaContractualDefinitionsEnum {
    public static String blueId() {
        return "t93oTquqSBuW9ND69UgcErUQAho8dsS7QHNdKcYxLuK";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaContractualDefinitionsEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaContractualDefinitionsEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FieldWithMetaContractualDefinitionsEnum.json";
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

    private ContractualDefinitionsEnum val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaContractualDefinitionsEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaContractualDefinitionsEnum meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public ContractualDefinitionsEnum getVal() {
        return val;
    }

    public FieldWithMetaContractualDefinitionsEnum val(ContractualDefinitionsEnum val) {
        this.val = val;
        return this;
    }

}
