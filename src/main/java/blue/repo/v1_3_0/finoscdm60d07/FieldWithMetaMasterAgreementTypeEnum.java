package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3kM8TG6eYoWE4KWCGBACMt6YA1my77RH9MFKdBrmvSwA")
public class FieldWithMetaMasterAgreementTypeEnum {
    public static String blueId() {
        return "3kM8TG6eYoWE4KWCGBACMt6YA1my77RH9MFKdBrmvSwA";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaMasterAgreementTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaMasterAgreementTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FieldWithMetaMasterAgreementTypeEnum.json";
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

    private MasterAgreementTypeEnum val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaMasterAgreementTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaMasterAgreementTypeEnum meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public MasterAgreementTypeEnum getVal() {
        return val;
    }

    public FieldWithMetaMasterAgreementTypeEnum val(MasterAgreementTypeEnum val) {
        this.val = val;
        return this;
    }

}
