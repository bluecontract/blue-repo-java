package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3b2Yi5p1JBZG8mKqg3KwA4577e7QJ4UM2ygn8JfLfgYh")
public class TaxonomySourceEnum {
    public static String blueId() {
        return "3b2Yi5p1JBZG8mKqg3KwA4577e7QJ4UM2ygn8JfLfgYh";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "TaxonomySourceEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/TaxonomySourceEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/TaxonomySourceEnum.json";
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

    public String getNamespace() {
        return namespace;
    }

    public TaxonomySourceEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
