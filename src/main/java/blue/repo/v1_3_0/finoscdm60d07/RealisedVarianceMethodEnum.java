package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BMHHytB9uJcQTToFmzaJTDmnkUxNkkskWcxr6SqJk3MH")
public class RealisedVarianceMethodEnum {
    public static String blueId() {
        return "BMHHytB9uJcQTToFmzaJTDmnkUxNkkskWcxr6SqJk3MH";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "RealisedVarianceMethodEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/RealisedVarianceMethodEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/RealisedVarianceMethodEnum.json";
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

    public RealisedVarianceMethodEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
