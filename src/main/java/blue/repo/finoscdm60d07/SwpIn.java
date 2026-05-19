package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FDXa6MNEXro9TN3qC5eM1ACUsxYKDgUs4Kftj77DyG5K")
public class SwpIn {
    public static String blueId() {
        return "FDXa6MNEXro9TN3qC5eM1ACUsxYKDgUs4Kftj77DyG5K";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SwpIn";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SwpIn";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/SwpIn.json";
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

    private Sngl sngl;

    public String getNamespace() {
        return namespace;
    }

    public SwpIn namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Sngl getSngl() {
        return sngl;
    }

    public SwpIn sngl(Sngl sngl) {
        this.sngl = sngl;
        return this;
    }

}
