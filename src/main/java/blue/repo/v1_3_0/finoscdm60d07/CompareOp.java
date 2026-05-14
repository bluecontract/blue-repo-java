package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("KhcLR5b8VTtiyTn5g8EcbavZGZyEsUZVTarAC6KLmSA")
public class CompareOp {
    public static String blueId() {
        return "KhcLR5b8VTtiyTn5g8EcbavZGZyEsUZVTarAC6KLmSA";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CompareOp";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CompareOp";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CompareOp.json";
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

    public CompareOp namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
