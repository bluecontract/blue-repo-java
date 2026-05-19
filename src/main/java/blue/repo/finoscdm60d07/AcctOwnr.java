package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Gqg7WZRuhs8ro3HpZHkSGmiESQaAbNUvvooK44ooof9c")
public class AcctOwnr {
    public static String blueId() {
        return "Gqg7WZRuhs8ro3HpZHkSGmiESQaAbNUvvooK44ooof9c";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AcctOwnr";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AcctOwnr";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/AcctOwnr.json";
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

    private Id id;

    public String getNamespace() {
        return namespace;
    }

    public AcctOwnr namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Id getId() {
        return id;
    }

    public AcctOwnr id(Id id) {
        this.id = id;
        return this;
    }

}
