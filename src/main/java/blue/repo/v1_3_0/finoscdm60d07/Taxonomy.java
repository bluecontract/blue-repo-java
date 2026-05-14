package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HFNW44RszHHmv3rZU8MyQULFubFmMwmZvmNHgpUek4vb")
public class Taxonomy {
    public static String blueId() {
        return "HFNW44RszHHmv3rZU8MyQULFubFmMwmZvmNHgpUek4vb";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Taxonomy";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Taxonomy";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Taxonomy.json";
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

    private TaxonomySourceEnum source;

    private TaxonomyValue val;

    public String getNamespace() {
        return namespace;
    }

    public Taxonomy namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public TaxonomySourceEnum getSource() {
        return source;
    }

    public Taxonomy source(TaxonomySourceEnum source) {
        this.source = source;
        return this;
    }

    public TaxonomyValue getVal() {
        return val;
    }

    public Taxonomy val(TaxonomyValue val) {
        this.val = val;
        return this;
    }

}
