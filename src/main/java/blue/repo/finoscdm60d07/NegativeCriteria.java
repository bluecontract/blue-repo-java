package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("13dnfCzgrcyiuxjSxbhPqXTzsE4QnU66Ax7N6gZ5o4PQ#2")
public class NegativeCriteria {
    public static String blueId() {
        return "13dnfCzgrcyiuxjSxbhPqXTzsE4QnU66Ax7N6gZ5o4PQ#2";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "NegativeCriteria";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/NegativeCriteria";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/NegativeCriteria.json";
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

    private CollateralCriteria negativeCriteria;

    public String getNamespace() {
        return namespace;
    }

    public NegativeCriteria namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CollateralCriteria getNegativeCriteria() {
        return negativeCriteria;
    }

    public NegativeCriteria negativeCriteria(CollateralCriteria negativeCriteria) {
        this.negativeCriteria = negativeCriteria;
        return this;
    }

}
