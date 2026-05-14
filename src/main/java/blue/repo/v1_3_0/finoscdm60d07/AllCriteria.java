package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("13dnfCzgrcyiuxjSxbhPqXTzsE4QnU66Ax7N6gZ5o4PQ#3")
public class AllCriteria {
    public static String blueId() {
        return "13dnfCzgrcyiuxjSxbhPqXTzsE4QnU66Ax7N6gZ5o4PQ#3";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AllCriteria";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AllCriteria";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/AllCriteria.json";
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

    private List<CollateralCriteria> allCriteria;

    public String getNamespace() {
        return namespace;
    }

    public AllCriteria namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<CollateralCriteria> getAllCriteria() {
        return allCriteria;
    }

    public AllCriteria allCriteria(List<CollateralCriteria> allCriteria) {
        this.allCriteria = allCriteria;
        return this;
    }

}
