package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("D8uP5LJXUFTKyAG3mfHD1szhNTs8Gq8mFJbrrFvbiFdF")
public class CollateralTaxonomy {
    public static String blueId() {
        return "D8uP5LJXUFTKyAG3mfHD1szhNTs8Gq8mFJbrrFvbiFdF";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CollateralTaxonomy";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CollateralTaxonomy";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CollateralTaxonomy.json";
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

    private TaxonomySourceEnum taxonomySource;

    private CollateralTaxonomyValue taxonomyValue;

    public String getNamespace() {
        return namespace;
    }

    public CollateralTaxonomy namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public TaxonomySourceEnum getTaxonomySource() {
        return taxonomySource;
    }

    public CollateralTaxonomy taxonomySource(TaxonomySourceEnum taxonomySource) {
        this.taxonomySource = taxonomySource;
        return this;
    }

    public CollateralTaxonomyValue getTaxonomyValue() {
        return taxonomyValue;
    }

    public CollateralTaxonomy taxonomyValue(CollateralTaxonomyValue taxonomyValue) {
        this.taxonomyValue = taxonomyValue;
        return this;
    }

}
