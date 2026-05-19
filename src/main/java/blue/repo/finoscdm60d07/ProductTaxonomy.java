package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("DYoMzSxReXdTdJREBY3NeaBTb4h2yj9hGNLA3YQskMbM")
public class ProductTaxonomy {
    public static String blueId() {
        return "DYoMzSxReXdTdJREBY3NeaBTb4h2yj9hGNLA3YQskMbM";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ProductTaxonomy";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ProductTaxonomy";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ProductTaxonomy.json";
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

    private FieldWithMetaAssetClassEnum primaryAssetClass;

    private String productQualifier;

    private List<FieldWithMetaAssetClassEnum> secondaryAssetClass;

    private TaxonomySourceEnum source;

    private TaxonomyValue val;

    public String getNamespace() {
        return namespace;
    }

    public ProductTaxonomy namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FieldWithMetaAssetClassEnum getPrimaryAssetClass() {
        return primaryAssetClass;
    }

    public ProductTaxonomy primaryAssetClass(FieldWithMetaAssetClassEnum primaryAssetClass) {
        this.primaryAssetClass = primaryAssetClass;
        return this;
    }

    public String getProductQualifier() {
        return productQualifier;
    }

    public ProductTaxonomy productQualifier(String productQualifier) {
        this.productQualifier = productQualifier;
        return this;
    }

    public List<FieldWithMetaAssetClassEnum> getSecondaryAssetClass() {
        return secondaryAssetClass;
    }

    public ProductTaxonomy secondaryAssetClass(List<FieldWithMetaAssetClassEnum> secondaryAssetClass) {
        this.secondaryAssetClass = secondaryAssetClass;
        return this;
    }

    public TaxonomySourceEnum getSource() {
        return source;
    }

    public ProductTaxonomy source(TaxonomySourceEnum source) {
        this.source = source;
        return this;
    }

    public TaxonomyValue getVal() {
        return val;
    }

    public ProductTaxonomy val(TaxonomyValue val) {
        this.val = val;
        return this;
    }

}
