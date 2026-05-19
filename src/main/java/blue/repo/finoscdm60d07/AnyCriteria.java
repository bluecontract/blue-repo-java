package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("13dnfCzgrcyiuxjSxbhPqXTzsE4QnU66Ax7N6gZ5o4PQ#0")
public class AnyCriteria {
    public static String blueId() {
        return "13dnfCzgrcyiuxjSxbhPqXTzsE4QnU66Ax7N6gZ5o4PQ#0";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AnyCriteria";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AnyCriteria";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/AnyCriteria.json";
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

    private List<CollateralCriteria> anyCriteria;

    public String getNamespace() {
        return namespace;
    }

    public AnyCriteria namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<CollateralCriteria> getAnyCriteria() {
        return anyCriteria;
    }

    public AnyCriteria anyCriteria(List<CollateralCriteria> anyCriteria) {
        this.anyCriteria = anyCriteria;
        return this;
    }

}
