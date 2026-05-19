package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Hfmza42w5rfAH5NdtsFayJV1mjMQQu8n8oab5gNvXzH6")
public class FieldWithMetaCreditLimitTypeEnum {
    public static String blueId() {
        return "Hfmza42w5rfAH5NdtsFayJV1mjMQQu8n8oab5gNvXzH6";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaCreditLimitTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaCreditLimitTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FieldWithMetaCreditLimitTypeEnum.json";
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

    private CreditLimitTypeEnum val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaCreditLimitTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaCreditLimitTypeEnum meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CreditLimitTypeEnum getVal() {
        return val;
    }

    public FieldWithMetaCreditLimitTypeEnum val(CreditLimitTypeEnum val) {
        this.val = val;
        return this;
    }

}
