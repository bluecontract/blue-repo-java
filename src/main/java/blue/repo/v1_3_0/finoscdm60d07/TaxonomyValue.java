package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("6MsTYQ1tRfxz6pVUHtzspBQ2RnoHWM3BY5aMMm9dYmzy")
public class TaxonomyValue {
    public static String blueId() {
        return "6MsTYQ1tRfxz6pVUHtzspBQ2RnoHWM3BY5aMMm9dYmzy";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "TaxonomyValue";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/TaxonomyValue";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/TaxonomyValue.json";
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

    private List<TaxonomyClassification> classification;

    public String getNamespace() {
        return namespace;
    }

    public TaxonomyValue namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<TaxonomyClassification> getClassification() {
        return classification;
    }

    public TaxonomyValue classification(List<TaxonomyClassification> classification) {
        this.classification = classification;
        return this;
    }

}
