package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Bthp8aQCk1VRrDotKenJT4NViERdsRb4C9bKu49EZNGS")
public class IndexEventConsequenceEnum {
    public static String blueId() {
        return "Bthp8aQCk1VRrDotKenJT4NViERdsRb4C9bKu49EZNGS";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "IndexEventConsequenceEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/IndexEventConsequenceEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/IndexEventConsequenceEnum.json";
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

    public IndexEventConsequenceEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
