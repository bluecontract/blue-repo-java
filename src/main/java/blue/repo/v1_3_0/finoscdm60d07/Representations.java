package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FJMPQCybMRSwF2N5UZaHJi336ZBSmqpFxmiCBtQLR3md")
public class Representations {
    public static String blueId() {
        return "FJMPQCybMRSwF2N5UZaHJi336ZBSmqpFxmiCBtQLR3md";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Representations";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Representations";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Representations.json";
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

    public Representations namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
