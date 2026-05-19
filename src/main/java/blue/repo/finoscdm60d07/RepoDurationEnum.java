package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Enk7HhXc3HUWy9tC8LyHWdvidvaS4uxQf9aD1Xzfc9m7")
public class RepoDurationEnum {
    public static String blueId() {
        return "Enk7HhXc3HUWy9tC8LyHWdvidvaS4uxQf9aD1Xzfc9m7";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "RepoDurationEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/RepoDurationEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/RepoDurationEnum.json";
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

    public RepoDurationEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
