package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("92HySvWQAe2gED9tK5uZ29wUcxtdCkQ2bQesuPxH5sd2")
public class SwpOut {
    public static String blueId() {
        return "92HySvWQAe2gED9tK5uZ29wUcxtdCkQ2bQesuPxH5sd2";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SwpOut";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SwpOut";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/SwpOut.json";
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

    public SwpOut namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Sngl getSngl() {
        return sngl;
    }

    public SwpOut sngl(Sngl sngl) {
        this.sngl = sngl;
        return this;
    }

}
