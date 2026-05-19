package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Ce8CijvABWhPsM7CZ4uru8uq4cEX3giReLi7en2CretD")
public class FieldWithMetaCreditSupportAgreementTypeEnum {
    public static String blueId() {
        return "Ce8CijvABWhPsM7CZ4uru8uq4cEX3giReLi7en2CretD";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaCreditSupportAgreementTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaCreditSupportAgreementTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FieldWithMetaCreditSupportAgreementTypeEnum.json";
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

    private CreditSupportAgreementTypeEnum val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaCreditSupportAgreementTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaCreditSupportAgreementTypeEnum meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CreditSupportAgreementTypeEnum getVal() {
        return val;
    }

    public FieldWithMetaCreditSupportAgreementTypeEnum val(CreditSupportAgreementTypeEnum val) {
        this.val = val;
        return this;
    }

}
