package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("B3buDnm28xTG8aoBoBwqgggjtMrcUY7LUTsK2511M1WY")
public class FieldWithMetaAccountTypeEnum {
    public static String blueId() {
        return "B3buDnm28xTG8aoBoBwqgggjtMrcUY7LUTsK2511M1WY";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaAccountTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaAccountTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FieldWithMetaAccountTypeEnum.json";
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

    private AccountTypeEnum val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaAccountTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaAccountTypeEnum meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public AccountTypeEnum getVal() {
        return val;
    }

    public FieldWithMetaAccountTypeEnum val(AccountTypeEnum val) {
        this.val = val;
        return this;
    }

}
