package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7A981htiHGkchGH5G7U7UKu3JYvzH9oZmfusdFu685Nh")
public class UndrlygInstrm {
    public static String blueId() {
        return "7A981htiHGkchGH5G7U7UKu3JYvzH9oZmfusdFu685Nh";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "UndrlygInstrm";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/UndrlygInstrm";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/UndrlygInstrm.json";
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

    private Swp swp;

    public String getNamespace() {
        return namespace;
    }

    public UndrlygInstrm namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Swp getSwp() {
        return swp;
    }

    public UndrlygInstrm swp(Swp swp) {
        this.swp = swp;
        return this;
    }

}
