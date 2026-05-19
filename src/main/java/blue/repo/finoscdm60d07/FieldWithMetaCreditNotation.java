package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DXsaX1KbqE5VWMYyCGeB3shFCZ92PQso5Vqevd5Bu6sW")
public class FieldWithMetaCreditNotation {
    public static String blueId() {
        return "DXsaX1KbqE5VWMYyCGeB3shFCZ92PQso5Vqevd5Bu6sW";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaCreditNotation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaCreditNotation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FieldWithMetaCreditNotation.json";
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

    private CreditNotation val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaCreditNotation namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaCreditNotation meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CreditNotation getVal() {
        return val;
    }

    public FieldWithMetaCreditNotation val(CreditNotation val) {
        this.val = val;
        return this;
    }

}
