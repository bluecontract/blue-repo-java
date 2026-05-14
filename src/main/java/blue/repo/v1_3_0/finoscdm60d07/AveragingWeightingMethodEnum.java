package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CC4kSfF5JDFz7R16zeEbriPrLPA4HGyo1LESmdD6KVQs")
public class AveragingWeightingMethodEnum {
    public static String blueId() {
        return "CC4kSfF5JDFz7R16zeEbriPrLPA4HGyo1LESmdD6KVQs";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AveragingWeightingMethodEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AveragingWeightingMethodEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/AveragingWeightingMethodEnum.json";
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

    public AveragingWeightingMethodEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
