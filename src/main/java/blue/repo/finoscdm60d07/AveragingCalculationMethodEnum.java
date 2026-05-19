package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Af4ukUNfokeiHedA9qLDFzs5gQ77WuHi64DD3TV4Z1hW")
public class AveragingCalculationMethodEnum {
    public static String blueId() {
        return "Af4ukUNfokeiHedA9qLDFzs5gQ77WuHi64DD3TV4Z1hW";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AveragingCalculationMethodEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AveragingCalculationMethodEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/AveragingCalculationMethodEnum.json";
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

    public AveragingCalculationMethodEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
