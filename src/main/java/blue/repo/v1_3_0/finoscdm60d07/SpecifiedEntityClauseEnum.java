package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3E6evyrnX18Ebiu7VdL838zSErfn6T3BZScpBeyp8Rxc")
public class SpecifiedEntityClauseEnum {
    public static String blueId() {
        return "3E6evyrnX18Ebiu7VdL838zSErfn6T3BZScpBeyp8Rxc";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SpecifiedEntityClauseEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SpecifiedEntityClauseEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/SpecifiedEntityClauseEnum.json";
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

    public SpecifiedEntityClauseEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
