package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4cFiSgJCaBAsmVTzpJNgfJQbRG5Y1LNAyjW8FF4xmJLr")
public class Indx {
    public static String blueId() {
        return "4cFiSgJCaBAsmVTzpJNgfJQbRG5Y1LNAyjW8FF4xmJLr";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Indx";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Indx";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Indx.json";
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

    private Nm nm;

    public String getNamespace() {
        return namespace;
    }

    public Indx namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Nm getNm() {
        return nm;
    }

    public Indx nm(Nm nm) {
        this.nm = nm;
        return this;
    }

}
