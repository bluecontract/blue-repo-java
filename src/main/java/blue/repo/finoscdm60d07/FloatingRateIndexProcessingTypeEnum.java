package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EDZasowJjc9pAyh3M7kA8G2urtMzAuZ4cMhfzSZzM3wq")
public class FloatingRateIndexProcessingTypeEnum {
    public static String blueId() {
        return "EDZasowJjc9pAyh3M7kA8G2urtMzAuZ4cMhfzSZzM3wq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FloatingRateIndexProcessingTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FloatingRateIndexProcessingTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FloatingRateIndexProcessingTypeEnum.json";
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

    public FloatingRateIndexProcessingTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
