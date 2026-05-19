package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DaGEPkk25fwLDMfqeRknXCGC4nvxbBKhgzAP3MCgtXgf")
public class FieldWithMetaQuotedCurrencyPair {
    public static String blueId() {
        return "DaGEPkk25fwLDMfqeRknXCGC4nvxbBKhgzAP3MCgtXgf";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaQuotedCurrencyPair";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaQuotedCurrencyPair";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FieldWithMetaQuotedCurrencyPair.json";
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

    private QuotedCurrencyPair val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaQuotedCurrencyPair namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaQuotedCurrencyPair meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public QuotedCurrencyPair getVal() {
        return val;
    }

    public FieldWithMetaQuotedCurrencyPair val(QuotedCurrencyPair val) {
        this.val = val;
        return this;
    }

}
