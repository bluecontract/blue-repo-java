package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Gz5tYsMTrt5XDof69mtqpwuEdEBhQqCsuF9W49kUgDAB")
public class GoverningLawEnum {
    public static String blueId() {
        return "Gz5tYsMTrt5XDof69mtqpwuEdEBhQqCsuF9W49kUgDAB";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "GoverningLawEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/GoverningLawEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/GoverningLawEnum.json";
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

    public GoverningLawEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
